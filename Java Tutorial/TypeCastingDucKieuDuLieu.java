public class TypeCastingDucKieuDuLieu{

    public static void main(String[] args){

        //Có 2 loại:
        //Mở rộng (tự động) - chuyển đổi một loại nhỏ hơn đến kích thước loại lớn hơn
        //byte -> short -> char -> int -> long -> float -> double

        //Thu hẹp (thủ công) - chuyển đổi một loại lớn hơn đến loại kích thước nhỏ hơn
        //double -> float -> long -> int -> char -> short -> byte */

        //Mở rộng:
        int myInt = 9;
        double myDouble = myInt;// chuyen tu int sang double

        System.out.println(myInt);
        System.out.println(myDouble);

        //Thu hep:

        double myDouble1 = 9.0d;
        int myInt1 = (int) myDouble1; // them (int)

        System.out.println(myDouble1);
        System.out.println(myInt1);
    }


}