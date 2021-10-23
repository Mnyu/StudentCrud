create table students
(
    id int
        constraint students_pk
            primary key,
    name text not null,
    mobile bigint,
    country text
);


INSERT INTO students (id, name, mobile, country) VALUES (1, 'Sudhir', 9876543201, 'India');
INSERT INTO students (id, name, mobile, country) VALUES (2, 'Som', 9752163112, 'US');
INSERT INTO students (id, name, mobile, country) VALUES (3, 'Krishna', 9865214103, 'India');
INSERT INTO students (id, name, mobile, country) VALUES (4, 'Justin', 6847521462, 'UK');