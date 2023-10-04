import java.util.Scanner;

public class IsVowels{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char x = sc.next().charAt(0);
        if (!Character.isLetter(x)){
            System.out.print("Khong hop le");
        }else if(x == 'u' || x == 'e' || x == 'o' || x == 'a' || x == 'i'){
            System.out.print("La nguyen am");
        }else{
            System.out.print("khong la nguyen am");
        }
    }
}