package Test01;
import java.util.Arrays;
import java.util.Scanner;

public class Baitaptest2_1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang: ");
        n = sc.nextInt();
        int x, p;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= 2*n; j++) {
                x = j - n;
                if(x < 0){
                    x *= -1;
                }
                p = i - x;

                if(p > 0){
                    System.out.printf("%3d", p);
                } else{
                    System.out.printf("   ");
                }
            }
            System.out.println();
        }
    }
}
