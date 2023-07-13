### mysql8.0.26
+ 踩坑：映射文件
```
docker pull mysql:8.0.26

docker run \
--restart=always \
--privileged=true \
-p 3306:3306 --name mysql \
-v /mydata/mysql/log:/var/log/mysql \
-v /mydata/mysql/data:/var/lib/mysql \
-v /mydata/mysql/conf:/etc/mysql \
-e MYSQL_ROOT_PASSWORD=root \
-d mysql:8.0.26

vim /mydata/mysql/conf/my.conf

[mysqld]
user=mysql
character-set-server=utf8
default_authentication_plugin=mysql_native_password
secure_file_priv=/var/lib/mysql
expire_logs_days=7
sql_mode=STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION
max_connections=1000

[client]
default-character-set=utf8

[mysql]
default-character-set=utf8

```

docker start 容器id
docker rm -f <containerid>   //删除容器
docker rmi -f allen_mysql:5.7  //删除镜像