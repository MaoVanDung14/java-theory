public class ArrayLoop {
    public static void main(String[] args){
        String[] motor = {"Honda" , "Yamaha", "Kawasaki"};
        for (int i = 0; i < motor.length; i++ ){
            System.out.println(motor[i]);
        }

        for(String j : motor){//(Bien : arrayname) 
            System.out.println(j);
        }

    }
    
}
