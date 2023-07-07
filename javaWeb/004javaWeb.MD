### 电脑安装tomcat服务器
+ 下载解压到相应的安装木库即可
```
bin 专门用来存放 Tomcat 服务器的可执行程序
conf 专门用来存放 Tocmat 服务器的配置文件
lib 专门用来存放 Tomcat 服务器的 jar 包
logs 专门用来存放 Tomcat 服务器运行时输出的日记信息
temp 专门用来存放 Tomcdat 运行时产生的临时数据
webapps 专门用来存放部署的 Web 工程。
work 是 Tomcat 工作时的目录，用来存放 Tomcat 运行时 jsp 翻译为 Servlet 的源码，和 Session 钝化的目录。
```
+ 如何判断是否启动成功
```
找到 Tomcat 目录下的 bin 目录下的 startup.bat 文件，双击，就可以启动 Tomcat 服务器
打开浏览器，在浏览器地址栏中输入以下地址测试：
1、http://localhost:8080
2、http://127.0.0.1:8080
3、http://真实 ip:808
```
+ 如何修改Tomcat的端口号
```
Mysql 默认的端口号是：3306
Tomcat 默认的端口号是：8080
HTTP 协议默认的端口号是：80
找到 Tomcat 目录下的 conf 目录，找到 server.xml 配置文件。
```

### idea的javaWeb项目添加tomcat服务器
+ 可以直接拷贝到tomcat的安装目录下直接访问
+ 找到 Tomcat 下的 conf 目录\Catalina\localhost\ 下,创建如下的配置文件
```xml
添加xml配置文件
<!-- Context 表示一个工程上下文
path 表示工程的访问路径:/abc
docBase 表示你的工程目录在哪里
-->
<Context path="/abc" docBase="E:\book" />
```
+ idea编辑器的设置路径：setting/Application Servers
```
添加tomcat的安装路径就可以了
```
