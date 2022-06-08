/*
    static关键字
        + 可以修饰属性和方法
            ==>类共享的数据，new出来的对象不会改变static定义的属性

    代码块
        + 静态代码块
        + 非静态代码块

    final关键字：
        + 可以修饰属性、类、方法
            ==>属性表示最终的值不可改变
            ==>类表示最终的不可以再继承
            ==>方法表示不能重写
*/
class FinalTest{
    final static int num;
    String name;
    double money;
    static int total;
    final static String country="xxxx";
    //代码块
    {
        system.out.println("xxxxx");
    }
    static{
        num = 12;
    }
    //方法
    public void show(int num){

    }
}

//绝种类无继承
final class Person{

}

class Student expends Person{
    
}

①默认初始化
②显示初始化
③构造器赋值
④对象.属性或者对象.方法
⑤代码块赋值


//单例模式
public class Person {
    //无参构造器
    public Person(){
        
    }
}
