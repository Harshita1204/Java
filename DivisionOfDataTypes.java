package basic_things;

public class divisionOfDataTypes {
    static void main(String[] args) {
        double x = 5/2;  // division of int and int will give an int value but as it is stored in double so the output will be = 2.0 .
        double x1 = 5.0/2;  // 1 double value and one int will give a double value so the output now will be 2.5 .
        double x2 = 5.0/2.0; // both double // output = 2.5
        double x3 = 5/2.0; // 1 double // output  = 2.5
        System.out.println(x);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}
