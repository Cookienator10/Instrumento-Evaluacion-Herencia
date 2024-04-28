package Naturaleza;

// Clase Leon que hereda de Felino
public class Leon extends Felino {
    public Leon(String foto, String comida, String localizacion, String tamaño) {
        super(foto, comida, localizacion, tamaño);
    }

    // Método para que el león coma
    public void comer() {
        System.out.println("El león está comiendo.");
    }

    // Método para que el león haga ruido
    public void hacerRuido() {
        System.out.println("El león está haciendo ruido.");
    }

    // Método toString para imprimir los detalles del león
    @Override
    public String toString() {
        return "León: [Foto=" + getFoto() + ", Comida=" + getComida() + ", Localización=" + getLocalizacion() + ", Tamaño=" + getTamaño() + "]";
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crear un objeto de la clase Leon
        Leon miLeon = new Leon("fotoLeon.jpg", "comidaLeon", "sabana", "tamañoGrande");

        // Imprimir el objeto Leon
        System.out.println(miLeon);

        // Llamar a los métodos del león para realizar acciones
        miLeon.comer();
        miLeon.hacerRuido();
    }
}
