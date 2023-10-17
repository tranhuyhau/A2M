
import java.util.Scanner;

public class Fibonaccy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so Fibonaccy thu n: ");
        int input = sc.nextInt();

        Fibonaccy(input, 0, 1);
    }

    public static void Fibonaccy(int input, int soTruoc, int soSau){
        int trungGian = soTruoc + soSau;
        if(input==1)
        	System.out.print("\t" + trungGian);
        else {
        	System.out.print("\t" + trungGian);
        	Fibonaccy(input-1, soSau, soTruoc+soSau);
        }
    }
}

// 1 1 2 3 5 8 13
