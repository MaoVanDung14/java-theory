public class Array {
    public static void main(String[] args){
        String[] phone = {"Iphone", "Sam Sung", "Xiaomi"};
        phone[0] = "Vertu";//thay doi thanh phan
        int[] numbers = {1,2,3 };
        System.out.println(phone[0]);
        System.out.println(numbers[0]);
        System.out.println(phone.length);//Do dai mang


        //Mang da chieu:
        int[][] myNumbers = {{1,2,3,4} , {5,6,7}};
        System.out.println("Mang:" +myNumbers[1][2]);// [mang 2] [phan tu thu 3] 

        for(int i = 0; i < myNumbers.length; i++){
            for(int j = 0; j < myNumbers[i].length; j++){
                System.out.println(" for:" + myNumbers[i][j]);
            }
        }

    }   

}
