package basic_things;

public class IncrementDecrement {
    static void main(String[] args) {
        // incrementing the value
        int x = 10 ;
        System.out.println(x); // 10
        x = x+1;
        System.out.println(x); // 11

        // Post-Increment -> x++
        int x1 = 100;
        System.out.println(x1++); // 100  // first use the value then increment the value x1 was 100 initially so 100 was printed after incremented then again when x1 is printed 101 was printed
        System.out.println(x1); // 101

        // Pre-increment -> ++x
        int x2 = 20; 
        System.out.println(++x2); // 21 // first increment the value then use the value . 
        System.out.println(x2); // 21

        // Decrementing the value
        // Post-decrement
        int y = 10;
        System.out.println(y--); // 10
        System.out.println(y); // 9

        // Pre-decrement
        int y1 = 10;
        System.out.println(--y1); // 9 
        System.out.println(y1); // 9 
    }
}
