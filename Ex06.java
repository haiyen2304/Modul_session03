package BTVN_Module02_session03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập vào số cột của mảng");
        int cols = Integer.parseInt(sc.nextLine());
        System.out.println("hãy nhập vào số dòng của mảng");
        int rows = Integer.parseInt(sc.nextLine());
        int[][]array = new int[rows][cols];
        //nhập giá tr cho từng mảng
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử tại [" + i + "][" + j + "]: ");
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        // bước 3:Hiển thị các giá trị của mảng 2 chiều vừa nhập
        System.out.println("mảng 2 chiều là: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        // bước 4: Nhật số cột cần tính
        System.out.println("nhập cột cần tnh tổng");
        int colSum=Integer.parseInt(sc.nextLine());
        if(colSum<1||colSum>cols){
            System.out.println("số cột không hợp lệ");
        }else {
            int sum=0;
            for (int i = 0; i < rows; i++) {
                sum+=array[i][colSum-1];// Vì cột nhập vào bắt đầu từ 1, nên cần trừ 1 để có index đúng
            }
            //in ra tổng
            System.out.println(" tổng ở "+colSum+" là :"+sum);
        }


    }
}
