package Generico.S106N2Ex2;

public class Main {
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();

        // Crear una instancia de Persona
        Persona persona = new Persona("John", "Doe", 30);

        // Llamada al método con argumentos de variable indefinida
        gm.printArgs(persona, "Hello, World!", 42, "Extra String", 72, "Another String");
    }
}

