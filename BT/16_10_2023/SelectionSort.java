import java.util.Scanner;

public class SelectionSort{
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap so phan tu mang: ");
    int n = sc.nextInt();
    String[] a = new String[n];
    
    sc.nextLine();
    for (int i=0; i<n ; i++ ){
        System.out.print("Phan tu " + (i+1) + " : ");
        a[i] = sc.nextLine();
    } 
    sort(a);
    for (int i=0; i<n ; i++ ){
        System.out.printf("%3s", a[i]);
    } 
  }

  public static void sort(String[] str){
    for(int j=0; j<str.length-1; j++){
        String min = str[j];
        int vitri = j;
        for(int i=j+1; i<str.length; i++){
            if(min.compareTo(str[i]) > 0){
                min = str[i];
                vitri = i;
            }  
        }
        String tmp = str[j];
        str[j] = min;
        str[vitri] = tmp;   
    }
  }
}