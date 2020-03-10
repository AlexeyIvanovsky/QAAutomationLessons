package Lesson5;

public class MyMainClass {

    public static void main(String[] args) {
        String myString;

        myString = concateStrings( "Belka","Luche Strelki",'-');
        printMyString(myString);
    }

    public static String concateStrings (String a, String b, char c) {
        String myConcateString;
        myConcateString = a + c + b;

        return myConcateString;
    }

    public static void printMyString(String myString) {
        System.out.println(myString);
    }

}