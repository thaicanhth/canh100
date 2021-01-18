package Chuong3;

// Cấu trúc diền khiển lập for
public class Bai14 {
    public static void main(String[] args) {
        // lặp lại việc thực hiện một nhiệm vụ nào đó
        /*
        for(khởi đạo; điều kiện lập; bước nhảy){
           làm cái gì đó;
           }
         */

        for (int i = 0; i< 100; i +=2){
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
