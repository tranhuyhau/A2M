import java.util.Scanner;

public class DaoChuoi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String chuoi = sc.nextLine();

        String dao = "";
        for(int i = chuoi.length() - 1; i >= 0; i--){
            dao += chuoi.charAt(i);
        }
        System.out.print("So nhi phan la: " + dao);
    }
}