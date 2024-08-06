package BTVN_Module02_session03;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tích thuosc của ma trận vuông");
        int size=Integer.parseInt(sc.nextLine());
        int[][]matrix=new int[size][size];

        // bước 2: Nhp giá tr cho tng phần tử trong ma trận vuông
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhập phần tử tại [" + i + "][" + j + "]: ");
                matrix[i][j]=Integer.parseInt(sc.nextLine());
            }
        }
        sc.close();
        //bước 3: hin thị các giá trị của ma trận vua nhập
        System.out.println("ma trận vừa nhập");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // bước 4: tính tổng các phần tử ở đường chéo chính và đường chéo phụ
        int sumCheochinh=0;
        int sumCheophu=0;
        for (int i = 0; i < size; i++) {
            sumCheochinh+=matrix[i][i];
            sumCheophu+=matrix[i][size-1-i];
        }
        // In ra tổng các phần tử ở đường chéo chính và đường chéo phụ
        System.out.println("Tổng các phần tử ở đường chéo chính: " + sumCheochinh);
        System.out.println("Tổng các phần tử ở đường chéo phụ: " + sumCheophu);


    }
}
