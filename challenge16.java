import java.util.Scanner;
public class challenge16{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your age");
        int age=input.nextInt();
        if(age>=65){
            System.out.println("you are a senior citizen");
        }else if(age>=20){
                System.out.println("you are a Teen");
        }else if(age>=60){
            System.out.println("you are a Adult");
        }else{
            System.out.println("you are a Senior");
        }
    }
}