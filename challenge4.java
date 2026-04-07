import java.util.Scanner;
public class challenge4{
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of B base: ");
        double B=input.nextDouble();
        System.out.println("Enter the value of H hight: ");
        double H=input.nextDouble();
        double area=0.5*B*H;
        System.out.println("area of ractangle  is: "+ area+"cms2");
    }
}