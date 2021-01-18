package Chuong3;
/*
- toán tử số học: + - * / %
- toán tử gán: = *= /= -= %=
- toán tử tăng/giảm: x++ --x ++x x--
- toán tử so sanh: > < >= <= == !=
- toán tử logic: && / !
- toán tử ba ngôi expresslan ? x : y
- thứ tự ưu tiên các toán tử
- giới thiệu enum
 */
public class Bai10 {
    /*
    - thứ tự ưu tiên các toán tử
    - giới thiệu  enum
     */
    enum HL{YEU, TB, KHA, GIOI, XS}
    public static void main(String[] args) {
        /*
        >= 9.0: xs
        8.0 ~ 8.99: GIOI
        6.5 ~ 7.99: KHA
        5.0 ~ 6.49: TB
        < 5.0:      YEU
         */

        HL tb = HL.TB;
        System.out.println();
    }
}
