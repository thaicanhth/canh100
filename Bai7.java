package Chuong3;
//Toán tử trong java:
/*
   - toán tử số học: + - * / %
   - toán tử gán: = *= /= -= %=
   - toán tử tăng giảm: x++ --x ++x x--
   - toán tử so sánh: > < >= <= == !=
   - toán tử logic: && / !
   - toán tử ba ngôi expression ? x : y
   - thứ tự ưu tiên các toán tử
   - giới thiệu enum.
 */
public class Bai7 {
    /*
    - toán tử số học: + - * / %
    - toán tử gán: = += /= -= += %=
     */
    public static void main(String[] args) {
        int a = 125;
        int b = 225;
        float res = a/(b*1.0f);
        int res2 = a/b;
      //  System.out.println("kq phep chia nguyen:" +res2);
      //  System.out.println("kq phep chía so thuc:" +res);
      //  int kq = a%b;
      //  System.out.println("kq phep chia");
        a = a + 100;
        // tuong duong:
        a+= 100;
        a*= 100; // a = a * 100
        int c = a + b;
   }
}
