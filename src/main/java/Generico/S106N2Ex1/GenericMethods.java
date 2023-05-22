package Generico.S106N2Ex1;

public class GenericMethods {

    // Método con dos argumentos genéricos y uno específico (String)
    public <T> void printThree(T arg1, String arg2, T arg3) {
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println(arg3);
    }
}

