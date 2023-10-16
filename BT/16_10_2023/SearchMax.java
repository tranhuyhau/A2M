import java.util.Scanner;

public class SearchMax{
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap so phan tu mang: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    
    for (int i=0; i<n ; i++ ){
        System.out.print("Phan tu " + (i+1) + " : ");
        a[i] = sc.nextInt();
    } 
    
    int max = a[0];
    System.out.printf("%3d", a[0]);
    for (int i=1; i<n; i++){
        System.out.printf("%3d", a[i]);
        if(a[i] > max)
            max = a[i];
    } 
    System.out.println("\nGia tri lon nhat cua mang la: " + max);
  }
}