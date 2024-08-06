package BTVN_Module02_session03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //bước 1: nhập số dòng và số cột của mảng 2 chiều
        System.out.println("nhập số dòng của mảng");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.println("nhập số cột của mảng");
        int cols = Integer.parseInt(sc.nextLine());

        int[][] array = new int[rows][cols];

        // bước 2: Nhập giá trij cho từng phần tử trong mảng 2 chiều
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("nập phần tử tại [" + i + "][" + j + "]: ");
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        //bước 3:tìm phần tử lớn nhát trong mảng 2 chiều
        int max = array[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        // in ra mảng
        System.out.println("in ra mảng");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("giá trị lớn nhất trong mảng là "+max);
        System.out.println("tại vị trí hàng "+ maxRow+" cột "+ maxCol);
    }
}
