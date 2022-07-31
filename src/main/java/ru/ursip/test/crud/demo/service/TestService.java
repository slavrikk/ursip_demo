package ru.ursip.test.crud.demo.service;

import ru.ursip.test.crud.demo.controller.dto.IdUuid;
import ru.ursip.test.crud.demo.controller.dto.TestData;
import ru.ursip.test.crud.demo.controller.dto.TestDataOperation;

import java.util.UUID;

public interface TestService {

    TestData getById(UUID id);

    IdUuid create(TestDataOperation dataOperation);

    void update(UUID id, TestDataOperation dataOperation);

    void delete(UUID id);

}
