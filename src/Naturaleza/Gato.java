package Naturaleza;

// Clase Gato que hereda de Felino
public class Gato extends Felino {
    public Gato(String foto, String comida, String localizacion, String tamaño) {
        super(foto, comida, localizacion, tamaño);
    }

    // comer
    public void comer() {
        System.out.println("El gato está comiendo.");
    }

    //ruido
    public void hacerRuido() {
        System.out.println("El gato está haciendo ruido.");
    }

    //  vacunar
    public void vacunar() {
        System.out.println("El gato está siendo vacunado.");
    }

    // Sobrescribir el método toString para imprimir los detalles del gato
    @Override
    public String toString() {
        return "Gato: [Foto=" + getFoto() + ", Comida=" + getComida() + ", Localización=" + getLocalizacion() + ", Tamaño=" + getTamaño() + "]";
    }

    // gato en consola
    public static void main(String[] args) {
        // Crear un objeto de la clase Gato
        Gato miGato = new Gato("fotoGato.jpg", "comidaGato", "casa", "tamañoMediano");

        // Imprimir el objeto Gato
        System.out.println(miGato);

        // Llamar a los métodos del gato para realizar acciones
        miGato.comer();
        miGato.hacerRuido();
        miGato.vacunar();
    }
}

