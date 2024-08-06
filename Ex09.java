package BTVN_Module02_session03;

public class Ex09 {
    public static void main(String[] args) {
//        int[] mang = new int[]{23,4,1998,2,6,2001,5,8,2024,7};
//        int max=mang[0];
//        for(int i = 0; i < mang.length; i++) {
//            if(max<mang[i]) {
//                max = mang[i];
//            }
//        }
//        int max2=mang[0];
//        for(int i = 0; i < mang.length; i++) {
//            if(mang[i]==max){
//                continue;
//            }
//            if(max2<mang[i]) {
//                max2 = mang[i];
//            }
//        }
//        System.out.println(max+" số lớn nhất");
//        System.out.println(max2+" số lớn thứ 2 ");

        // CACH 2:
        int[] mang = new int[]{23,4,1998,2,6,2001,5,8,2024,7,2023} ;
        int max=mang[0];
        int max2=mang[0];
        for(int i=1;i<mang.length;i++){
            if(max<mang[i]){
                max2=max;
                max=mang[i];
            } else if (max2<mang[i]&& max2!=max) {
                max2=mang[i];
            }
        }
        if(max2==max){
            System.out.println("không có số lo sn thứ 2");
        }else {
            System.out.println(max+" lon nhat");
            System.out.println(max2+" lon nhi");
        }
   }
}
