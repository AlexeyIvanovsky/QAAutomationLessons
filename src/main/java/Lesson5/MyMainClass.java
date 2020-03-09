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




















//public class MyMainClass {
//    public static void main(String[] args){
//        String myName = "My name is Alexey. Hi!";
//        printBeautifully(myName, symbol: '$');
//
//        printBeautifully(somethingToDisplay: myName, symbol: '$');
//
//    }
//
//    public static void printBeautifully (String somethingToDisplay, char symbol) {
//
//        System.out.println(symbol + "       " + symbol);
//        System.out.println(somethingToDisplay);
//        System.out.println("       ");
//    }
//
//}