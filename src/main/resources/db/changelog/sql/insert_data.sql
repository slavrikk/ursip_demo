insert into dictionary_value(id, name, sort_order)
values ('ad998861-1cc7-4e4a-a01a-32743860a04b', 'dict_1', 'DESC');
insert into dictionary_value(id, name, sort_order)
values ('778b6d62-3ac2-4827-9a48-749eb8bcdc44', 'dict_2', 'ASC');

insert into document(id, date)
values ('6986534b-204e-4646-ba19-51df485fc5bf', current_timestamp);
insert into document(id, date)
values ('8f6d2d65-a2b8-4302-90aa-1e21ed8938ef', current_timestamp);

insert into test_entity(id, test_name, document_id, dictionary_id)
values ('09b79a41-cd15-409d-9b43-d2d7d71ba3e3', 'test_1', '6986534b-204e-4646-ba19-51df485fc5bf',
        '778b6d62-3ac2-4827-9a48-749eb8bcdc44');