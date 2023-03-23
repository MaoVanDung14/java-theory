public class OperatorsToanTu {

    public static void main(String[] args){
        //Toan tu so hoc
        int x = 5;
        int y = 2;
        System.out.println(x % y); // tra ve so du cua phep chia

        int z = 5;
        ++z;//Tang len 1
        --z;//Tru 1
        System.out.println(z);

        //Toan tu gán:
        int a = 10;// gan a = 10
        System.out.println(a);

        //Toan tu gan bo xung:

/*=	x = 5	x = 5	
+=	x += 3	x = x + 3	
-=	x -= 3	x = x - 3	
*=	x *= 3	x = x * 3	
/=	x /= 3	x = x / 3	
%=	x %= 3	x = x % 3	
&=	x &= 3	x = x & 3	
|=	x |= 3	x = x | 3	
^=	x ^= 3	x = x ^ 3	
>>=	x >>= 3	x = x >> 3	
<<=	x <<= 3	x = x << 3 */

        int g = 10;
        g += 5;// g cong them 5
        System.out.println(g);


        //Toan tu so sanh:
        /* == ,	!= , >,	< ,	>=,	<= */

        System.out.println(x > y);//Tra ve true or false


        //Toan tu Logic:
        /*&& 	and	x < 5 &&  x < 10	
        || 	or	x < 5 || x < 4	
        !	not	!(x < 5 && x < 10) */

    }
    
}
