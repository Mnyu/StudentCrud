create table students
(
    id serial
        constraint students_pk
            primary key,
    name text not null,
    mobile bigint,
    country text
);


INSERT INTO students (name, mobile, country) VALUES ('Sudhir', 9876543201, 'India');
INSERT INTO students (name, mobile, country) VALUES ('Som', 9752163112, 'US');
INSERT INTO students (name, mobile, country) VALUES ('Krishna', 9865214103, 'India');
INSERT INTO students (name, mobile, country) VALUES ('Justin', 6847521462, 'UK');


