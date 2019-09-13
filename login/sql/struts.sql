set names utf8;
set foreign_key_checks=0;
drop database if exists logindb_kurita;
create database logindb_kurita;
use logindb_kurita;

create table user(
id int,
user_name varchar(255),
password varchar(255));

insert into user values
(1,"taro","123"),
(2,"jiro","260"),
(3,"hanako","875"),
(4,"saburo","326");