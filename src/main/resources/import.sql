
drop table if exists user;
drop table if exists hotel;
-- TODO: Hard coded user creation in SQL script
CREATE USER ADMIN PASSWORD 'password@1';

create table user (id int primary key auto_increment, username varchar, firstName varchar, lastName varchar, password varchar);

insert into user (username, firstName, lastName, password)
values ('DonJuan', 'Juan', 'Don', 'password@1');
