import java.util.Scanner;

public class DoiTien{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int USD = 23500;
        while(true){
            System.out.println("1. VND -> USD");
            System.out.println("2. USD -> VND");
            System.out.println("3. Thoat");
            System.out.print("Lua chon: ");
            String luaChon = sc.nextLine();
            if(luaChon.equals("3"))
                break;
            else
                doiTien(luaChon, USD);         
        }
    }

    public static void doiTien(String luaChon, int USD){
        Scanner sc = new Scanner(System.in);
        if(luaChon.equals("1")){
            System.out.print("Nhap so tien can quy doi: ");
            float money = sc.nextFloat();
            System.out.println(money + " VND -> " + (money/USD) + " USD");
        }else if(luaChon.equals("2")){
            System.out.print("Nhap so tien can quy doi: ");
            float money = sc.nextFloat();
            System.out.println(money + " USD -> " + (money*USD) + " VND");
        }else  
            System.out.println("Vui long nhap lai!");
        System.out.println();
    }
}