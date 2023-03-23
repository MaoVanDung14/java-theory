public class WhileLoop {
    public static void main(String[] args){
        // vòng lặp White lặp lại qua 1 khối mã miễn điều kiện là đúng
        int i = 5;
        while(i <= 5){
            System.out.println(i);
            i++;
        }

        //do white : Luôn thực thi ít nhất một lần, ngay cả điều kiện sai
        int i1 = 0;
        do{
            System.out.println(i1);
            i++;//ko tăng biến thì vòng lặp sẽ không bao h kết thúc
        }
        while(i<5);//White(điều kiện)


    }
    
}
