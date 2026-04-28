import java.util.Scanner;
public class challenge29{
    public static void main(String[]args){
        Scanner Scanner=new Scanner(System.in);
        System.out.println("welcome to sum of odd number");
        System.out.println("please enter your number");
        int num=Scanner.nextInt();
        int sum=oddsum(num);
        System.out.println("oddsum till" + num + "is:" +sum);
    }
    public static int oddsum(int num){
        int sum=0;
        int i=1;
        while(i<=num){
            sum+=1;
            i+=2;
        }
        return sum;

    }
}