### 四个地方的卸载mysql
+ 右击电脑，选择管理，关掉mysql进程
+ 控制面板删除
+ 数据库的数据data删除
+ 删除环境变量
+ （可选）删除注册表
+重启电脑

### 安装mysql
+ 四个版本社区版本、企业版本、集群版本、高级集群版本
```
mysql-installer-community-5.7.34.0
mysql-installer-community-8.0.26.0
```
+ http://www.mysql.com
+ mysql可视化工具MySQL Workbench
+ Root  New123#
+ 报错需要
+ mysql --vewsion
```修改密码
flush privileges;
ALTER USER 'root'@'localhost' IDENTIFIED BY 'mysql';
```

### 安装可视化操作数据库navicat
+ 可视化数据库