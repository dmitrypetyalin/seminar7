package complexNum;

import java.util.Scanner;

/**
 * @author PetSoft
 * @date 05.04.2024 20:17
 */
public class ViewComplex {
    private iComplex complex;

    public ViewComplex(iComplex complex) {
        this.complex = complex;
    }

    public void run() {
        while (true) {
            int real = promptInt("Введите первое вещественное число: ");
            int imaginary = promptInt("Введите второе вещественное число: ");
            complex = new Complex(real, imaginary);
//            complex.sum(new Complex(real, imaginary));
            while (true) {
                String cmd = prompt("Введите команду (*, +, -, =) : ");
                if (cmd.equals("+")) {
                    complex.sum(getComplex());
                    continue;
                }
                if (cmd.equals("-")) {
                    complex.sub(getComplex());
                    continue;
                }
                if (cmd.equals("*")) {
                    complex.multi(getComplex());
                    continue;
                }
                if (cmd.equals("=")) {
                    System.out.printf("Результат %s\n", complex.getResult());
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private iComplex getComplex() {
        int real = promptInt("Введите первое вещественное число второго аргумента: ");
        int imaginary = promptInt("Введите второе вещественное число второго аргумента: ");
        return new Complex(real, imaginary);
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
