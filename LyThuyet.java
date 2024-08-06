package BTVN_Module02_session03;

import java.util.Scanner;

public class LyThuyet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập s nguyên n1");
        int n1 = sc.nextInt();
        System.out.println("nhập số nguyên n2>n1");
        int n2 = sc.nextInt();
        sc.close();
        int sum=0;
        int i;
        int j;


        if (n1 < n2){

            for ( i = n1; i <= n2; i++) {
                if(i%2!=0){
                    sum=sum+i;
                }
                boolean check =true;
                for ( j = 2; j < i; j++) {

                    if(i%j==0){
                        check=false;
                        break;
                    }
                }if(check){
                    System.out.println("các số nguyên tố từ "+n1+" đến"+n2+" là "+i);
                }
            }
            System.out.println("tổng các số lẻ là : "+sum);
        }else {
            System.out.println("bạn nhập không đúng yeu cầu");
        }
    }
}
