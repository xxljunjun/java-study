/*
    Interface关键字
    Implements关键字
*/
public class InterfaceTest{

}

//接口和抽象类是一样的
interface Animal {
   public void eat();
   public void travel();
}
interface Xxl{
    public void show();
}

//通过类去实现接口
class TestMy implements Animal,Xxl{
    @override
    public void eat(){

    }
    @override
    public void travel(){

    }
}