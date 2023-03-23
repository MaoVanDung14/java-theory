public class DataTypesKieuDuLieu {
    public static void main(String[] args){
    //Các loại sô được chia thành 2 nhóm: Số nguyên(byte, short, int, long), Dấu phẩy động(fload, double)
    byte myNum = 100;
    System.out.println(myNum);

    short myNum1 = 5000;
    System.out.println(myNum1);

    long myNum2 = 150000000L; //Co L o cuoi
    System.out.println(myNum2);
    

    float myNum3 = 5.75f;
    System.out.println(myNum3);

    double myNum4 = 19.99d;
    System.out.println(myNum4);

    // fload va double co do chinh xac khoang 15 chu so

    float f1 = 35e3f;
    double d1 = 12E4d;
    System.out.println(f1);
    System.out.println(d1);
    //e de bieu thi luy thua cua 10

    boolean isJavaFun = true;
    boolean isFishTasty = false;
    System.out.println(isJavaFun);
    System.out.println(isFishTasty);

}

}
