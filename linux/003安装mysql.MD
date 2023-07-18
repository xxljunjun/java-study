### 安装mysql
```js
 docker pull mysql:8.0.26
```

### 创建mysql容器
```
docker run \
--restart=always \
--privileged=true \
-p 3306:3306 --name mysql \
-v /mydata/mysql/log:/var/log/mysql \
-v /mydata/mysql/data:/var/lib/mysql \
-v /mydata/mysql/conf:/etc/mysql \
-e MYSQL_ROOT_PASSWORD=root \
-d mysql:8.0.26
```

### 进入mysql容器
```
docker exec -it mysql /bin/bash
```

### 设置my.conf：vim /mydata/mysql/conf/my.conf
```
[mysqld]
user=mysql
character-set-server=utf8
default_authentication_plugin=mysql_native_password
secure_file_priv=/var/lib/mysql
expire_logs_days=7
sql_mode=STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION
max_connections=1000
wait_timeout=604800
interactive_timeout=31536000
bind-address = 0.0.0.0
default-time_zone = '+8:00'

[client]
default-character-set=utf8

[mysql]
default-character-set=utf8

```

### 数据库多次连接报错:清除
```
mysql>flush hosts
```

### 修改密码
```js
//修改密码
mysql>flush privileges;
mysql>ALTER USER 'root'@'localhost' IDENTIFIED BY 'root';
```

### root用户连接不上
```
create user 'root'@'%' identified with mysql_native_password by 'root';
grant all privileges on *.* to 'root'@'%' with grant option;
ALTER USER 'root'@'%' IDENTIFIED BY 'root' PASSWORD EXPIRE NEVER;
flush privileges;
```

### 项目连接
```
url:jdbc:mysql://47.102.216.222:3306/book?useUnicode=true&useSSL=false&characterEncoding=UTF-8&serverTimezone=UTC
GMT
GMT%2B8
UTC
```