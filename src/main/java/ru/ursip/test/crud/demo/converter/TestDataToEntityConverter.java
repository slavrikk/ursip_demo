package ru.ursip.test.crud.demo.converter;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.ursip.test.crud.demo.controller.dto.TestDataOperation;
import ru.ursip.test.crud.demo.entity.TestEntity;
import ru.ursip.test.crud.demo.repository.DictionaryValueRepository;
import ru.ursip.test.crud.demo.repository.DocumentRepository;

@Component
@RequiredArgsConstructor
public class TestDataToEntityConverter implements Converter<TestDataOperation, TestEntity> {

    private final DictionaryValueRepository dictionaryRepository;
    private final DocumentRepository documentRepository;

    @Override
    public TestEntity convert(TestDataOperation source) {
        TestEntity testEntity = new TestEntity();
        testEntity.setTestName(source.getName());

        testEntity.setDocument(documentRepository.findById(source.getDocumentId())
                .orElseThrow());

        testEntity.setDictionary(dictionaryRepository.findById(source.getDictionaryValueId())
                .orElseThrow());
        return testEntity;
    }
}
