package BTVN_Module02_session03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
       // Bước 1: Khai báo một chuỗi và gán cho nó một giá trị
        String str="hello world";
        //Bước 2: Khai báo một biến ký tự và gán hoặc nhập từ bàn phím một giá trị.
        Scanner sc=new Scanner(System.in);
        System.out.println("hãy nhập kí tự");
        char str1=sc.nextLine().charAt(0);
        sc.close();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str1==str.charAt(i)) {
                count++;
            }
        }
        System.out.println("số lần xuất iện của ký tự "+str1+" trong chuỗi  "+str+" là "+count);
    }
}
