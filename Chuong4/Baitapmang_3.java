package Chuong4;

import java.util.Scanner;

public class Baitapmang_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int dem=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] % 2 == 1)
                    System.out.print(arr[i][j] + " ");
                {
                        dem++;
                        break;
                }
            }
            System.out.println("So phan tu so le: "+dem);
        }
    }
}



