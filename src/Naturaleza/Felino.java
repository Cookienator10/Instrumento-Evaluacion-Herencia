package Naturaleza;


// Clase Felino que hereda de Animal
public class Felino extends Animal {
    public Felino(String foto, String comida, String localizacion, String tamaño) {
        super(foto, comida, localizacion, tamaño);
    }

    //  rugir
    public void rugir() {
        System.out.println("El felino está rugiendo.");
    }
}