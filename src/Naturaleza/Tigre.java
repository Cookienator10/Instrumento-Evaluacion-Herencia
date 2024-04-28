package Naturaleza;

// Clase Tigre que hereda de Felino
public class Tigre extends Felino {
    public Tigre(String foto, String comida, String localizacion, String tamaño) {
        super(foto, comida, localizacion, tamaño);
    }

    // Método para que el tigre coma
    public void comer() {
        System.out.println("El tigre está comiendo.");
    }

    // Método para que el tigre haga ruido
    public void hacerRuido() {
        System.out.println("El tigre está haciendo rugido.");
    }

    // Sobrescribir el método toString para imprimir los detalles del tigre
    @Override
    public String toString() {
        return "Tigre: [Foto=" + getFoto() + ", Comida=" + getComida() + ", Localización=" + getLocalizacion() + ", Tamaño=" + getTamaño() + "]";
    }

    // Método main para probar la clase Tigre
    public static void main(String[] args) {
        // Crear un objeto de la clase Tigre
        Tigre miTigre = new Tigre("fotoTigre.jpg", "comidaTigre", "selva", "tamañoGrande");

        // Imprimir el objeto Tigre
        System.out.println(miTigre);

        // Llamar a los métodos del tigre para realizar acciones
        miTigre.comer();
        miTigre.hacerRuido();
    }
}
