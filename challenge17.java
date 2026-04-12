import java.util.Scanner;
public class challenge17{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your first number");
        int first=input.nextInt();
        System.out.println(" now  enter other  number");
        int second =input.nextInt();
        int result=first & second ;
        System.out.println("result is"+result);
    }
}