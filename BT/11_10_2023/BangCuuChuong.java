
public class BangCuuChuong{
    public static void main(String[] args){
        BCC();
    }

    public static void BCC(){
        for(int i = 1; i<=9; i++){
            for(int j = 1; j<=10; j++){
                System.out.println(i + "x" + j + "=" + i*j);
            }
            System.out.println();
        }
    }
}