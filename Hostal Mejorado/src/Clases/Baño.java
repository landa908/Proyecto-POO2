package Clases;

public class Baño {

    private int Id;
    private String Descripcion;
    private Double Precio;

    public Baño(int id, String descripcion, Double precio) {
        Id = id;
        Descripcion = descripcion;
        Precio = precio;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }
}
