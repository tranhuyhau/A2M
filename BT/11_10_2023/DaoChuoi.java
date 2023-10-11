import java.util.Scanner;

public class DaoChuoi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String chuoi = sc.nextLine();

        dao(chuoi);
    }

    public static void dao(String str){
        String dao = "";
        for(int i = str.length() - 1; i >= 0; i--){
            dao += str.charAt(i);
        }
        System.out.print("Chuoi sau khi dao la: " + dao);
    }
}