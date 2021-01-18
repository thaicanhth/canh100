package Chuong3;

import java.util.Scanner;

/* Gioi thieu ve phuong thuc trong Java*/
public class Bai19 {

   public static int findMaxElement(int[] arr){
       int max = arr[0];
       for (int i = 1; i < arr.length; i++){
           if (arr[i] > max){
               max = arr[i];
           }
       }
       return  max;
   }
   public static int[] nhapMang(int n, Scanner scanner){
       int[] arr = new  int[n];
       for (int i = 0; i < n; i++){
           arr[i] = scanner.nextInt();
       }
       return arr;
   }
    public static int[][] nhapMang2chieu(int n, Scanner scanner){
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }
    public static String[] tachTuTrongXau(String s){
       String[] result = s.split(" ");
       return result;
    }
    public static void showArrResult(String[] arr){
       for (int i = 0; i < arr.length; i++){
           System.out.println(arr[i]);
       }
        System.out.println();
    }
    public static void show2DArr(int[][] arr){
       for (int i = 0; i < arr.length; i++){
           for (int j = 0; j < arr[0].length; j++){
               System.out.println(arr[i][j]);
           }
           System.out.println();
       }
    }
    public static void main(String[] args) {
        int[] arr1, arr2, arr3;
        int n1 = 5, n2 = 7, n3 = 9;
        Scanner scanner = new Scanner(System.in);

        arr1 = nhapMang(n1, scanner);
        arr2 = nhapMang(n2, scanner);
        arr3 = nhapMang(n3, scanner);

        int max = findMaxElement(arr1);
        String str = "TOday is a beautiful day";
        String[] strs = tachTuTrongXau(str);
        showArrResult(strs);



    }
    /*
    - Phuong thuc la mot hanh dong nao do
    - Hai kieu phuong thuc:
    + tra ve: int, float, string, int[], int[][]
    + ko tra ve: void
     */
}
