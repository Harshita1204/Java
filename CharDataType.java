package basic_things;

public class CharDataType {
    static void main(String[] args) {
        char x1 = 'a';
        System.out.println(x1);  // a
        char x2 = 'b';
        System.out.println(x2);  // b
        char x3 = 'c';
        System.out.println(x3);  // c
        char x4 = 'de'; // this will throw an error but it can only store single char in single quotes ,more than 1 character will be considered as string and it will be stored in double quotes
        System.out.println(x4); // error
    }
}
