import java.util.Scanner;

public class KiemTraSNT{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A, dem = 0;
        do{
            System.out.print("Nhap so nguyen duong A: ");
            A = sc.nextInt();
        }while(A < 0);

        for(int i = A-1; i>1; i--){
            if(A%i == 0){
                dem++;
                break;
            }
        }
        if(dem == 0){
            System.out.print( A + " la so nguyen to!");
        }else{
            System.out.print( A + " khong la so nguyen to!");
        }
    }
}