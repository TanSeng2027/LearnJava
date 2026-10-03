
import java.util.Scanner;

public class NhapVaoNPhanTu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ds = new int[n];
        for (int i = 0; i < n; i++) {
            ds[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.err.print(ds[i] + " ");
        }
    }
}
