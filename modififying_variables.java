package basic_things;

public class variableBasics {
    static void main(String[] args) {
        int x;
        x= 5;
        System.out.println(x);  // 5 will be printed
        x= 10;
        System.out.println(x);  // x is now updated to 10 so 10 will be printed
        x= x+20;
        System.out.println(x);   // as x is now 10 so 10+20 = 30 , 30 will be printed
    }
}
