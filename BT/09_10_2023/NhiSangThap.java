import java.util.Scanner;

public class NhiSangThap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nhiPhan;
        boolean kiemTra = true;
        do{
            System.out.print("Nhap chuoi nhi phan: ");
            nhiPhan = sc.nextLine();
            kiemTra = true;
            for(int i = 0; i < nhiPhan.length(); i++){
                if(nhiPhan.charAt(i)!='0'){
                    if(nhiPhan.charAt(i) != '1'){
                        kiemTra = false;
                        break;
                    }
                }
            } 
        }while(!kiemTra);
        int thapPhan = 0;
        int j = 0;
        for(int i = nhiPhan.length() - 1; i >= 0; i-- ){
            // C1: thapPhan += Character.getNumericValue(nhiPhan.charAt(j))*Math.pow(2, i);
            thapPhan += Integer.parseInt(String.valueOf(nhiPhan.charAt(j)))*Math.pow(2, i); // C2
            j++;
        }
        System.out.print("So thap phan la: " + thapPhan);
    }
}