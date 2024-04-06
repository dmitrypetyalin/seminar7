package complexNum;

import java.util.Scanner;

/**
 * ViewComplex class performs interaction with user.
 * @author PetSoft
 * @date 05.04.2024 20:17
 */
public class ViewComplex {
    private iComplex complex;

    /**
     * Class constructor
     * @param complex - an instance of iComplex type.
     */
    public ViewComplex(iComplex complex) {
        this.complex = complex;
    }

    /**
     * Method run() represents basic logic interaction with user.
     */
    public void run() {
        while (true) {
            int real = promptInt("Введите первое вещественное число: ");
            int imaginary = promptInt("Введите второе вещественное число: ");
            complex = new Complex(real, imaginary);
//            complex.sum(new Complex(real, imaginary));
            label:
            while (true) {
                String cmd = prompt("Введите команду (*, +, -, =) : ");
                switch (cmd) {
                    case "+":
                        complex.sum(getComplex());
                        continue;
                    case "-":
                        complex.sub(getComplex());
                        continue;
                    case "*":
                        complex.multi(getComplex());
                        continue;
                    case "=":
                        System.out.printf("Результат %s\n", complex.getResult());
                        break label;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    /**
     * Method is intended to interact with user and create new instance of the iComplex type.
     * @return - new instance of the iComplex type.
     */
    private iComplex getComplex() {
        int real = promptInt("Введите первое вещественное число второго аргумента: ");
        int imaginary = promptInt("Введите второе вещественное число второго аргумента: ");
        return new Complex(real, imaginary);
    }

    /**
     * Method prints message and interacts with user.
     * @param message - String message to print.
     * @return - new string received from user.
     */
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    /**
     * Method prints message and interacts with user.
     * @param message - String message to print.
     * @return - int number.
     */
    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
