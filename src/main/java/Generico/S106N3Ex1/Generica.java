package Generico.S106N3Ex1;

public class Generica<T> {
    public <T extends Telefono> void metodoGenericoTelefono(T t) {
        t.llamar();
    }

    public <T extends Smartphone> void metodoGenericoSmartphone(T t) {
        t.llamar();
        t.hacerFotos();
    }
}

