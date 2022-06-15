public class Customer{
    private String name;
    private double balance;
    public Customer(){

    }
    public Customer(String name,double balance){
        this.name = name;
        this.balance = balance;
    }
    public String getName(){
        return name;
    }
    public String getBalance(){
        return balance;
    }
    public setName(String name){
        this.name = name;
    }
    public setBalance(double balance){
       this.balance = balance;
    }
    /**
        发红包的抽象方法：具体的逻辑由子类继承重写
    */
    public abstract ArrayList<Integer> send(int totalMoney,int count){}
}