package BTVN_Module02_session03;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int[] mang={9,8,7,6,5,4,3,2,1};
        int N=mang.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số X mà bạn muốn chèn");
        int number=Integer.parseInt(sc.nextLine());
        System.out.println("nhp vị trí index cân chèn X mà bạn muốn chèn");
        int index=sc.nextInt();
        sc.close();

        if(index <0 || index>=N){
            System.out.println("không chèn được phần tử vào mảng");
        }else {
            // thực hiện chèn phần tử X ở vị trí index vào mảng
            int[]newArray=new int[N+1];
            for(int i=0;i<index;i++){
                newArray[i]=mang[i];
            }

            newArray[index]=number;

            for(int i=index;i<N;i++){
                newArray[i+1]=mang[i];
            }
            mang=newArray;
            N++;
            System.out.println("Mảng sau khi chèn phần tử " + number + " tại vị trí " + index + ":");
            for(int i=0;i<N;i++){
                System.out.println(mang[i]+" ");
            }

        }

    }
}
