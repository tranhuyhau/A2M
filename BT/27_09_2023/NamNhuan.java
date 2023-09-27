import java.util.Scanner;

public class NamNhuan {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Nhap so nam = ");
    int year = input.nextInt();
    if(year%4 == 0 && year%100 != 0){
        System.out.println("Nam " + year + " la nam nhuan!");
    }else if(year%400 == 0){
        System.out.println("Nam " + year + " la nam nhuan!");
    }else{
        System.out.println("Khong la nam nhuan");
    }
    System.out.println("Program end");
  }
}