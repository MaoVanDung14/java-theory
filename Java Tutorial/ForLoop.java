public class ForLoop {
    //Biet chinh xac muon lap bao nhieu lan thi dung For
    public static void main(String[] args){
        for(int i = 1; i <= 2; i++){
            System.out.println("Outer: " + i);

            for(int j = 1; j <= 10; j = j + 2){//khai bao bien; dieu kien;thuc hien moi luc sau khi khoi ma duoc thuc thi
                System.out.println("Inter: " + j);
            }
        }
    }
    
}
