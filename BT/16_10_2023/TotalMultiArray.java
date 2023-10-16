import java.util.Scanner;

public class TotalMultiArray{
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap so hang: ");
    int hang = sc.nextInt();
    System.out.print("Nhap so cot: ");
    int cot = sc.nextInt();
    int[][] a = new int[hang][cot];
    
    for (int i=0; i<hang ; i++ ){
        for(int j=0; j<cot; j++){
            System.out.printf("Phan tu a[%d][%d]=", (i), (j));
            a[i][j] = sc.nextInt();
        }
    }
    int tong = 0;
    for (int i=0; i<hang ; i++ ){
        for(int j=0; j<cot; j++){
            System.out.printf("%3d", a[i][j]);
            tong += a[i][j];
        }
        System.out.println();
    }
    System.out.println("Tong mang hai chieu la: " + tong);
  }
}