### 面向对象的三大特征：封装性、继承性、多态性、（抽象性）
+ extends关键字继承
```
 一、继承的好处
  	减少代码冗余，提高代码复用率
	便于功能的扩展
	为了之后多态的使用提供了前景
二、继承的格式：class A extends B{}
	A:子类、派生类、subclass
	B:父类、超类、基类、superclass
		
	体现：一旦子类A继承父类B以后，子类A中就获取了父类B中声明的结构：属性、方法
	特别的：父类中声明为private的属性方法，子类继承父类以后，仍然认为获取了父类中私有的结构
	子类继承完父类后，也可以声明自己特有的属性和方法，实现功能的扩展
三、java中关于继承的规定：
                 一个类可以被多个子类继承
	 一个类中只能有一个父类：单继承
                 子父类是相对的概念：多层继承
                  子类直接继承的类称直接父类；间接继承的类称为间接父类
四、object
	快捷键ctrl+T
	如果没有显式声明一个类的父类的话，则此类继承与java.lang.object类
	所有的类都直接或间接的继承于java.lang.object类
	所有的java类都具有java.lang.object类声明的功能
```

### debug的调试
+ 加断点
+ debugAs
```

```


### 方法的重写
```
//override
//overwrite
方法的声明、权限修饰符、---、返回值类型 方法名（形参列表）throws 异常类型{ 方法体 }
---可以是static
```
+ 在子类中可以根据需要对从父类继承来的方法进行改造，也称为方法的重置、覆盖。
在程序执行时，子类的方法将覆盖父类的方法
+ 经典面试题：区分方法的重载和重写
+ 子类重写的`方法名和形参列表`与父类的相同
+ 子类重写的`权限修饰符`不小于父类的权限
	特殊：子类不能重写private声明的方法
+ 父类被重写的方法的返回值是void。子类重写的也是void
	特殊：有返回值，子类的返回值A是父类返回值B的子类
	基本数据类型相同
+ 重写的方法的异常类型不大于父类被重写的方法抛出的异常类型
---子类和父类同名同参数的方法要么声明为非static的（考虑重写）---


### super关键字
+ 在子类的方法或构造器中可以使用"super.属性"或"super.方法"的方式，显式调用父类中声明的属性或方法
+ 特殊情况下：当父类和子类定义了相同名称的属性时，在子类中调用父类的声明必须使用"super.属性"
+ 特殊情况：重写的方法，在子类中想调用父类中被重写的方法"super.方法"
+ super调用构造器
```
-我们可以在子类的构造器中显式的使用"super(形参列表)"的方式，调用父类中声明的指定的构造器
-"super(形参列表)"的使用必须声明在子类构造器的首行
-我们在类的构造器中，针对于"this(形参列表)"/"super(形参列表)"只能二选一
-构造器首行没有显式声明"this(形参列表)"/"super(形参列表)"，则默认调用父类中空参的构造器super()
-在类的多个构造器中，至少有一个类的构造器使用了"super(形参列表)"，调用父类的构造器
```

### 子类对象实例化的过程
+ 从结果上看(继承性)
```
子类继承父类后，就获取了父类中声明的属性或方法，创建子类的对象，
在堆空间中，就会加载所有父类中声明的属性
```
+ 从过程上看
```
当我们通过子类的构造器创建子类对象是，我们一定会直接或间接调用其父类的构造器，进而调用父类的父类的构造器。。。
直到调用了java.lang.Object中的空c参构造器为止，正因为加载过所有的父类的结构，所以才能看到内存中的父类
```

### 面向对象的多态性
+ 对象的多态性：父亲类的引用指向字类的对象
+ 有了对象多态性以后，（虚拟方法调用）我们在编译期，只能调用父类中声明的方法，但在运行期，我们实际执行的是字类重写父类的方法
+ 多态性的使用前提：①类的继承关系  ②方法的重写
+ 对于方法而言：编译看左边"栈"空间，运行看右边"堆"空间
+ 多态是运行时行为
```
//这就是多态
Person p = new Student()
//下面这个方法传入的形参对象是Person的子类
public void doSome(Person p){}
```
+ 多态性对属性不生效，只适用于方法

### 向下转型
+ 有了对象的多态性以后，内存实际上是加载了子类特有的属性和方法，但是由于变量声明为父类类型
+ 编译时，只能调用父类中声明的属性和方法。子类特有的属性和方法不能调用
```
//如何才能调用子类特有的属性和方法？
//向下转型：使用强制类型转化。。。可能出现异常
Person p2 = new Man()
Man m1 = (Man)p2
```
+ 使用强制类型转化可能出现异常，用关键字instanceof
```
a instanceod A：判断对象a是否是类A的实例。如果是，返回true;如果不是,返回false
```

### 经典面试题
+ 谈谈对于多态性的理解
```
①实现代码的通用性
②Object中的equals（）方法
JDBC：使用java程序操作（获取数据库的连接、CRUD）
数据库（MySQL、Oracle、DB2、SQL、Server）
③抽象类、接口的使用肯定体现了多态性。（抽象类、接口不能实例化）

```
+ 多态是编译时行为还是运行时行为
```
多态是运行时行为！！！
```