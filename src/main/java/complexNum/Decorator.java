package complexNum;

/**
 * Class is the adapter for Complex and Logger classes.
 * @author PetSoft
 * @date 05.04.2024 23:08
 */
public class Decorator implements iComplex {
    private Complex oldComplex;
    private Logger logger;

    /**
     * Class constructor.
     * @param complex - instance of the Complex class.
     * @param logger - instance of the Logger class.
     */
    public Decorator(Complex complex, Logger logger) {
        this.oldComplex = complex;
        this.logger = logger;
    }

    @Override
    public iComplex sum(iComplex arg) {
        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода sum с параметром %s", oldComplex.getResult(), arg.getResult()));
        iComplex result = oldComplex.sum(arg);
        logger.log(("Вызова метода sum произошел"));

        return result;
    }

    @Override
    public iComplex sub(iComplex arg) {
        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода sub с параметром %s", oldComplex.getResult(), arg.getResult()));
        iComplex result = oldComplex.sub(arg);
        logger.log(("Вызова метода sub произошел"));

        return result;
    }

    @Override
    public iComplex multi(iComplex arg) {
        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода multi с параметром %s", oldComplex.getResult(), arg.getResult()));
        iComplex result = oldComplex.multi(arg);
        logger.log(("Вызова метода multi произошел"));

        return result;
    }

    @Override
    public int getReal() {
        int real = oldComplex.getReal();
        logger.log(String.format("Получение первого вещественного числа %d", real));
        return real;
    }

    @Override
    public int getImaginary() {
        int imaginary = oldComplex.getImaginary();
        logger.log(String.format("Получение второго вещественного числа %d", imaginary));
        return imaginary;
    }

    @Override
    public String getResult() {
        String result = oldComplex.getResult();
        logger.log(String.format("Получение результата %s", result));
        return result;
    }
}
