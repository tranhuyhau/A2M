import java.util.Scanner;

public class StringComparison{
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap so phan tu chuoi thu 1: ");
    int numberStr1 = sc.nextInt();
    String[] str1 = new String[numberStr1];
    sc.nextLine();
    for(int i=0; i<numberStr1; i++){
        System.out.print("Phan tu " + (i+1) + " : ");
        str1[i] = sc.nextLine();
    }

    System.out.print("Nhap so phan tu chuoi thu 2: ");
    int numberStr2 = sc.nextInt();
    String[] str2 = new String[numberStr2];
    sc.nextLine();
    for(int i=0; i<numberStr2; i++){
        System.out.print("Phan tu " + (i+1) + " : ");
        str2[i] = sc.nextLine();
    }
    System.out.print("List 1: ");
    for(int i=0; i<numberStr1; i++){
        System.out.print(str1[i]);
    }
    System.out.println();
    System.out.print("List 2: ");
    for(int i=0; i<numberStr2; i++){
        System.out.print(str2[i]);
    }
    if(comparison(str1, str2))
        System.out.println("\nThe two arrays are strictly identical");
    else
        System.out.println("\nThe two arrays are strictly different ");
  }

  public static boolean comparison(String[] str1, String[] str2){
        if(str1.length != str2.length)
            return false;
        else{
            for(int i=0; i<str1.length; i++){
                if(!str1[i].equals(str2[i]))
                    return false;
            }
        }
        return true;
    }
}