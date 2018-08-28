drop database if exists projdb5;
create database projdb5;
use projdb5;

create table users(
user_id int primary key auto_increment,
user_name varchar(255),
password varchar(255)
);


insert into users values(1,"sato","123");
insert into users values(2,"hirai","456");
insert into users values(3,"kojima","789");

create table inquiry(
name varchar(255),
qtype varchar(255),
body varchar(255)
);