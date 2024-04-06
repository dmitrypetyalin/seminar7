package complexNum;

/**
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
