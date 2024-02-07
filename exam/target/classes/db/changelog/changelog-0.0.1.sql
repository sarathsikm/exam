CREATE TABLE employee_details(
    emp_id               uuid not null primary key,
    full_name            varchar(255),
    designation         varchar(255),
    mobile              varchar(255),
    email               varchar(255),
    date_of_birth       date

);
