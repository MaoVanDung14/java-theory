public class StringChuoi {
    //.length() : in ra co bao nhieu ky tu, tinh ca khoang trang
    public static void main(String[] args){
        String txt =  "abcd yz";
        System.out.println("So ky tu bang: " + txt.length());

        //In hoa or viet thuong tat ca cac chu

        String txt1 = "Nghe Nhac Anh Moi Khi Buon!";
        System.out.println(txt1.toUpperCase());//In hoa
        System.out.println(txt1.toLowerCase());//Viet thuong

        //So thu tu trong chuoi tinh ca khoang trang, 0 la vi tri dau tien trong chuoi
        String txt2 = "The Ki 21 ai ai cung buon";
        System.out.println(txt2.indexOf("ai"));//in ra 10 "ai dung o vi tri thu 10" 

        //Concatenation(Ghép nối) ghép 2 chuỗi lai vs nhau bằng dấu "+"
        String fistName = "Mao";
        String lastName = "Dung";
        System.out.println(fistName + " " + lastName);

        System.out.println(fistName.concat(lastName));//concat() : tao khoang trang

        // Ky tu dac biet:
        //String txt = "Mot ngay "em" se nho giay phut nay"; -> Loi ko in ra dc
        //giai phap : dung backslash (\) 
        String dream1 = "Du Chang Muon Tin, Danh Luu \"Em\" Vao Cuon fim\t";
        String dream2 = "It\' alright.\t";
        String dream3 = "fuck\\up ";
        System.out.println(dream1 + dream2 + dream3);

        // \n :xuong dong, \r :Xuong dong, \t : tab(Khoang trang), \b : Xoa khoang trang

        

    }
}
