package Lesson4;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Scanner;

public class Lesson4 {

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

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");

        String digit1 = scanner.nextLine();
        Integer parsedDigit1 = Integer.parseInt(digit1);

        System.out.print("Введите второе число: ");

        String digit2 = scanner.nextLine();
        Integer parsedDigit2 = Integer.parseInt(digit2);

        System.out.print(ANSI_BLUE + "Результат сложения двух чисел: " + ANSI_RESET);
        System.out.println(ANSI_BLUE + (parsedDigit1 + parsedDigit2) + ANSI_RESET);

        System.out.print(ANSI_YELLOW + "Результат вычитания двух чисел: " + ANSI_RESET);
        System.out.println(ANSI_YELLOW + (parsedDigit1 - parsedDigit2) + ANSI_RESET);

    }
}
