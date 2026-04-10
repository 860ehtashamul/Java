import java.util.Scanner;
public class challenge15{
    public static void main(String[]args){
        System.out.println("welcome to report card");
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your marks");
        int marks=input.nextInt();
        if(marks>=90){
            System.out.println("you got a A grade");
        }else if(marks>=75){
            System.out.println("you got a B grade");
        }else if(marks>=60){
            System.out.println("you got a c grade");
        }else if(marks>=30){
            System.out.println("you got A D grade");
        }else{
            System.out.println("you are fale");
        }
    }
}