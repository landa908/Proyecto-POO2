package Clases;

import java.util.List;

public class Reserva {
    private List<Habitacion> habitaciones;
    private List<Restaurante> restaurantes;
    private List<Baño> baños;
    private List<Lavanderia> lavanderias;
    private Double precio;

    public Reserva() {
    }

    public Reserva(List<Habitacion> habitaciones, List<Restaurante> restaurantes, List<Baño> baños, List<Lavanderia> lavanderias, Double precio) {
        this.habitaciones = habitaciones;
        this.restaurantes = restaurantes;
        this.baños = baños;
        this.lavanderias = lavanderias;
        this.precio = precio;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public List<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(List<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public List<Baño> getBaños() {
        return baños;
    }

    public void setBaños(List<Baño> baños) {
        this.baños = baños;
    }

    public List<Lavanderia> getLavanderias() {
        return lavanderias;
    }

    public void setLavanderias(List<Lavanderia> lavanderias) {
        this.lavanderias = lavanderias;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


}
