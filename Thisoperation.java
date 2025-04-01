 class Thisoperation {
    int num1=12;
    int num2=4;

    void plus(int num1,int num2)
    
    //void plus(int num1=23,int num2=25) this not not allowed 

    {
        int sum;
       // sum = num1+num2;// 23+25

        //sum=this.num1+this.num2;//12+4
        //Using this operation we can access the variables which are globally declared  
        sum=this.num1+num2; //12+25

        System.out.println("The addition of the number is =" +sum);
    }
    public static void main(String []args )
    {
        Thisoperation to =new Thisoperation();
        to.plus(23, 25);

    }
}
