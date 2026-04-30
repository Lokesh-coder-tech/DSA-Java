//Bitwise Operator

public class Day16 {
    public static void main(String[] args) {
        System.out.println(5 & 3);   //AND (&)-Result is 1 only if both bits are 1
        System.out.println(5 | 3);   //OR (|)-Result is 1 if at least one bit is 1
        System.out.println(5 ^ 3);   //XOR (^)-Result is 1 if bits are different

        //NOT (~)-Flips all bits (0 → 1, 1 → 0)
        System.out.println(~5); // Output: -6(Because Java uses 2’s complement for negative numbers.)

        //Left Shift (<<), Shifts bits to left (adds zeros on right), Equivalent to multiply by 2
        System.out.println( 5 << 1);

        //Right Shift (>>), Shifts bits to right, Equivalent to divide by 2
        System.out.println(5 >> 1);

        //Unsigned Right Shift (>>>), Same as >> but always fills left with 0
        System.out.println(-5 >>> 1);


    }
}
