package Clases;

public class Servicios {
    private int Id;
    private String Descripcion;
    private Double Valor;

    public Servicios(int id, String descripcion, Double valor) {
        Id = id;
        Descripcion = descripcion;
        Valor = valor;
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

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double valor) {
        Valor = valor;
    }

}
