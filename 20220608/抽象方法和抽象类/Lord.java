public class Lord extends Customer{
    public Lord(){

    }
    public Lord(String name,double balance){
        super(name,balance)
    }
    @Override
    public abstract ArrayList<Integer> send(int totalMoney,int count){
        //首先要有一个集合，用来存储若干个红包的金额
         ArrayList<Integer> redList = new ArrayList<>();
         //首先看一下自己有多少钱
         int leftMoney = super.getMoney();
         if(totalMoney> leftMoney){
             System.out.println("对不起，余额不足");
             return redList; //返回空集合
         }
         //扣钱就是重新设置余额
         super.setMoney(leftMoney-totalMoney);
 
         //发红包需要平均拆分为count份
         int avg = totalMoney / count;
         int mod = totalMoney % count;  //分完剩下的零头

       //除不开的零头，包在最后一个红包中
         //下面把红包一个一个放到集合里
         for (int i = 0; i < count-1; i++) {
             redList.add(avg);
         }
         //最后一个红包
         int last = avg+mod;
         redList.add(last);
 
         return redList;
    }
}