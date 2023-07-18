docker exec -it mysql /bin/bash

mysql -uroot -p

show databases;

use book;

select * from book.user;

# 常见处理

CREATE DATABASE IF NOT EXISTS book DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

USE book;

CREATE TABLE user (
  id bigint NOT NULL COMMENT 'id',
  username varchar(50) NOT NULL COMMENT '用户名',
  mobile varchar(20) NOT NULL COMMENT '手机号',
  password varchar(64) COMMENT '密码',
  create_date datetime COMMENT '创建时间',
  PRIMARY KEY (id),
  UNIQUE INDEX (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户';


INSERT INTO user (id, username, mobile, password, create_date) VALUES (1067246875900000001, 'mark', '13612345678', '8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918', now());
