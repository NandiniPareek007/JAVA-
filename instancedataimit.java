//the variables are declared and multiplication is done 
class instancedataimit
{
	int num1=15;
	int num2=3;
	
	void multi()
	{
		int mul;
		mul=num1*num2;
		System.out.println("the multiplication is =" +mul);
		
	}
	public static void main(String []args )
	{
		instancedataimit Id=new instancedataimit();
		Id.multi();
		
	}
}