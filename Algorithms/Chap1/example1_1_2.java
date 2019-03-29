package Chap1;

public class example1_1_2 {
    /*
    *  Calcuate that:
    *  a. ( 1 + 2.236 ) / 2
    *  b. 1 + 2 + 3 + 4.0
    *  c. 4.1 >= 4
    *  d. 1 + 2 + "3"
    */
    public static void main(String[] args){
        System.out.println( ( 1 + 2.236 ) / 2 ); // 1.618
        System.out.println( 1 + 2 + 3 + 4.0 ); //10.0
        System.out.println( 4.1 >= 4 ); // true
        System.out.println( 1 + 2 + "3" );  // 33 here,due 1+2=3, then 3 change to "3". so its string"33" here.

    }
}
