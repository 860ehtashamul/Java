import java.util.Scanner;
public class challenge2{
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to arithmetic operator");
        System.out.println("enter the value of first number: ");
        float first=input.nextfloat();
        System.out.println("Enter the value of second number: ");
        float second=input.nextfloat();
        float pro=first*second;
        System.out.println("product id:"+pro);
    }
}