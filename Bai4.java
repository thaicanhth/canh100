package Chuong3;

//khối code, phạm vi của biến
public class Bai4 {
    int x = 88;
    public static void main(String[] args) {
        int x = 0;
        {
 //           int x = 99;
            System.out.println(x);//ok
            // a block of code
            {
                //khoi
            }
        }
        System.out.println(x);//ok
    }
    //other block
}
