package src.com.dragon;

import java.util.Scanner;

/*
 */

public class HotColdGame {

    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new HotColdGame().guessNumber();
    }

    public void guessNumber() {
        int rnd = (int) (Math.random() * 100) + 1;
        guessNumber(rnd);
    }

    public void guessNumber(int numToGuess) {
        int supposeNum;
        do {
            supposeNum = askNum("Попробуйте угадать случайное число. Введите Ваше число или введите \"exit\" для выхода ");
            System.out.println(hotColdMessage(numToGuess, supposeNum));
        } while (numToGuess != supposeNum);
    }

    private String hotColdMessage(int numToGuess, int supposeNum) {
        final int diff = Math.abs(numToGuess - supposeNum);

        if (diff == 0)
            return "Угадал";
        if (diff < 5) {
            return "Огонь!";
        }
        if ((diff > 5) && (diff <= 10)) {
            return "Горячо";
        }
        return "Холодно";
    }

    public int askNum(String message) {
        System.out.println(message);
        String userInput;
        do {
            userInput = sc.next();
            if ("exit".equals(userInput)) {
                System.exit(0);
            }
            if (!isNumber(userInput)) {
                System.out.println("Ошибка ввода! Попытайся снова!");
            }
        } while (!isNumber(userInput));
        return Integer.parseInt(userInput);
    }

    private boolean isNumber(String supposedStr) {
        try {
            Integer.parseInt(supposedStr);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
