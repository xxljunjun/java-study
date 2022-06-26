### Object类的使用
+ Object类是所有java类的根父类
```
//java.lang.Object
c.getClass().getSuperclass()
```
+ Object类的属性和方法
```
clone()方法：
equals()方法：
toString()方法：
finalize()方法：垃圾收集器,垃圾回收之前会调用这个方法，具体什么时候调不知道
getClass()方法：
hashCode()方法：
面试题：区分final、finally、finalize
```
+ 程序员可以通过System.gc()或者Runtime.gettime().gc来通知系统进行垃圾回收
+ Object只声明了一个空参构造器


### equals与"=="的区别
+ ==既可以比较基本数据类型也可以计较引用数据类型；基本数据比较值，引用类型比较内存地址
+java.lang.Object类里面的equals方法，如果该方法没有被重写过默认也是==；
+String、date、File、包装类、都重写了equals方法；比较两个对象的"实体内容"是否相同
```
//在Object中的equals方法
public boolean equals(Object obj){
    return (this == obj)
}
```

### toString()方法
+ 当输出一个对象的引用时，实际上就是调用当前对象的toString方法
+ Object类中定义的toString方法
+ String、date、File、包装类都重写了Object类中定义的toString方法；调用对象的toString时，返回"实体内容"
```
Customer cust1 = new Customer 
cust1.toString()
//在object中的toString()方法
public String toString(){
  return getClass().getName()+"@"+Integer.toHexString(hashcode())
}
面试题：final、finally、finalize的区别
equals和"=="的区别
```


### 单元测试方法
+ 选中当前工程-build path-add libraries - Junit4 -下一步
+ 创建java类进行单元测试
+ 声明单元测试方法public;没有返回值；没有形参
+ @Test    import org.junit.Test
+ run


### 包装类的使用
+ 为了使得基本数据类型都有面向对象的编程思想
+ Byte、Short、Integer、Long、Float有相同的父类Number
```
八种基本数据类型
byte、short、int、long、float、float、boolean、char
//包装类
Byte
Short
Integer
Long
Float
Boolean
Character
```
+ 主要是讲基本数据类型、包装类、String类相互转换
```
* 1、基本数据类型转换成包装类：只要调用包装类的构造器
 * 2、包装类转换成基本数据类型：只要调用包装类的xxxValue()
 JDK5.0新特性：自动装箱与自动拆箱

```
+基本数据类型、包装类转String
```
int num1 = 10
String str1 = num1+""

int num1 = 10
String str2 = String.valueOf(num1)
```
+String转基本数据类型、包装类
```
String str1 = "123"
int num2 = Integer.parseInt(str1)

String str2 = "true1"
boolean b1 = Boolean.parseBoolean(str2)

```
```
基本数据类型<---->包装类：JDK5.0的新特性：自动装箱与自动拆箱
基本数据类型、包装类--->String:调用String重载的valueOf（Xxx xxx）
String--->基本数据类型、包装类:调用包装类的parseXxx(String s)
```

### 包装类的面试题
```
ctrl+t：看父类
ctrl+shift+o:导入所有包
//三元运算符比较时会进行自动类型提升
//使用自动装箱-128~127范围内的整数时，可以直接使用数组中的元素不用再去new了。目的，提高效率
```