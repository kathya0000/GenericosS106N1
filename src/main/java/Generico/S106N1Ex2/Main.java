package Generico.S106N1Ex2;

public class Main {
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();

        // Crear una instancia de Persona
        Persona persona = new Persona("John", "Doe", 30);

        // Llamada al método genérico
        gm.printThree(persona, "Hello, World!", 42);
    }
}

