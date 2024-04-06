import complexNum.*;

/**
 * @author PetSoft
 * @date 04.04.2024 23:01
 */
public class App {
    public static void main(String[] args) {
        iComplex decorator = new Decorator(new Complex(0, 0), new Logger());
        ViewComplex viewComplex = new ViewComplex(decorator);
        viewComplex.run();
    }
}
