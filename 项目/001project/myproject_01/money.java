package com.xxl.java;
/*
 * 学习完工程化项目后对项目一进行工程化
	项目收支
		1、完成页面布局
		2、输入错误数字弹出继续
		3
*/
import java.util.Scanner;
//import Utility.java;
public class money{
	public static void main(String[] args){
		boolean isflag = true;
		String details = " 收支\t账户金额\t收支金额\t说明\n";
		int allNumber = 10000;  //账户余额
		while(isflag){
			//项目初始化的界面（相当于前端的页面布局）：
			System.out.println();
			for(int i=0;i<5;i++){
				int num=i == 0?20:30;
				for(int j=0;j<num;j++){
					System.out.print(" ");
				}
				switch (i){
					case 0:
						System.out.println("---------家庭收支记账软件--------");
						System.out.println();
					break;
					case 1:
						System.out.println("1 收支明细");
					break;
					case 2:
						System.out.println("2 登记收入");
					break;
					case 3:
						System.out.println("3 登记支出");
					break;
					case 4:
						System.out.println("4 退  出");
					break;			
				}
			}

			//用户输入数字
			System.out.print("请选择（1-4）：");
			char m = Utility.readMenuSelection();  //调用Utility类的方法实现输入1-4的时候的情况

			//判断用户输入的数字
			Scanner scan = new Scanner(System.in);
			switch(m){
				case '1':
					System.out.println("---------当前收支明细记录--------");
					System.out.println(details);
					System.out.println("---------------------------------");
				break;
				case '2':
					System.out.print("本次收入金额：");
					int qian = Utility.readNumber();
					System.out.print("本次收入说明：");
					String who = Utility.readString();
					//把收入登记去details
					allNumber+=qian;
					details +="收入\t"+allNumber+"\t\t"+qian+"\t\t"+who+"\n";
					System.out.print("---------登记完成-----------");
				break;
				case '3':
					System.out.print("本次支出金额：");
					int outQian = Utility.readNumber();
					System.out.print("本次支出说明：");
					String outWho = Utility.readString();
					//把支出登记去details
					allNumber-=outQian;
					details +="支出\t"+allNumber+"\t\t"+outQian+"\t\t"+outWho+"\n";
					System.out.print("---------登记完成-----------");
				break;
				case '4':
					System.out.print("确认是否退出(Y/N)：");
					char isOut =Utility.readConfirmSelection(); //调用库的方法询问是否退出
					if(isOut == 'Y'){
						isflag = false;
					}else{
						isflag = true;
					}
				break;
				default:
					//调库重新输入
					System.out.print("请输入正确的数字！");
			}
		}
		



		
	}
}
