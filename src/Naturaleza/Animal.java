package Naturaleza;

// Clase base Animal
public class Animal {
    private String foto;
    private String comida;
    private String localizacion;
    private String tamaño;

    public Animal(String foto, String comida, String localizacion, String tamaño) {
        this.foto = foto;
        this.comida = comida;
        this.localizacion = localizacion;
        this.tamaño = tamaño;
    }

    // Getters y Setters
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}
