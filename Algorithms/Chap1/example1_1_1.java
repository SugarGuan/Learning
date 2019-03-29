package Chap1;

public class example1_1_1 {

    /* Calculate following answers:
     * a. ( 0 + 15 ) / 2
     * b. 2.0e-6 * 100000000.1
     * c. true && false || true && true
    */

    public static void main(String[] args){
        System.out.println( ( 0 + 15 ) / 2 ); // Molecule 0, 15 and denominator 2 are both integer. So answer here is also a integer.
        System.out.println( 2.0e-6 * 100000000.1 ); // 2.0e-6 = 0.000002.
        System.out.println( true && false || true && true ); // The answer 'true && false' is maintained all solutions.
    }
}
