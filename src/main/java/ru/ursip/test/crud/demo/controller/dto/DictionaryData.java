package ru.ursip.test.crud.demo.controller.dto;

import lombok.Data;
import ru.ursip.test.crud.demo.util.SortOrder;

import java.util.UUID;

@Data
public class DictionaryData {
    private UUID id;
    private String dictionaryValueName;
    private SortOrder sortOrder;
}
