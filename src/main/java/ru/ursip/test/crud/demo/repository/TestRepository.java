package ru.ursip.test.crud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ursip.test.crud.demo.entity.TestEntity;

import java.util.UUID;

public interface TestRepository extends JpaRepository<TestEntity, UUID> {
}
