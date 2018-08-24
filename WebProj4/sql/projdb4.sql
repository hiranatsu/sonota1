drop database if exists projdb4;
create database projdb4;
use projdb4;

create table users(
user_id int primary key auto_increment,
user_name varchar(255),
password varchar(255)
);

insert into users values(1,"moe","123");
insert into users values(2,"kota","456");
insert into users values(3,"azusa","789");

create table inquiry(
name varchar(255),
qtype varchar(255),
body varchar(255)
);