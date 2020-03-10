package Lesson5;

import java.util.Scanner;

public class MyHomeTask {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_ORANGE = "\u001B[25m";

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");

        String digit1 = sc.nextLine();
        Integer parsedDigit1 = Integer.parseInt(digit1);

        System.out.print("Введите второе число: ");

        String digit2 = sc.nextLine();
        Integer parsedDigit2 = Integer.parseInt(digit2);

        Integer summa = addition(parsedDigit1, parsedDigit2);

        Integer raznost = subtraction(parsedDigit1, parsedDigit2);

        result(parsedDigit1, parsedDigit2, summa, raznost);

        }

        public static Integer addition (Integer a, Integer b){

            Integer additionNumbers = a + b;
            return additionNumbers;
        }

        public static Integer subtraction (Integer a, Integer b){

            Integer subtractionNumbers = a - b;
            return subtractionNumbers;

        }

        public static void result (Integer a, Integer b, Integer c, Integer d) {

            System.out.println(ANSI_GREEN + "Вы сложили числа " + a + " и " + b + " и сумма равна " + c + ANSI_RESET);
            System.out.println(ANSI_CYAN + "Вы вычли из числа " + a + " число " + b + " и разность равна " + d + ANSI_RESET);

        }

}
