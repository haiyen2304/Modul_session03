package BTVN_Module02_session03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập kích thước của mảng");
        int size=Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("hãy nhập phần tử thứ " +i+"của mảng");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("mang hoàn chỉnh "+arr);

        int min=arr[0];
        for (int i = 0; i < size; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("số nhỏ nhất trong mảng là: "+min);
    }
}
