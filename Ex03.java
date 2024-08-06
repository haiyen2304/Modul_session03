package BTVN_Module02_session03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập kích thước của mảng 1");
        int size1=Integer.parseInt(sc.nextLine());
        int[] array1=new int[size1];
        System.out.println("nhập kích thước của mảng 2");
        int size2=Integer.parseInt(sc.nextLine());
        int[] array2=new int[size2];


        //Buowsc2: sử dụng vòng lặp nhập giá trị cho các phần tử trong mảng

        System.out.println("nhập các phần tử cho mảng 1");
        for (int i = 0; i < size1; i++) {
            System.out.println("phần tử thứ "+(i+1)+": ");
            array1[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println("nhập các phần tử cho mảng 2");
        for (int i = 0; i < size2; i++) {
            System.out.println("phần tử thứ "+(i+1)+": ");
            array2[i]=Integer.parseInt(sc.nextLine());
        }
        // tạo mảng thứ 3
        int[]mang3=new int[size1+size2];
        for (int i = 0; i < size1; i++) {
            mang3[i]=array1[i];
        }
        for (int i = 0; i < size2; i++) {
            mang3[size1+i]=array2[i];
        }
        System.out.println("mảng sau khi gộp");
        System.out.println(Arrays.toString(mang3));
    }
}
