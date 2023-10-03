
import java.util.Scanner;

public class TienDien {
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
    // 1 bac co bao nhieu KWH
    final int KWH1 = 50;
    final int KWH2 = 50;
    final int KWH3 = 100;
    final int KWH4 = 100;
    final int KWH5 = 100;
    // Gioi han KWH cua cac bac
    final int LIMIT1 = 50;
    final int LIMIT2 = 100;
    final int LIMIT3 = 200;
    final int LIMIT4 = 300;
    final int LIMIT5 = 400;
    float soTien = 0;
    if(soDien <= LIMIT1){
        soTien = (soDien*B1) * (1 + VAT);
    }else if(soDien > LIMIT1 && soDien <= LIMIT2){
        soTien = (KWH1*B1) * (1 + VAT);
        soDien = soDien - KWH1;
        soTien = soTien + ((soDien*B2)*(1 + VAT));
    }else if(soDien > LIMIT2 && soDien <= LIMIT3){
        soTien = (KWH1*B1) * (1 + VAT);
        soDien = soDien - KWH1;
        soTien = soTien + ((KWH2*B2)*(1 + VAT));
        soDien = soDien - KWH2;
        soTien = soTien + ((soDien*B3)*(1 + VAT));
    }else if(soDien > LIMIT3 && soDien <= LIMIT4){
        soTien = (KWH1*B1) * (1 + VAT);
        soDien = soDien - KWH1;
        soTien = soTien + ((KWH2*B2)*(1 + VAT));
        soDien = soDien - KWH2;
        soTien = soTien + ((KWH3*B3) * (1 + VAT));
        soDien = soDien - KWH3;
        soTien = soTien + ((soDien*B4) * (1 + VAT));
    }else if(soDien > LIMIT4 && soDien <= LIMIT5){
        soTien = (KWH1*B1) * (1 + VAT);
        soDien = soDien - KWH1;
        soTien = soTien + ((KWH2*B2)*(1 + VAT));
        soDien = soDien - KWH2;
        soTien = soTien + ((KWH3*B3)*(1 + VAT));
        soDien = soDien - KWH3;
        soTien = soTien + ((KWH4*B4)*(1 + VAT));
        soDien = soDien - KWH4;
        soTien = soTien + ((soDien*B5)*(1 + VAT));
    }else if(soDien > LIMIT5){
        soTien = (KWH1*B1)*(1 + VAT);
        soDien = soDien - KWH1;
        soTien = soTien + ((KWH2*B2)*(1 + VAT));
        soDien = soDien - KWH2;
        soTien = soTien + ((KWH3*B3)*(1 + VAT));
        soDien = soDien - KWH3;
        soTien = soTien + ((KWH4*B4)*(1 + VAT));
        soDien = soDien - KWH4;
        soTien = soTien + ((KWH5*B5)*(1 + VAT));
        soDien = soDien - KWH5;
        soTien = soTien + ((soDien*B6)*(1 + VAT));
    }
    System.out.println("Tien dien phai tra la: " + soTien);
    System.out.println("Program end");
  }
}