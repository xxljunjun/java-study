/*
	java�е��������ͷ�ΪΪ8�ֻ����������ͺ�3�ָ�����������
		byte ��������
		short  ��������
		int  ��������
		long  ��������

		float  ��������  ������
		double  ˫����

		char
		boolean  ��������

		class  ��
		interface  �ӿ�
		[]  ����
*/
/**
	@Author СϪ��
	@Version v1.0
*/
class HelloBeijing{
	//java�ĵ�һ���������
	public static void main(String[] args) {
		byte num1 = 111;
		short num2 = 222;
		int num3 = 333;
		//long������Ҫ��L��l��β
		long num4 = 4444L;

		//float������ҪF��f��β
		float num5 = 1.43F;
		double num6 = 34523.52452354234;


		char xxl = '��';
		char xxl1 = '\n';
//		char xxl2 = 'U012';
		boolean canGo = true;
		if(canGo){
			System.out.println("��������ȥ��");
		}else{
			System.out.println("No");
		}

		System.out.println("Hello World!"+num1+num2+num3+num4+num5+num6+xxl);
	}
}
