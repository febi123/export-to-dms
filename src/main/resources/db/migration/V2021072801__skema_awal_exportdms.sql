create table pending_export_dms(
    id char(36),
    survey_periode_id char(36),
    created_date DATETIME,
    status_id int,
    note TEXT,
    primary key(id)
);