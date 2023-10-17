import java.util.Scanner;

public class GiaiThua{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen duong: ");
        int input = sc.nextInt();

        System.out.printf("%d! = %d", input, GT(input));
    }

    public static int GT(int input){
        if(input==1)
            return 1;
        return input*GT(input-1);
    }
}