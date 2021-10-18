package ru.skypro;

public class Main {

    public static void main(String[] args) {
	task1();
    task2();
    task3();
    }
    public static void task1 () {

        int i = 1;

        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

    for (int num = 10; num > 0; num--) {
        if (num == 1) {
            System.out.println(num);
            break;
        }
            System.out.print(num + " ");

    }

    }

    public static void task2 () {

        int firstFriday = 5;

        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница, " + currentFriday + "ое число." + "Необходимо подготовить отчет.");
        }

    }

    public static void task3 () {

        int year = 2021;
        int beginning = year - 200;
        int end = year + 100;

        for (int a = beginning; a < end; a++) {
            if (a % 79 ==0) {
                System.out.println(a);
            }



    }


    }

}
