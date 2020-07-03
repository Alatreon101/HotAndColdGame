package src.com.dragon;

import java.util.Scanner;

/*
 */

public class HotColdGame {

    private static int rnd(int maxNum) {
        return (int) (Math.random() * ++maxNum);
    }

    public static void main(String[] args) {

        boolean yn;

        int maxNum = 100;
        int rndNum = rnd(maxNum);
        System.out.println(rndNum);

        System.out.println("Ведьмак уже загадал число! \nТвой ход!");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (rndNum > number) {
            System.out.println("Бери больше!");
        } else if (rndNum < number) {
            System.out.println("Бери меньше!");
        } else {
            System.out.println("Ты - Ведьмак!");
        }
    }
}
