### 什么是 Listener 监听器？
```
1、Listener 监听器它是 JavaWeb 的三大组件之一。JavaWeb 的三大组件分别是：Servlet 程序、Filter 过滤器、Listener 监
听器。
2、Listener 它是 JavaEE 的规范，就是接口
3、监听器的作用是，监听某种事物的变化。然后通过回调函数，反馈给客户（程序）去做一些相应的处理。
```

### ServletContextListener 监听器
+ 想要在项目的启动和销毁的时候做什么事的时候可以用到这监听器
```
ServletContextListener 它可以监听 ServletContext 对象的创建和销毁。
ServletContext 对象在 web 工程启动的时候创建，在 web 工程停止的时候销毁。
监听到创建和销毁之后都会分别调用 ServletContextListener 监听器的方法反馈。
```
```
public interface ServletContextListener extends EventListener {
/**
* 在 ServletContext 对象创建之后马上调用，做初始化
*/
public void contextInitialized(ServletContextEvent sce);
/**
* 在 ServletContext 对象销毁之后调用
*/
public void contextDestroyed(ServletContextEvent sce);
}
```

```
如何使用 ServletContextListener 监听器监听 ServletContext 对象。
使用步骤如下：
1、编写一个类去实现 ServletContextListener
2、实现其两个回调方法
3、到 web.xml 中去配置监听器
```
```
public class MyServletContextListenerImpl implements ServletContextListener {
@Override
public void contextInitialized(ServletContextEvent sce) {
System.out.println("ServletContext 对象被创建了");
}
@Override
public void contextDestroyed(ServletContextEvent sce) {
System.out.println("ServletContext 对象被销毁了");
}
}
```
```
<!--配置监听器-->
<listener>
<listener-class>com.atguigu.listener.MyServletContextListenerImpl</listener-class>
</listener>
```