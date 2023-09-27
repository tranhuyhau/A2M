
import java.util.Scanner;

public class BMI {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Nhap so can nang(kg): ");
    float canNang = input.nextFloat();
    System.out.print("Nhap chieu cao(m): ");
    float chieuCao = input.nextFloat();
    float BMI = canNang/(chieuCao*chieuCao);
    System.out.println("BMI = " + BMI);
    if(BMI < 18.5){
        System.out.println("Thieu can");
    }else if(BMI >= 18.5 && BMI < 25.0){
        System.out.println("Binh thuong");
    }else if(BMI >= 25.0 && BMI < 30.0){
        System.out.println("Thua can");
    }else if(BMI >= 30.0){
        System.out.println("Beo phi");
    }
     System.out.println("Program end");
  }
}