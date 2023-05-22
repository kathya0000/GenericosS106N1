package Generico.S106N3Ex1;

public class Principal {
    public static void main(String[] args) {
        Generica generica = new Generica();
        Smartphone smartphone = new Smartphone();

        generica.metodoGenericoTelefono(smartphone);
        generica.metodoGenericoSmartphone(smartphone);
    }
}

   /* la respuesta es no. El método metodoGenericoTelefono(T t)
    solo puede llamar a los métodos definidos en la interfaz Telefono,
    ya que el parámetro genérico T está acotado por Telefono (<T extends Telefono>).
    */