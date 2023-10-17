
import java.util.Arrays;
import java.util.Scanner;

public class RecursionBinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	    System.out.print("Nhap so phan tu mang: ");
//	    int n = sc.nextInt();
	    int[] a = {1, 3, 5, 7, 8, 9, 15, 19};
	    
//	    sc.nextLine();
//	    for (int i=0; i<n ; i++ ){
//	        System.out.print("Phan tu " + (i+1) + " : ");
//	        a[i] = sc.nextLine();
//	    }

	    System.out.print("Nhap gia tri can tim: ");
	    int x = sc.nextInt();

//	    sort(a);
	    for (int i=0; i<a.length; i++){
	        System.out.print("\t" + a[i]);
	    }
	    System.out.println();
	    
	    int viTri = kiemTra(a, x)? binarySearch(a, x): -binarySearch(a, x);
	    System.out.println("Vi tri can tim sau khi sap xep la: " + viTri);
	  }

	  public static int binarySearch(int[] arr, int key){
	    int left = 0;
	    int right = arr.length - 1;
	    int mid = (right+left)/2;

	    if(right == -1)
	    	return 0;
	    if(arr[mid] == key)
	        return mid;
	    else if(arr[mid] < key) {
	    	int[] str = Arrays.copyOfRange(arr, mid+1, right + 1);
	        return binarySearch( str, key) + mid + 1;
	    }
	    else {
	    	int[] str = Arrays.copyOfRange(arr, left, mid);
	    	return binarySearch(str, key);
	    }
	  }

//	  public static void sort(String[] str){
//	    for(int j=0; j<str.length-1; j++){
//	        String min = str[j];
//	        int vitri = j;
//	        for(int i=j+1; i<str.length; i++){
//	            if(min.compareTo(str[i]) > 0){
//	                min = str[i];
//	                vitri = i;
//	            }  
//	        }
//	        String tmp = str[j];
//	        str[j] = min;
//	        str[vitri] = tmp;   
//	    }
//	  }
	  public static boolean kiemTra(int[] arr, int key) {
		  for(int i=0; i<arr.length; i++) {
			  if(arr[i] == key)
				  return true;
		  }
		  return false;
	  }

}
