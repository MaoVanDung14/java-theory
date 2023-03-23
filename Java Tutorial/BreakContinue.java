public class BreakContinue {
    public static void main(String[] args){
        for(int i = 1; i <= 10; i++){
            if(i == 4){
                break;// in den 4 roi dung(bo het nhung cai dang sau)
            }
            System.out.println(i);
        }

        for(int j = 1; j <= 10; j++){
            if(j == 5){
                continue;// ko in 5, con lai in tiep
            }
            System.out.println(j);
        }

        int i = 1;
        while( i < 10){
            
            if(i == 5){
                i++;
                continue;
            }
            System.out.println("White" + i);
        }
    }
    
}
