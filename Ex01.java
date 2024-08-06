package BTVN_Module02_session03;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // xóa phần tử khỏi mảng
        int[] value={10,4,6,7,8,6,0,0,0,0};
        Scanner sc=new Scanner(System.in);
        System.out.println("số tự từ bàn phím");
        int number=sc.nextInt();
        sc.close();
        int indexDelete=-1;
        int N=value.length;
        for(int i=0;i<=N-1;i++){
            if(number==value[i]){
                indexDelete=i;
                break;
            }
        }
        if(indexDelete!=-1){
            for(int j=indexDelete;j<=N-2;j++){
                value[j]=value[j+1];
            }
            N--;
        }else {
            System.out.println("phần tử bạn nhập không có trong mảng");
        }
        System.out.println("mảng sau khi xóa phần tử "+number+ " là");
        for(int k=0;k<=N-1;k++){
            System.out.print(value[k]+" ");
        }
    }
}
