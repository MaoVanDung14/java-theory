public class IfElse {
    public static void main(String[] args){
        int time = 19; //tao bien time 
        if (time >= 0 && time <= 11){ //Dieu kien
            System.out.println("Good morning!");
        }
        else if (time >= 12 && time <= 18){
            System.out.println("Good afternoon!");
        }
        else {
            System.out.println("Good night!");
        }

        //biến = (điều kiện) ? biểu thứcTrue : biểu thứcfalse;
        /*int time = 20;
          String result;
          result = (time < 18) ? "Good day." : "Good evening.";
          System.out.println(result); */
    }
    
}
