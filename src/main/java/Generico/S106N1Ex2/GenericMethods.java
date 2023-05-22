package Generico.S106N1Ex2;

public class GenericMethods {

    // Método genérico
    public <T> void printThree(T arg1, T arg2, T arg3) {
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println(arg3);
    }
}

