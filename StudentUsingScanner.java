import java.util.Scanner;
//import java.util.*;
class StudentUsingScanner {
    String name;
    int sroll;
    Scanner sc=new Scanner(System.in);

    void getdetails()
    {
        System.out.print("Enter the name of the student =");
        name=sc.next();

        System.out.print("Enter the roll number of Student =");
        sroll=sc.nextInt();

    }
    void putdetails()
    {
        System.out.println("The name = "+name);
        System.out.println("The roll number = "+sroll);
    }
   
}
