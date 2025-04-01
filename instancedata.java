//Simply two variables are initalized and the declared and simple operation is performed on them
class Instancedata//name of class always starts with a capital letter 
{
	int num1;
	int num2;
	
	void minus()
	{
		num1=15;
		num2=3;
		int sub;
		sub=num1-num2;
		System.out.println("The substraction ="+sub);
		
	}
	public static void main (String[]args )
	{
		Instancedata id=new Instancedata();
		id.minus();
	}
}
