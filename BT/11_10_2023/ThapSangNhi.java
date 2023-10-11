import java.util.Scanner;

public class ThapSangNhi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int thapPhan;
        do{
            System.out.print("Nhap so nguyen duong: ");
            thapPhan = sc.nextInt();
        }while(thapPhan < 0);
        
        teenToTwo(thapPhan);
    }

    public static void teenToTwo(int thapPhan){
        String nhiPhan = "";
        while(true){
            if(thapPhan/2 != 0){
                nhiPhan += thapPhan%2;
                thapPhan = thapPhan/2;
            }else{
                nhiPhan += thapPhan%2;
                break;
            }
        }
        dao(nhiPhan);
    }

    public static void dao(String str){
        String dao = "";
        for(int i = str.length() - 1; i >= 0; i--){
            dao += str.charAt(i);
        }
        System.out.print("So nhi phan la: " + dao);
    }
}