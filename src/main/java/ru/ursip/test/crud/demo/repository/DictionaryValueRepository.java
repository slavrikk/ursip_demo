package ru.ursip.test.crud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ursip.test.crud.demo.entity.DictionaryValueEntity;

import java.util.UUID;

public interface DictionaryValueRepository extends JpaRepository<DictionaryValueEntity, UUID> {
}
