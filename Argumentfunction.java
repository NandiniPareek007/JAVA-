//Arguments 
class Argumentfunction
{
    void plus(int num1,int num2) //formal arguments 
    {
        int sum;
        sum=num1+num2;
        System.out.println("The addition is "+sum);

    }
    public static void main(String[] args) {


        Argumentfunction af =new Argumentfunction();
        af.plus( 96,23);

        //af.plus();     not valied because complusaory you have to pass exactly two arguments 
        //af.plus(23); 
        //af.plus(23,69,58);  
    }
}
