public class Switch {
    public static void main(String[] args){
        //Thay vi dung nhieu cau lenh if else if  ta se dung switch
        int day = 4;
        switch(day){
            case 1: 
            System.out.println("Monday");
            break;//break; :Nếu đúng thì nó sẽ kết thúc tại đây
            case 2:
            System.out.println("Tuesday");
            break;
            case 3: 
            System.out.println("Wednesday");
            break;
            default:
            System.out.println("bad day!!!!");//

        }
    }
    
}
