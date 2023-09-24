package org.example;


import interfaces.Calculable;
import interfaces.ICalculableFactory;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }
    /**
     *  метод run для взаимодействия с пользователем.
     */
    public void run() {
        while (true) {
            int primaryArg = argument("Введите первый аргумент: ");
            Calculable calculator = calculableFactory.create(primaryArg, true);
            while (true) {
                String cmd = action("Введите команду (*, +, /, =) ");
                if (cmd.equals("*")) {
                    int arg = argument("Введите второй аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    int arg = argument("Введите второй аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    int arg = argument("Введите второй аргумент: ");
                    calculator.div(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }
            String cmd = action("Еще (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }
    /**
     *  ввод аргументов и действий.
     */
    private String action (String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int argument (String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}