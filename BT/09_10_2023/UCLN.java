import java.util.Scanner;

public class UCLN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A, B;
        do{
            System.out.print("Nhap so nguyen duong A: ");
            A = sc.nextInt();
            System.out.print("Nhap so nguyen duong B: ");
            B = sc.nextInt();
        }while(A < 0 || B < 0);

        if(Math.min(A, B) == 0){
            System.out.println("UCLN cua " + A + " va " + B + " la: " + Math.max(A, B));
        }else{
            for(int i = Math.min(A, B); i > 0; i--){
                if(A%i == 0 && B%i == 0){
                    System.out.println("UCLN cua " + A + " va " + B + " la: " + i);
                    break;
                }
            }
        }
    }
}