
import java.util.Scanner;

public class SoNamTrongKhoang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 0 && a <= 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
