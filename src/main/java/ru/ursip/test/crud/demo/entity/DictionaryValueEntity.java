package ru.ursip.test.crud.demo.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import ru.ursip.test.crud.demo.util.SortOrder;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "dictionary_value")
@Data
public class DictionaryValueEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "name")
    private String dictionaryValueName;

    @Column(name = "sort_order")
    @Enumerated(EnumType.STRING)
    private SortOrder sortOrder;
}
