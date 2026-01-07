package basic_things;

public class AsciiNumbers {
    static void main(String[] args) {
        // typecasting -> conversion of one datatype to another datatype
        // Implicit typecasting
        char ch = 'A';
        int x = ch;
        System.out.println(x);

        // Explicit typecasting
        char ch1 = 'a';
        int y = (int)ch1;
        System.out.println(y);

        char ch2 = '3';
        System.out.println((int)ch2);

       // Integer to Character
        int x1 = 65;
        char ch4 = (char)x1;
        System.out.println(ch4);

        int x2 = 35;
        char ch5 = (char)x2;
        System.out.println(ch5);
    }
}
