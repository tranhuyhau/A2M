import java.util.Scanner;

public class DoiTien {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Lua chon chuyen tien:");
    System.out.println("Bam phim 1: VND -> USD");
    System.out.println("Bam phim 2: USD -> VND");
    int USD = 23500;
    int bam = input.nextInt();
    switch(bam){
        case 1:
            System.out.print("Nhap so tien can quy doi: ");
            float money = input.nextFloat();
            System.out.println(money + " VND -> " + (money/USD) + " USD");
            break;
        case 2:
            System.out.print("Nhap so tien can quy doi: ");
            money = input.nextFloat();
            System.out.println(money + " USD -> " + (money*USD) + " VND");
            break;
        default:
            System.out.println("Nhap sai so!");
    }
    System.out.println("Program end");
  }
}