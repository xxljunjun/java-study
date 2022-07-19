### mysql数据库层面操作
+ 登录：mysql -uroot -p
+ 创建数据库：create database cxuandb;
+ 删除数据库：drop database cxuandb;
+ 展示已存在的数据库：show databases;
+ 选择需要操作的数据库：use cxuandb;

### mysql表层面操作
+创建表：create table job(name varchar(20), sex varchar(2), age int(2), hiredate date, wage decimal(10,2));
+ 查看基本表的信息：DESC job；
+ 查看详细表的信息：show create table job \G;
+ 删除表方式一：drop table job
+ 删除表方式二，永远恢复不了！！！：truncate table job
+ 修改表结构一般使用 alter table 语句
```
修改：alter table job modify name varchar(25);
修改字段名称：alter table job change wage salary decimal(10,2);
增加字段：alter table job add home varchar(30);
删除字段：alter table job drop column home;
变换字段位置：alter table job add birthday after hiredate;
```

### DML语句（增删改）和DQL（查询）通称DML语句
+ DML语句（增删改）
```
插入一：insert into job(name,sex,age,hiredate,birthday,salary) values("cxuan","男",24,"2020-04-27","1995-08-22",8000);
插入二：insert into job values("cxuan02","男",25,"2020-06-01","1995-04-23",12000);
可以一次插入多条数据：insert into job values("cxuan02","男",25,"2020-06-01","1995-04-23",12000),("cxuan02","男",25,"2020-06-01","1995-04-23",12000);
更新（不用where的话就是对整个表的更新）：update job set age = 26 where name = 'cxuan03';
删除（不写where的话就是删除表中所有数据！！！）：delete from job where name = 'cxuan03';
```
+ DQL语句（查询）
查询表中所有字段和数据：select * from job;
查询：select name,sex,age,hiredate,birthday,salary from job;
去重：select distinct age from job;
条件查询一：select * from job where age >= 24;
条件查询二：select * from job where age >= 24 and salary > 8000;
DESC 会按照字段进行降序排列，ASC 会按照字段进行升序排列；默认升序
排序：select * from job order by salary desc;
限制一（可以用来做分页）：select * from job order by salary limit 3;
限制二：select * from job order by salary desc limit 2,3;
聚合
```
汇总函数，比如 sum 求和、count 统计数量、max 最大值、min 最小值等
group by，关键字表示对分类聚合的字段进行分组，比如按照部门统计员工的数量，那么 group by 后面就应该跟上部门
with 是可选的语法，它表示对汇总之后的记录进行再次汇总
having 关键字表示对分类后的结果再进行条件的过滤。
```
汇总：select sum(salary) from job;
最大、最小值：select max(salary),min(salary) from job;
一共有多少条数据：select count(1) from job;
按照部门统计员工数量：select age,count(1) from job group by age;
对汇总后的数据再次汇总：select age,count(1) from job group by age with rollup;
select age,count(1) from job group by age with rollup having count(1) > 1;
表连接
```

```



