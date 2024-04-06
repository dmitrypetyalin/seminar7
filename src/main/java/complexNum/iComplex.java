package complexNum;

/**
 * The interface provides basic methods to deal with complex numbers, such as summation, subtraction and multiplication.
 * Also, there are methods receiving integer representation of the parts of complex number and their string representation.
 * @author PetSoft
 * @date 04.04.2024 22:14
 */
public interface iComplex {
    iComplex sum(iComplex arg);
    iComplex sub(iComplex arg);
    iComplex multi(iComplex arg);
    int getReal();
    int getImaginary();
    String getResult();
}
