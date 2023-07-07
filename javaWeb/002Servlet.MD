### 什么是Servlet
```
1、Servlet 是JavaEE 规范之一。规范就是接口
2、Servlet 就JavaWeb 三大组件之一。
	三大组件分别是：Servlet 程序、Filter 过滤器、Listener 监听器。
3、Servlet 是运行在服务器上的一个java 小程序，
	它可以接收客户端发送过来的请求，并响应数据给客户端。
```


### 实现Servlet类
+ web.xml
```
<!-- servlet 标签给Tomcat 配置Servlet 程序-->
<servlet>
<!--servlet-name 标签Servlet 程序起一个别名（一般是类名） -->
<servlet-name>HelloServlet</servlet-name>
<!--servlet-class 是Servlet 程序的全类名-->
<servlet-class>com.atguigu.servlet.HelloServlet</servlet-class>
</servlet>
<!--servlet-mapping 标签给servlet 程序配置访问地址-->
<servlet-mapping>
<!--servlet-name 标签的作用是告诉服务器，我当前配置的地址给哪个Servlet 程序使用-->
<servlet-name>HelloServlet</servlet-name>
<!--url-pattern 标签配置访问地址<br/>
/ 斜杠在服务器解析的时候，表示地址为：http://ip:port/工程路径<br/>
/hello 表示地址为：http://ip:port/工程路径/hello <br/>
-->
<url-pattern>/hello</url-pattern>
</servlet-mapping>
```
+ Servlet类
```
//实现Servlet类
public class HelloServlet implements Servlet {}  //doGet  doPost方法

//继承HttpServlet类实现Servlet程序
public class HelloServlet2 extends HttpServlet{}  //doGet  doPost方法

```
+ url到Servlet程序
```
http://localhost:8080/book/myservlet
http://   表示协议
localhost  服务器ip
:8080  服务器端口号
/book  工程路径
/myservlet  资源路径
```


### ServletConfig 类
+ 什么是ServletConfig 
```
ServletConfig 类从类名上来看，就知道是Servlet 程序的配置信息类。
Servlet 程序和ServletConfig 对象都是由Tomcat 负责创建，我们负责使用。
Servlet 程序默认是第一次访问的时候创建，ServletConfig 是每个Servlet 程序创建时，
就创建一个对应的ServletConfig 对象。
```
+ 三大作用
```
1、可以获取Servlet 程序的别名servlet-name 的值
2、获取初始化参数init-param
3、获取ServletContext 对象
```


### ServletContext 类
+ 什么是ServletContext
```
1、ServletContext 是一个接口，它表示Servlet 上下文对象
2、一个web 工程，只有一个ServletContext 对象实例。
3、ServletContext 对象是一个域对象。
4、ServletContext 是在web 工程部署启动的时候创建。在web 工程停止的时候销毁。
什么是域对象?
域对象，是可以像Map 一样存取数据的对象，叫域对象。
这里的域指的是存取数据的操作范围，整个web 工程。
```
+ 四个作用
```
1、获取web.xml 中配置的上下文参数context-param
2、获取当前的工程路径，格式: /工程路径
3、获取工程部署后在服务器硬盘上的绝对路径
4、像Map 一样存取数据
```

### http
+ 常用请求头说明
```
Accept: 表示客户端可以接收的数据类型
Accpet-Languege: 表示客户端可以接收的语言类型
User-Agent: 表示客户端浏览器的信息
Host： 表示请求时的服务器ip 和端口号
```




