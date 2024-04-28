package Naturaleza;


// Clase Canino que hereda de Animal
public class Canino extends Animal {
    public Canino(String foto, String comida, String localizacion, String tamaño) {
        super(foto, comida, localizacion, tamaño);
    }

    public void rugir() {
        System.out.println("El canino está ladrando.");
    }

    //Método main para probar la clase Perro
    public static void main(String[] args) {
        // Crear un objeto de la clase Perro
        Lobo milobo = new Lobo("fotoPerro.jpg", "comidaPerro", "selva", "tamañoPequeño");

        // Imprimir el objeto Perro
        System.out.println(milobo);

        // Llamar a los métodos del perro para realizar acciones

        milobo.hacerRuido();
    }
}