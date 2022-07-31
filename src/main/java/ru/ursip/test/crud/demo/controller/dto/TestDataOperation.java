package ru.ursip.test.crud.demo.controller.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class TestDataOperation {

    private String name;
    private UUID documentId;
    private UUID dictionaryValueId;

}
