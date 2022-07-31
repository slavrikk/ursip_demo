package ru.ursip.test.crud.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ursip.test.crud.demo.controller.dto.IdUuid;
import ru.ursip.test.crud.demo.controller.dto.TestData;
import ru.ursip.test.crud.demo.controller.dto.TestDataOperation;
import ru.ursip.test.crud.demo.entity.DictionaryValueEntity;
import ru.ursip.test.crud.demo.entity.DocumentEntity;
import ru.ursip.test.crud.demo.entity.TestEntity;
import ru.ursip.test.crud.demo.repository.DictionaryValueRepository;
import ru.ursip.test.crud.demo.repository.DocumentRepository;
import ru.ursip.test.crud.demo.repository.TestRepository;

import java.util.Objects;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;
    private final DictionaryValueRepository dictionaryValueRepository;
    private final DocumentRepository documentRepository;
    private final ConversionService conversionService;

    @Override
    @Transactional(readOnly = true)
    public TestData getById(UUID id) {
        TestEntity entity = testRepository.findById(id).orElseThrow();
        return conversionService.convert(entity, TestData.class);
    }

    @Override
    @Transactional
    public IdUuid create(TestDataOperation dataOperation) {
        TestEntity entity = conversionService.convert(dataOperation, TestEntity.class);
        testRepository.save(Objects.requireNonNull(entity));
        return new IdUuid(entity.getId());
    }

    @Override
    @Transactional
    public void update(UUID id, TestDataOperation dataOperation) {
        TestEntity testEntity = testRepository.findById(id)
                .orElseThrow();
        testEntity.setTestName(dataOperation.getName() != null ? dataOperation.getName() : testEntity.getTestName());
        if (dataOperation.getDictionaryValueId() != null) {
            DictionaryValueEntity entity = dictionaryValueRepository.findById(dataOperation.getDictionaryValueId())
                    .orElseThrow();
            testEntity.setDictionary(entity);
        }
        if (dataOperation.getDocumentId() != null) {
            DocumentEntity entity = documentRepository.findById(dataOperation.getDocumentId())
                    .orElseThrow();
            testEntity.setDocument(entity);
        }
    }

    @Override
    @Transactional
    public void delete(UUID id) {
        testRepository.deleteById(id);
    }
}
