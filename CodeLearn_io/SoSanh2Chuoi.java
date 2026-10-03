
import java.util.Scanner;

public class SoSanh2Chuoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if (a.equals(b)) {
            System.out.println("2 chuoi bang nhau");
        } else {
            System.out.println("2 chuoi khac nhau");
        }
    }
}
