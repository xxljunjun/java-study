/*
    抽象方法和抽象类:abstract关键字
        + 抽象类不能new创建对象
        + 抽象类中可以有构造器
        + 抽象类中不一定有抽象方法；抽象方法一定在抽象类里
        + 抽象类的子类必须重写所有父类的抽象方法，否则会报错；除非子类也是抽象类
*/

public abstract class AbstractTeest{
    String name;
    private int num;
    final static TOTAL; //全局常量
    //抽象类中的抽象方法
    public abstract void eat(){}
    //构造器
    public AbstractTeest(){

    }
    //方法
    public void show(){

    }
}

//在子类中重写抽象方法
class Son extends AbstractTeest{
    @Override
    public void eat(){
        system.out.println("猫吃鱼")
    }
}