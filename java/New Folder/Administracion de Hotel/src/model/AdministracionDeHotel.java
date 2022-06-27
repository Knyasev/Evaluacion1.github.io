/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author Gonzalez G
 */
public class AdministracionDeHotel {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cliente c1= new Cliente("Mario Alejandro", "Martines Pineda","14784578");
        Cliente c2= new Cliente("Jose Rodrigo", "Velez Carrion","478541254");
        Cliente c3= new Cliente("Maria Julia", "Velazquez Romel","1958658");
        
        Banio b1 = new Banio(2, "Shampo,Jabon,cepillo de dientes,Pasta dental");
        Banio b3 = new Banio(1, "Shampo,Jabon,cepillo de dientes,Pasta dental");
        
        Chef ch1 = new Chef(001, "Chef", "Alejandro", "Martines","147852" );
        Chef ch2 = new Chef(002, "Chef", "Victor", "Ojeda","78451236" );
        
        Cocina co1 =new Cocina("7 x 7",true);
        
        Habitacion h1 = new Habitacion(true,2,2,10.10f,"Presidencial",20.00f,111);
        
        Hotel hotel = new Hotel("CAMERUM HOTEL", 5,15,"12454758", 5,true, "Los Lagos","11-05-2018");
        
        Reservacion reservacion = new Reservacion( 1, 4, 10f, "Normal");
        Recepcion recepcion = new  Recepcion(15, 14.5f, "Habitaciones Especiales",hotel);
        
        Recepcionista recepcionista = new Recepcionista( 5, "Gerente", "Wilson", "Gonzalez","1154875");
        recepcion.getRecepcionList().add(recepcionista);
        
        reservacion.getTiempoEstancia();
        Bar br1 = new Bar(40,40);
        ReservacionComida re1= new ReservacionComida(2.00f,1.00f,1.50f,"Pollo frito","Cafe con humas","Costilla de cerdo",true,true, true);
        re1.precioComidaPorHuesped(reservacion);
        
        RealizarEvento env1 = new RealizarEvento("Cumpleanios","14/09/2022","6 horas");
        ServicioAdicional sr1= new ServicioAdicional(true,false,false,false,true,false);
        env1.precioEvento(sr1);
        sr1.precioAddServicio(reservacion);

        Servicio servicio = new Servicio();
        reservacion.valorSubtotal(reservacion, re1, h1, sr1, servicio);

        Factura factura = new Factura(222, "26/06/2022","1245645654");
        factura.calcularTotal(reservacion, re1, servicio, sr1, h1);
        
        //Factura
        System.out.println("*******************************************************************");
        System.out.println("\t\t\t"+hotel.getNombre());
        System.out.println("*******************************************************************");
        System.out.println("   Ruc Factura:"+factura.getRuc()+"   Fecha:"+ factura.getFecha()+"    Numero:"+factura.getNumero());
        System.out.println("*******************************************************************");
        System.out.println("  Datos de hotel");
        System.out.println("\tRUC:        "+hotel.getRuc()+"  \tNumero de Estrellas:"+hotel.getNumeroEstrella()+"\n\tUbicacion:  "+hotel.getUbicacion());
        System.out.println("*******************************************************************");
        System.out.println("  Datos de Cliente");
        System.out.println("\tNombres:   "+c1.getNombre()+"\tApellidos: "+c1.getApellido()+"\n\tCl.Identificacion: "+c1.getIdentificacion());
        System.out.println("*******************************************************************");
        System.out.println("  Datos de Reservacion");
        System.out.println("\tN.Huepedes: "+reservacion.getNumeroHuespedes()+"\t\tTiempo Estancia(Dias): "+reservacion.getTiempoEstancia());
        System.out.println("\tNumero Habitacion: "+h1.getNumeroHabitacion()
        +"\tNumero Banios: "+h1.getNumeroBaños()+"\n\tNumero de Camas: "+h1.getNumeroCamas()
        +"\tTipo de Habitacion: "+h1.getTipoHabitacion()+"\n\tPrecio Habitacion: "+h1.getPrecioHabitacion());
        System.out.println("  Elementos aceo: "+b1.getElementosAceoPersonal());
        System.out.println("********************************************************************"); 
        System.out.println("  Servicios Adicionales");
        System.out.println("  |TvCable|Servicio Habitacion|Servicio Limpieza|Bar|Spa|Gimnacio|");
        System.out.println("   "+sr1.getTvCable()+"\t   "+sr1.getServicioHabitacion()+"\t       "+sr1.getServicioLimpieza()+"\t\t"+sr1.getBare()
                       +" "+sr1.getSpa()+" "+sr1.getGim());
        System.out.println("********************************************************************"); 
        System.out.println("  Descripcion");
        System.out.println("    Habitacion: \t    "+reservacion.getPrecioReservacion());
        System.out.println("    Servicios Adicionales:  "+ reservacion.getPrecioServicio());
        System.out.println("    Comida: \t\t    "+ re1.precioComidaPorHuesped(reservacion));
        System.out.println("********************************************************************");
        System.out.println("  Costos Totales");
        System.out.println(factura);
        System.out.println("********************************************************************");


     }
    
    
    
    
    
    
}
