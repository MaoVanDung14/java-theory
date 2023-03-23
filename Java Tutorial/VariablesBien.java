public class VariablesBien{ //Khai bao lop co ten "VariablesBien"
    public static void main(String[] args) {
        String name = "Bao"; //Tao bien name va gan cho no gia tri la Bao
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        int myNum1;
        myNum1 = 51;
        System.out.println(myNum1);

        int myNum2 = 15;
        myNum2 = 20;
        System.out.println(myNum2);// in ra 20

        //neu khong muon ghi de
        /*
        final int myNum3 = 15;
        myNum3 = 20;//Bao loi
        System.out.println(myNum3);
         */


        String name1 = "Nam";
        System.out.println(name1 + "Nu");

        int x = 5, y = 6, z = 8;
        System.out.println(x + y + z);

        /*
         * Quy tac dat ten cho cac bien:
         * Tên có thể chứa chữ cái, chữ số, dấu gạch dưới và ký hiệu đô la
         * Tên phải bắt đầu bằng một chữ cái
         * Tên phải bắt đầu bằng chữ thường và nó không thể chứa khoảng trắng
         * Tên cũng có thể bắt đầu bằng $ và _ (nhưng chúng tôi sẽ không sử dụng nó trong hướng dẫn này)
         * Tên có phân biệt chữ hoa chữ thường ("myVar" và "myvar" là các biến khác nhau)
         * Không thể sử dụng các từ dành riêng (như từ khóa Java, chẳng hạn như hoặc ) làm tênintboolean    
         */
    }
}