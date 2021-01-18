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
public class Bai9 {
    /*
    - toán tử logic: && / !
    - toán tử ba ngôi: epression ? x : y
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
    //    System.out.println(a > b) && (a == b));
    //    de phep && cho kq true: trai: true &&& phai: true
    //    System.out.println((a > b));
    //    System.out.println((a > b));
        //ket qua phep hoc / chỉ sai khi ca hai ve sai
        String res = "";
        res = (a > b) ? "a > b" : "a <= b";
        System.out.println(res);
    }
}
