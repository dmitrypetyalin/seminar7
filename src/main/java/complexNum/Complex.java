package complexNum;

/**
 * @author PetSoft
 * @date 04.04.2024 20:19
 */
public class Complex implements iComplex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public iComplex sum(iComplex arg) {
        real += arg.getReal();
        imaginary += arg.getImaginary();
        return this;
    }

    @Override
    public iComplex sub(iComplex arg) {
        real -= arg.getReal();
        imaginary -= arg.getImaginary();
        return this;
    }

    @Override
    public iComplex multi(iComplex arg) {
        int r = real * arg.getReal() - imaginary * arg.getImaginary();
        int i = imaginary * arg.getReal() + real * arg.getImaginary();
        this.real = r;
        this.imaginary = i;
        return this;
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

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
