create table dictionary_value
(
    id         uuid         not null,
    name       varchar(100) not null,
    sort_order varchar(50),
    constraint dictionary_value_id primary key (id)
);

create table document
(
    id   uuid      not null,
    date timestamp not null,
    constraint document_id primary key (id)
);

create table test_entity
(
    id            uuid         not null,
    test_name     varchar(100) not null default 'Test',
    document_id   uuid,
    dictionary_id uuid,
    constraint test_entity_id primary key (id),
    foreign key (document_id) references document (id),
    foreign key (dictionary_id) references dictionary_value (id)
);
