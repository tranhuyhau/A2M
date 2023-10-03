
import java.util.Scanner;

public class TienDien2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Nhap so dien: ");
    float soDien = input.nextFloat();
    
    //Gia tien dien moi bac
    final float VAT = 0.08f;
    final float B1 = 1728.0f;
    final float B2 = 1786.0f;
    final float B3 = 2074.0f;
    final float B4 = 2612.0f;
    final float B5 = 2919.0f;
    final float B6 = 3015.0f;
    //1 bac co bao nhieu KWH
    final int KWH1 = 50;
    final int KWH2 = 50;
    final int KWH3 = 100;
    final int KWH4 = 100;
    final int KWH5 = 100;
    float soTien = 0;
    soTien += Math.min(soDien, KWH1) * B1;
    soDien -= Math.min(soDien, KWH1);

    soTien += Math.min(soDien, KWH2) * B2;
    soDien -= Math.min(soDien, KWH2);

    soTien += Math.min(soDien, KWH3) * B3;
    soDien -= Math.min(soDien, KWH3);

    soTien += Math.min(soDien, KWH4) * B4;
    soDien -= Math.min(soDien, KWH4);

    soTien += Math.min(soDien, KWH5) * B5;
    soDien -= Math.min(soDien, KWH5);

    soTien += Math.max(0, soDien) * B6;

    soTien *= (1 + VAT);
    System.out.println("Tien dien phai tra la: " + soTien);
    System.out.println("Program end");
  }
}