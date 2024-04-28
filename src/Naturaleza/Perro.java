package Naturaleza;

// Clase Perro que hereda de Canino
public class Perro extends Canino {
    public Perro(String foto, String comida, String localizacion, String tamaño) {
        super(foto, comida, localizacion, tamaño);
    }

    // Método para vacunar al perro
    public void comer() {
        System.out.println("El perro está comiendo.");
    }

    // Método para vacunar al perro
    public void hacerRuido() {
        System.out.println("El perro está ladrando ruido.");
    }
    // Método para vacunar al perro
    public void vacunar() {
        System.out.println("El perro está siendo vacunado.");
    }

    // Método para pasear al perro
    public void pasear() {
        System.out.println("El perro está paseando.");
    }

    // Sobrescribir el método toString para imprimir los detalles del perro
    @Override
    public String toString() {
        return "Perro: [Foto=" + getFoto() + ", Comida=" + getComida() + ", Localización=" + getLocalizacion() + ", Tamaño=" + getTamaño() + "]";
    }

    // Método main para probar la clase Perro
    public static void main(String[] args) {
        // Crear un objeto de la clase Perro
        Perro miPerro = new Perro("fotoPerro.jpg", "comidaPerro", "calle", "tamañoMediano");

        // Imprimir el objeto Perro
        System.out.println(miPerro);

        // Llamar a los métodos del perro para realizar acciones
        miPerro.comer();
        miPerro.hacerRuido();
        miPerro.vacunar();
        miPerro.pasear();
    }
}


