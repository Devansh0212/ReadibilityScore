// package readability;
import java.util.Scanner;
public class Stage1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if(a.length()>100){
            System.out.print("HARD");
        }else{
            System.out.print("EASY");
        }
        
    }
}