package ru.ursip.test.crud.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ursip.test.crud.demo.controller.dto.IdUuid;
import ru.ursip.test.crud.demo.controller.dto.TestData;
import ru.ursip.test.crud.demo.controller.dto.TestDataOperation;
import ru.ursip.test.crud.demo.service.TestService;

import java.util.UUID;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/{id}")
    private ResponseEntity<TestData> getTestById(@PathVariable UUID id) {
        return ResponseEntity.ok(testService.getById(id));
    }

    @PostMapping()
    private ResponseEntity<IdUuid> create(@RequestBody TestDataOperation data) {
        return ResponseEntity.ok(testService.create(data));
    }

    @PatchMapping("/{id}")
    private ResponseEntity<String> update(@PathVariable UUID id, @RequestBody TestDataOperation data) {
        testService.update(id, data);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<String> delete(@PathVariable UUID id) {
        testService.delete(id);
        return ResponseEntity.ok().build();
    }
}
