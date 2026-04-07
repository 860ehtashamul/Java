import java.util.Scanner;
public class challenge3{
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to arithmetic operator");
        System.out.println("enter the value of A number: ");
        int A=input.nextInt();
        System.out.println("Enter the value of B number: ");
        int B=input.nextInt();
        System.out.println("Enter the value of C number: ");
        int C=input.nextInt();
        int parimeter=A+B+C;
        System.out.println("parimeter is"+parimeter);
    }
}