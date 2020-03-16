package Lesson6;

import java.sql.SQLOutput;

public class MyHomeTask {

    public static void main (String[]args){

        Integer time1 = 0;
        Integer time2 = 0;
        Integer time3 = 0;
        Integer time4 = 0;
        Integer time5 = 0;
        Integer totalMinutesSpent = 0;

        time1 = sleeping(time1);
        totalMinutesSpent = interimResult(totalMinutesSpent, time1);

        time2 = eating(time2);
        totalMinutesSpent = interimResult(totalMinutesSpent, time2);

        time3 = working(time3);
        totalMinutesSpent = interimResult(totalMinutesSpent, time3);

        time4 = walking(time4);
        totalMinutesSpent = interimResult(totalMinutesSpent, time4);

        time5 = youtubewatching(time5);
        totalMinutesSpent = interimResult(totalMinutesSpent, time5);

        timeResult(totalMinutesSpent);
    }

    public static Integer sleeping(Integer a) {
        Integer sleepingTime = 9;
        System.out.print("Я провожу " + sleepingTime + " часов времени для сна");
        return sleepingTime;
    }

    public static Integer eating(Integer a) {
        Integer eatingTime = 2;
        System.out.print("Я провожу " + eatingTime + " часов времени для приема пищи");
        return eatingTime;
    }

    public static Integer working(Integer a) {
        Integer workingTime = 8;
        System.out.print("Я провожу " + workingTime + " часов времени для работы");
        return workingTime;
    }

    public static Integer walking(Integer a) {
        Integer walkingTime = 3;
        System.out.print("Я провожу " + walkingTime + " часов времени для прогулки");
        return walkingTime;
    }

    public static Integer youtubewatching(Integer a) {
        Integer youtubewatchingTime = 2;
        System.out.print("Я провожу " + youtubewatchingTime + " часов времени для просмотра ютубчика");
        return youtubewatchingTime;
    }

    public static Integer interimResult(Integer a, Integer b) {
        Integer interimTime = a + b;
        System.out.println(" -->> Это уже " + interimTime + " часов времени");
        return interimTime;
    }

    public static void timeResult(Integer a) {
        System.out.println("Итоговое время на все мои действия за день это " + a + " часа");
    }

}
