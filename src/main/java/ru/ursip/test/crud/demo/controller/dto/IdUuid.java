package ru.ursip.test.crud.demo.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class IdUuid {
    private UUID id;
}
