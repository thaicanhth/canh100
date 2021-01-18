package Chuong3;
//c Câu lệnh rẽ nhánh: switch-case
public class Bai13 {
    public static void main(String[] args) {
        String dk = "SANG";
        switch (dk) {
            case "SANG":
                // do something in case
                System.out.println("Buoi sang tot lanh!");
                break;
            case "TRUA":
                // do something in case
                System.out.println("Buoi trua an lanh!");
                break;
            case "CHIEU":
                // do something in case
                System.out.println("Buoi chieu mat me!");
                break;
            case "TOI":
                // do something in case
                System.out.println("Buoi toi tot lanh!");
                break;
            default:
                System.out.println("Ngay moi tot lanh");
                break;
        }
    }
}
