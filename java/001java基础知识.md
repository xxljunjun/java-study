### 命令模式操作系统
+ 在地址栏中输入cmd
```js
d: `进入某一盘符`
md java：`创建一个java文件夹`
dir：`查看当前文件夹下的所有文件`
cd java：`进入某一文件夹java`
cd..：cd/：`返回上一级`
cho name=Tome,age=12>1.doc
del 1.doc：`删除文件`
re team2：`删除文件夹`
cls：`清空当前终端信息`
```

### 傻瓜式安装JDK（java开发工具包）
+ 此次安装的是jdk和jre
```
/*注意再安装下一步jre*/
JDK==>JRE==>JVM
JDK = JRE + Java的开发工具（jacac.exe   java,exe   javadoc.exe）
JRD = JVM + Java核心类库
```
+ 补充安装的IDE版本：IntelliJ IDEA 2017.3.1

### 傻瓜式配置环境变量
+ 为了实现在任意文件夹目录下都可以访问java和javac
+ 定义一个变量JAVA_HOME==>D:\javatools\jdk1.8.0_131
+ 右击计算机-->属性--高级系统设置-->环境变量-->XXL的用户变量-->Path-->编辑-->%JAVA_HOME%\bin

### 输出HelloWorld
+ 新建helloworld.java
```java
class HelloChina {
   public static void main(String[] args ) {
     System.out.println("Hello,World!");
   }
}
```
+ javac helloworld.java
+ java HelloChina 
+ 控制台输出Hello,World!

### 安装EditPlus
```
也可以配置快捷命令运行
```

### 注释（comment）
```js
// 单行注释
// 多行注释
// 文档注释（java特有）:对于helloworld.java文件生成的文档注释
	javadoc -d myhello -author -version helloworld.java
```

### api文档
```
javadoc写的文档注释
不会的找字典，找api文档
```
### 文本编辑工具 
```
记事本
UltraEdit
EditPlus
TextPad
NotePad
```
### java集成开发环境（IDE）
```
JBuilder(老)
NetBeans（国外）
Eclipse（IBM,日食）
MyEclipse（收费）
IntelliJ IDEA
```
### 编译和运行错误
```
编译语法错误
运行内存错误
```


