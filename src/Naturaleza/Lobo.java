package Naturaleza;

// Clase Lobo que hereda de Canino
public class Lobo extends Canino {
    public Lobo(String foto, String comida, String localizacion, String tamaño) {
        super(foto, comida, localizacion, tamaño);
    }


    // Método para hacer ruido del lobo
    public void hacerRuido() {
        System.out.println("El lobo está aullando.");
    }
    @Override
    public String toString() {
        return "Lobo [foto=" + getFoto() + ", comida=" + getComida() + ", localizacion=" + getLocalizacion() + ", tamaño=" + getTamaño() + "]";
    }

    // Método main para probar la clase Lobo
    public static void main(String[] args) {
        // Crear un objeto de la clase Lobo
        Lobo miLobo = new Lobo("fotoLobo.jpg", "comidaLobo", "selva", "tamañoGrande");

        // Imprimir los detalles del lobo
        System.out.println(miLobo);

        // Llamar al método hacerRuido() del lobo
        miLobo.hacerRuido();
    }
}
