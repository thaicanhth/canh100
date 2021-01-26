package Test01;

import java.util.Scanner;

public class Baitaptest1_1 {
    public static void main(String[] args) {
        int A, sum = 0, tempSort;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            A = scanner.nextInt();
        } while (A < 0);

        // khởi tạo và cấp phát bộ nhớ cho mảng
        int array[] = new int[A];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < A; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Hiển thị mảng vừa nhập
        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < A; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
