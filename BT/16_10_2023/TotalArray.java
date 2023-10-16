import java.util.Scanner;

public class TotalArray{
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap so phan tu mang: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    
    for (int i=0; i<n ; i++ ){
        System.out.print("Phan tu " + (i+1) + " : ");
        a[i] = sc.nextInt();
    } 
    
    int tong = 0;
    for (int i=0; i<n; i++){
        System.out.printf("%3d", a[i]);
        tong += a[i];
    } 
    System.out.println("\nTong mang la: " + tong);
  }
}