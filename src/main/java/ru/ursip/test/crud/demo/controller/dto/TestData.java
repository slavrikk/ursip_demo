package ru.ursip.test.crud.demo.controller.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class TestData {

    private UUID id;
    private String name;
    private DocumentData documentData;
    private DictionaryData dictionaryData;
}
