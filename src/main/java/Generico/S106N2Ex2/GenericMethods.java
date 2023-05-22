package Generico.S106N2Ex2;

public class GenericMethods {

    // Método con una lista de argumentos de variable indefinida
    public <T> void printArgs(T... args) {
        for (T arg : args) {
            System.out.println(arg);
        }
    }
}

