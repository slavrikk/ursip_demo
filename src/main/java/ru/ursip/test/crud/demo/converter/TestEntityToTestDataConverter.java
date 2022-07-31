package ru.ursip.test.crud.demo.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.ursip.test.crud.demo.controller.dto.DictionaryData;
import ru.ursip.test.crud.demo.controller.dto.DocumentData;
import ru.ursip.test.crud.demo.controller.dto.TestData;
import ru.ursip.test.crud.demo.entity.TestEntity;

@Component
public class TestEntityToTestDataConverter implements Converter<TestEntity, TestData> {

    @Override
    public TestData convert(TestEntity source) {
        TestData testData = new TestData();
        testData.setId(source.getId());
        testData.setName(source.getTestName());
        if (source.getDocument() != null) {
            DocumentData documentData = new DocumentData();
            documentData.setId(source.getDocument().getId());
            documentData.setDate(source.getDocument().getDate());
            testData.setDocumentData(documentData);
        }
        if (source.getDictionary() != null) {
            DictionaryData dictionaryData = new DictionaryData();
            dictionaryData.setId(source.getId());
            dictionaryData.setSortOrder(source.getDictionary().getSortOrder());
            dictionaryData.setDictionaryValueName(source.getDictionary().getDictionaryValueName());
            testData.setDictionaryData(dictionaryData);
        }

        return testData;
    }
}
