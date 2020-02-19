package Menu;

import Clases.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        List<String> pedidoCliente= new <String>ArrayList();
        int codigo=0;
        boolean camarote =false;

        Habitacion ha_pr1 = new Habitacion(001, "Cama Sencilla          ", 40000.0);
        Habitacion ha_pr2 = new Habitacion(002, "Cama Doble             ", 60000.0);
        Habitacion ha_ca1 = new Habitacion(003, "Camarote Nivel inferior", 20000.0);
        Habitacion ha_ca2 = new Habitacion(004, "Camarote Nivel superior", 30000.0);
        List<Habitacion> habitaciones = new ArrayList<>();
        habitaciones.add(ha_pr1);
        habitaciones.add(ha_pr2);
        habitaciones.add(ha_ca1);
        habitaciones.add(ha_ca2);

        Restaurante al1 = new Restaurante(001, " Desayuno              ", 14000.0);
        Restaurante al2 = new Restaurante(002, " Almuerzo              ", 18000.0);
        Restaurante al3 = new Restaurante(003, " Cena                  ", 10000.0);
        List<Restaurante> restaurantes = new ArrayList<>();
        restaurantes.add(al1);
        restaurantes.add(al2);
        restaurantes.add(al3);

        Lavanderia l1 = new Lavanderia(001, "Con Lavanderia         ", 5000.0);
        Lavanderia l2 = new Lavanderia(002, "Sin lavanderia            ", 0.0);
        List<Lavanderia> lavanderias = new ArrayList<>();
        lavanderias.add(l1);
        lavanderias.add(l2);

        Baño b1 = new Baño(001, "Privado                ", 8000.0);
        Baño b2 = new Baño(002, "Sin baño                  ", 0.0);
        List<Baño> baños = new ArrayList<>();
        baños.add(b1);
        baños.add(b2);

        Reserva miReserva = new Reserva(habitaciones, restaurantes, baños, lavanderias,0.0);

        miReserva.setHabitaciones(habitaciones);
        miReserva.setRestaurantes(restaurantes);
        miReserva.setBaños(baños);
        miReserva.setLavanderias(lavanderias);

        System.out.println("");
        System.out.println("     << HOSTAL LA MARAVILLA >>");
        System.out.println("");
        System.out.println("        ----------------------- ");
        System.out.println("        |  Tipo de Hospedaje  |");
        System.out.println("        -----------------------");
        System.out.println("COD      DESCRIPCION            PRECIO");
        for (Habitacion Habitacion: miReserva.getHabitaciones()){
            System.out.println(" " + Habitacion.getId() + "    " + Habitacion.getDescripcion() + "   " + Habitacion.getPrecio());
        }
        System.out.print(" Seleccione codigo: ");
        codigo=sc.nextInt();
        for (Habitacion Habitacion: miReserva.getHabitaciones()){
            if(codigo==Habitacion.getId()){
                pedidoCliente.add(Habitacion.getDescripcion());
                pedidoCliente.add(Habitacion.getPrecio().toString());
                if(codigo==3 ||codigo==4){
                    camarote=true;
                }
                break;
            }
        }
        codigo=0;
        System.out.println("");
        System.out.println("        ------------------------- ");
        System.out.println("        |Servicio de Alimentación|");
        System.out.println("        ------------------------- ");
        System.out.println("COD      DESCRIPCION            PRECIO");
        for (Restaurante Restaurante: miReserva.getRestaurantes()){
            System.out.println(" " + Restaurante.getId() + "    " + Restaurante.getDescripcion() + "   "  + Restaurante.getPrecio());
        }
        System.out.print(" Seleccione codigo: ");
        codigo=sc.nextInt();
        for (Restaurante Restaurante: miReserva.getRestaurantes()){
            if(codigo==Restaurante.getId()) {
                pedidoCliente.add(Restaurante.getDescripcion());
                pedidoCliente.add(Restaurante.getPrecio().toString());
                break;
            }
        }
        codigo=0;
        System.out.println("");
        System.out.println("        ----------------------- ");
        System.out.println("        |Servicio de Lavandería|");
        System.out.println("        ----------------------- ");
        System.out.println("COD      DESCRIPCION            PRECIO");
        for (Lavanderia Lavanderia: miReserva.getLavanderias()){
            System.out.println(" " + Lavanderia.getId() + "    " + Lavanderia.getDescripcion() + "   " + Lavanderia.getPrecio());
        }
        System.out.print(" Seleccione codigo: ");
        codigo=sc.nextInt();
        for (Lavanderia Lavanderia: miReserva.getLavanderias()){
            if(codigo==Lavanderia.getId()) {
                pedidoCliente.add(Lavanderia.getDescripcion());
                pedidoCliente.add(Lavanderia.getPrecio().toString());
                break;
            }
        }
        codigo=0;
        System.out.println("");
        System.out.println("        ----------------------- ");
        System.out.println("        |  Servicio de Baño   |");
        System.out.println("        ----------------------- ");
        System.out.println("COD      DESCRIPCION            PRECIO");
        for (Baño Baño: miReserva.getBaños()){
            System.out.println(" " + Baño.getId() + "    " + Baño.getDescripcion() +"   " + Baño.getPrecio());
        }
        System.out.print(" Seleccione codigo: ");
        codigo=sc.nextInt();
        for (Baño Baño: miReserva.getBaños()){
            if(codigo==Baño.getId()) {
                pedidoCliente.add(Baño.getDescripcion());
                pedidoCliente.add(Baño.getPrecio().toString());
                break;
            }
        }
        codigo=0;
        double precioTotal=0;
        System.out.println("");
        System.out.println("        ---------------------------");
        System.out.println("        |  Factura para el Cliente |");
        System.out.println("        ---------------------------");
        for(int i = 0;i<pedidoCliente.size() ;i++) {
            if(i%2==0) {
                System.out.println("Descripcion: "+pedidoCliente.get(i));
            }
            else {
                System.out.println("Valor: "+pedidoCliente.get(i));
                precioTotal=precioTotal+Double.parseDouble(pedidoCliente.get(i));
            }
        }
        System.out.println("");
        System.out.println("Precio total: "+precioTotal);
        if(camarote==true)
        {
            System.out.println("Usted aplica a rebaja en servicios");
            double costoServicios= precioTotal - Double.parseDouble(pedidoCliente.get(1));
            System.out.println("El valor de los servicios es: "+costoServicios);
            double descuento=costoServicios*0.05;
            System.out.println("El descuento del 5% equivale a : "+descuento);
            costoServicios= costoServicios-descuento;
            double totalAPagar = costoServicios + Double.parseDouble(pedidoCliente.get(1));
            System.out.println("Total a pagar: "+totalAPagar);
        }else
        {
            System.out.println("Total a pagar: "+precioTotal);
        }
    }
}
