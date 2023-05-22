package Generico.S106N3Ex1;

public class Smartphone implements Telefono {
    @Override
    public void llamar() {
        System.out.println("Llamando desde el smartphone...");
    }

    public void hacerFotos() {
        System.out.println("Tomando foto con el smartphone...");
    }
}

