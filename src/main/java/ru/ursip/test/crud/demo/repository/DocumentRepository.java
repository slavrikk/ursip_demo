package ru.ursip.test.crud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ursip.test.crud.demo.entity.DocumentEntity;

import java.util.UUID;

public interface DocumentRepository extends JpaRepository<DocumentEntity, UUID> {
}
