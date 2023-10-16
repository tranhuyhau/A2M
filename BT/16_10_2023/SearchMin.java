import java.util.Scanner;

public class SearchMin{
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap so phan tu mang: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    
    for (int i=0; i<n ; i++ ){
        System.out.print("Phan tu " + (i+1) + " : ");
        a[i] = sc.nextInt();
    } 
    
    int min = a[0];
    System.out.printf("%3d", a[0]);
    for (int i=1; i<n; i++){
        System.out.printf("%3d", a[i]);
        if(a[i] < min)
            min = a[i];
    } 
    System.out.println("\nGia tri nho nhat cua mang la: " + min);
  }
}