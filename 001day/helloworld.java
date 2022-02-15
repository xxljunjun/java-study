/*
	java中的数据类型分为为8种基本数据类型和3种复杂数据类型
		byte 数据类型
		short  数据类型
		int  数据类型
		long  数据类型

		float  浮点类型  单精度
		double  双精度

		char
		boolean  布尔类型

		class  类
		interface  接口
		[]  数组
*/
/**
	@Author 小溪流
	@Version v1.0
*/
class HelloBeijing{
	//java的第一个程序程序
	public static void main(String[] args) {
		byte num1 = 111;
		short num2 = 222;
		int num3 = 333;
		//long类型需要与L或l结尾
		long num4 = 4444L;

		//float类型需要F或f结尾
		float num5 = 1.43F;
		double num6 = 34523.52452354234;


		char xxl = '我';
		char xxl1 = '\n';
//		char xxl2 = 'U012';
		boolean canGo = true;
		if(canGo){
			System.out.println("我是能上去的");
		}else{
			System.out.println("No");
		}

		System.out.println("Hello World!"+num1+num2+num3+num4+num5+num6+xxl);
	}
}
