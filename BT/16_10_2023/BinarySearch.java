import java.util.Scanner;

public class BinarySearch{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap so phan tu mang: ");
    int n = sc.nextInt();
    String[] a = new String[n];
    
    sc.nextLine();
    for (int i=0; i<n ; i++ ){
        System.out.print("Phan tu " + (i+1) + " : ");
        a[i] = sc.nextLine();
    }

    System.out.print("Nhap gia tri can tim: ");
    String x = sc.nextLine();

    sort(a);
    for (int i=0; i<a.length; i++){
        System.out.print("\t" + a[i]);
    }
    System.out.println();
    System.out.println("Vi tri can tim sau khi sap xep la: " + binarySearch(a, x));
  }

  public static int binarySearch(String[] arr, String key){
    int left = 0;
    int right = arr.length - 1;
    int mid = (right+left)/2;

    while(left<=right){
        if(arr[mid].compareTo(key) == 0)
            return mid;
        else if(arr[mid].compareTo(key) < 0)
            left = mid + 1;
        else if(arr[mid].compareTo(key) > 0)
            right = mid - 1;
        mid = (right+left)/2;
    }
    return -(mid+1);
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