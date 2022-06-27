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

        
        //cliente
        Cliente c1= new Cliente("Mario Alejandro", "Martines Pineda","14784578");
        //System.out.println(c1);
        Cliente c2= new Cliente("Jose Rodrigo", "Velez Carrion","478541254");
        //System.out.println(c2);
        Cliente c3= new Cliente("Maria Julia", "Velazquez Romel","1958658");
        //System.out.println(c3);
        
        //banio
        Banio b1 = new Banio(2, "Shampo,Jabon,cepillo de dientes,Pasta dental");
        //System.out.println(b1);
        Banio b2 = new Banio(3, "Shampo,Jabon,cepillo de dientes,Pasta dental");
        //System.out.println(b2);
        Banio b3 = new Banio(1, "Shampo,Jabon,cepillo de dientes,Pasta dental");
        //System.out.println(b3);
       
       
//        System.out.println(hotel);

        Chef ch1 = new Chef(001, "Chef", "Alejandro", "Martines","147852" );
        Chef ch2 = new Chef(002, "Chef", "Victor", "Ojeda","78451236" );
        
        Cocina co1 =new Cocina("7 x 7",true);
        //System.out.println(co1);

        Habitacion h1 = new Habitacion(true,2,2,10.10f,"Presidencial",20.00f,111);


       Hotel hotel = new Hotel("CAMERUM HOTEL", 5,15,"12454758", 5,true, "Los Lagos","11-05-2018");
     //System.out.println(hotel);
    
        Reservacion reservacion = new Reservacion( 1, 54f, 12f, 4, 10f, "Presidencial");
        //System.out.println(reservacion);
        Recepcion recepcion = new  Recepcion(15, 14.5f, "Habitaciones Especiales",hotel);
        Recepcionista recepcionista = new Recepcionista( 5, "Gerente", "Wilson", "Gonzalez","1154875");
        recepcion.getRecepcionList().add(recepcionista);
        //System.out.println(recepcion);
        
        reservacion.getTiempoEstancia();
        //System.out.println(        reservacion.getNumeroHuespedes());
        
        
        
      
        Bar br1 = new Bar(40,40);
        //System.out.println(br1);
        
        
        
        ReservacionComida re1= new ReservacionComida("Especial","pollo al jugo ",2.00f);
        ReservacionComida re2= new ReservacionComida("Continental","Costilla decerdo",3.00f);
        ReservacionComida re3= new ReservacionComida("Ligero","Cafe con humas",1.00f);
        //System.out.println(re1);
        re1.precioComidaPorHuesped(reservacion);
        re2.precioComidaPorHuesped(reservacion);
        re3.precioComidaPorHuesped(reservacion);
        //System.out.println(re1.precioComidaPorHuesped(reservacion));
        
        RealizarEvento env1 = new RealizarEvento("Boda","14/09/2022","6 horas");
        //System.out.println(com1);
        
        //System.out.println(car2.precioComidaPorHuesped(reservacion)+car3.precioComidaPorHuesped(reservacion)+
        //car4.precioComidaPorHuesped(reservacion));
        re1.setReservacion(reservacion);
        re2.setReservacion(reservacion);
        re3.setReservacion(reservacion);
        System.out.println(reservacion.costoReservacionComida(reservacion));
      
       
       
        
        
                                                    //tvCable,servicioHabitacion,servicioLimpieza,bare,spa,Gim
        ServicioAdicional sr1= new ServicioAdicional(true,false,false,false,true,false);
        env1.precioEvento(sr1);
        sr1.precioAddServicio(reservacion);
        //System.out.println(reservacion.getTiempoEstancia());
        //System.out.println(sr1.precioAddServicio(reservacion));
        
        
        //System.out.println(env1.precioEvento(sr1));
        Servicio servicio = new Servicio();
        
        reservacion.reservarHabitacion(h1);
        reservacion.costosServicios(sr1, servicio, reservacion);
        reservacion.costoReservacionComida(reservacion);
        reservacion.valorSubtotal();
        
        //Factura
        
        System.out.println("*******************************************************************");
        System.out.println("\t\t\t"+hotel.getNombre());
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
        System.out.println("********************************************************************"); 
        System.out.println("  Servicios Adicionales");
        System.out.println("  |TvCable|Servicio Habitacion|Servicio Limpieza|Bar|Spa|Gimnacio|");
        System.out.println(sr1.getTvCable());
     }
    
    
    
    
    
    
}
