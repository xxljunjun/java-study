public class OrdinaryMember extends Customer{
    public OrdinaryMember(){

    }
    public OrdinaryMember(String name,double balance){
        super(name,balance)
    }
   public void  receive(ArrayList<Integer> list){
        //从多个红包中随机抽取一个，给我自己
        //随机获取集合当中的一个索引编号
        int index = new Random().nextInt(list.size());
        //根据索引，从集合当中删除，并且得到被删除的红包，给我自己
        int delta = list.remove(index);
        //当前成员自己本来有多少钱。
        int money = super.getMoney();
        //加法，并且重写设置回去。
        super.setMoney(money+delta);
    }
    
}