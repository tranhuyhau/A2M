import java.util.Scanner;

public class ChartToASCII{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char x = sc.next().charAt(0);
        System.out.println("The ASCII code for character E is " + (int)x);
    }
}