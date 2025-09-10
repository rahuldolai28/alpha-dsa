public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        char c = 'c';
        System.out.println(a + " Type is not promoted");
        System.out.println((int)a + " Type is promoted" ) ;
        System.out.println(b-a+c + " Type is promoted" );

        // In java type promotion is by default from 
        // any to int

        
        byte x = 5;
        //wrong
        // b = b*2;
        x = (byte)(x*2);
        System.out.println(x);

        int $ = 24;
        System.out.println($);
    }
    
}
