package ru.ursip.test.crud.demo.controller.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class DocumentData {

    private UUID id;
    private LocalDateTime date;
}
