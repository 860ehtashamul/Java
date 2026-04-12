import java.util.Scanner;
public class challenge20{
    public static void main(String[]args){
        System.out.println("left shift")
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your  number");
        int num=input.nextInt();
        int result=num<<4 ;
        System.out.println("result is"+result);
    }
}