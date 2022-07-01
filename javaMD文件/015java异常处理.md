### Error和Exception是Throwable的子类
+ Error
```js
java虚拟机无法解决的严重问题。如jvm系统内部错误、资源耗尽等严重问题。一般不写针对性代码
// StackOverflowError:栈溢出
// OutOfMemoryError:堆溢出
```
+ Exception
```js
其它因编程错误或偶然的外在因素导致的一般性问题，可以使用针对性的代码进行处理。
// 空指针访问
// 试图读取不存在的文件
// 网络连接中断
// 数组角标越界
java.lang.Error
java.lang.Exception
    ==>编译时异常（checked）
    ==>运行时异常（unchecked，RuntimeException）
        NullPointerException:空指针异常
        ArrayIndexOutOfBoundsException:数组角标越界
        classCastException:类型转换异常
        NumberFormatException:
        InputMismatchException:输入不匹配
        ArithmeticException:算术异常
```

### 异常处理机制:抓抛模型
+ 抓抛模型
```
过程一：抛
    一旦出现异常，就会在异常代码处生成一个对应异常类的对象，并将此对象抛出。
    一旦抛出对象以后，其后的代码就不再执行
过程二：抓
    try-catch-finally
    throws+异常类型
```


###  try-catch-finally
```
//1、finally是可选的
//2、使用try将可能出现异常代码包装起来，在执行过程中，一旦出现异常就会生成一个对应异常类的对象，根据此对象的类型去catch中进行匹配
//3、一旦try中的异常对象匹配到某个catch时，就进入catch进行异常的处理，一旦处理完成就跳出当前的try...catch...结构（没有写fanally的情况）
//4、catch中的异常如果没有子父类关系，则上下顺序无关系
//5、 System.out.println(e.getMessage()); e.printStackTrace();
//6、在try定义的变量在外面不能使用

//try...catch:编译时不再报错，运行时仍有可能报错;相当于我们使用try...catch将一个编译时可能出现的异常延迟到运行时出现
//开发中,由于运行时异常比较常见，所以我们通常就不针对运行时异常编写try...catch;针对编译时异常，我们说一定要考虑异常的处理
try{
    
}catch(StackOverflowError e){
   System.out.println(e.getMessage());
    e.printStackTrace();
}catch{

}
...
finally{
    //一定会执行的代码
}
finally中声明的代码一定会被执行。即使catch中又出现了异常了，try中又return,catch中也有return的情况。
像数据库连接、输入输出流都可以写在finally中，一定会执行
try...catch是可以嵌套的
```

### throws+异常类型
+ 写在方法的声明处。指明此方法执行时，可能会抛出的异常类型。
```
//一旦出现异常，仍会在异常代码中生产一个异常类的对象，此对象满足throws后。异常抛出，后续代码不再执行
public void method() throws FileNotFoundException,IOException{}
```
+ 方法重写的规则之一
```
子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
```

### 如何选择
+ 如果父类中被重写的方法没有throws方式处理异常，则子类重写的方法也不能使用throws。意味着如果子类重写的方法有异常，必须使用try...catch
+ 调用的几个方法是递进关系建议用throws；方法A建议使用try...catch

### 手动生成异常并抛出(throw)
```
```
