package complexNum;

/**
 * The Complex class represents a complex number. Implements interface iComplex.
 * Class provides basic operations on complex numbers such as addition, subtraction and multiplication.
 * @author PetSoft
 * @date 04.04.2024 20:19
 */
public class Complex implements iComplex {
    private int real;
    private int imaginary;

    /**
     * Class constructor.
     * @param real - first real part of complex number.
     * @param imaginary - second real part of complex number.
    * */
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Summation two complex numbers.
     * @param arg - instance of a iComplex type.
     * @return - reference to the current object.
     */
    @Override
    public iComplex sum(iComplex arg) {
        real += arg.getReal();
        imaginary += arg.getImaginary();
        return this;
    }

    /**
     * Subtraction two complex number.
     * @param arg - instance of a iComplex type.
     * @return - reference to the current object.
     */
    @Override
    public iComplex sub(iComplex arg) {
        real -= arg.getReal();
        imaginary -= arg.getImaginary();
        return this;
    }

    /**
     * Multiplication two complex number.
     * @param arg - instance of a iComplex type.
     * @return - reference to the current object.
     */
    @Override
    public iComplex multi(iComplex arg) {
        int r = real * arg.getReal() - imaginary * arg.getImaginary();
        int i = imaginary * arg.getReal() + real * arg.getImaginary();
        this.real = r;
        this.imaginary = i;
        return this;
    }

    /**
     * Receiving real class field value.
     * @return - integer representation of the number.
     */
    public int getReal() {
        return real;
    }

    /**
     * Receiving imaginary class field value.
     * @return - integer representation of the number.
     */
    public int getImaginary() {
        return imaginary;
    }

    /**
     * Convert int class fields to string format of the complex number.
     * @return a string representation of the complex number.
     */
    public String getResult() {
        if (real == 0 && imaginary == 0) {
            return String.valueOf(0);
        }
        if (real == 0) {
            return imaginary + "i";
        }
        if (imaginary == 0) {
            return String.valueOf(real);
        }
        return imaginary > 0 ? real + "+" + imaginary + "i" : real + "" + imaginary + "i";
    }
}
