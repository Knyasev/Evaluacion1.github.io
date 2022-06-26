/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import java.text.ParseException;

/**
 *
 * @author Gonzalez G
 */
public class AdministracionDeHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {

       
        //cliente
        Cliente c1= new Cliente("Mario", "Martines","14784578");
        //System.out.println(c1);
        Cliente c2= new Cliente("Jose", "Martines","478541254");
        //System.out.println(c2);
        Cliente c3= new Cliente("Maria", "Velazquez","1958658");
        //System.out.println(c3);
        
        //banio
        Banio b1 = new Banio(2, "Shampo,Jabon,cepillo de dientes,Pasta dental");
        //System.out.println(b1);
        Banio b2 = new Banio(3, "Shampo,Jabon,cepillo de dientes,Pasta dental");
        //System.out.println(b2);
        Banio b3 = new Banio(1, "Shampo,Jabon,cepillo de dientes,Pasta dental");
        //System.out.println(b3);
       
        Carta car2 = new Carta("Continental", "Pollo, PorcionArroz,Ensalada,Salsas(Mayonesa Salsa de Tomate),Agua de horchata", 2.00f);
        Carta car3 = new Carta("Especial", "Tilapia,Porcion de arroz, platanos,limon,Fresco de Maracuyá", 2.30f);
        Carta car4 = new Carta("Ligero", "Pan,cafe,Tamal", 1.00f);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

//        System.out.println(hotel);

        Chef ch1 = new Chef(001, "Chef", "Alejandro", "Martines","147852" );
        Chef ch2 = new Chef(002, "Chef", "Victor", "Ojeda","78451236" );
        
        Cocina co1 =new Cocina("7 x 7",true);
        //System.out.println(co1);



       Hotel hotel = new Hotel("Cameru,", 5,15,"12454758", 5,true, "Los Lagos","11-05-2018");
     //System.out.println(hotel);
      
        Reservacion reservacion = new Reservacion( 2, 54f, 45f, 12f, 4, 10f, "Presidencial"); 
       
        //System.out.println(reservacion);
        Recepcion recepcion = new  Recepcion(15, 14.5f, "Habitaciones Especiales",hotel);
        Recepcionista recepcionista = new Recepcionista( 5, "Gerente", "Wilson", "Gonzalez","1154875");
        recepcion.getRecepcionList().add(recepcionista);
        //System.out.println(recepcion);
        
        Habitacion habitacion = new Habitacion(false, 2,2, 6f, 3, " ",2.5f);
       // habitacion.calcularPrecioHabitacion();
          reservacion.reservarHabitacion(habitacion);
        
        Bar br1 = new Bar(40,40);
        //System.out.println(br1);
        
        Spa sp1 = new Spa(true, false);
        
        ReservacionComida com1 = new ReservacionComida("Continental","Ligero","Especial",car2.precioComidaPorHuesped(reservacion),car3.precioComidaPorHuesped(reservacion) ,car4.precioComidaPorHuesped(reservacion));
        
<<<<<<< HEAD
        ReservacionComida re1= new ReservacionComida("Especial","pollo al jugo ",2.00f);
        ReservacionComida re2= new ReservacionComida("Continental","Costilla decerdo",3.00f);
        ReservacionComida re3= new ReservacionComida("Ligero","Cafe con humas",1.00f);
        //System.out.println(re1);
        re1.precioComidaPorHuesped(reservacion);
        //System.out.println(re1.precioComidaPorHuesped(reservacion));
        
        RealizarEvento env1 = new RealizarEvento("Boda","14/09/2022","6 horas");
        //System.out.println(com1);
        
        //System.out.println(car2.precioComidaPorHuesped(reservacion)+car3.precioComidaPorHuesped(reservacion)+
        //car4.precioComidaPorHuesped(reservacion));
        
        
        
        
                                                    //tvCable,servicioHabitacion,servicioLimpieza,bare,spa,Gim
        ServicioAdicional sr1= new ServicioAdicional(true,false,false,false,true,false);
        env1.precioEvento(sr1);
        sr1.precioAddServicio(reservacion);
        //System.out.println(reservacion.getTiempoEstancia());
        //System.out.println(sr1.precioAddServicio(reservacion));
        
        
        //System.out.println(env1.precioEvento(sr1));
        Servicio servicio = new Servicio();
        
        reservacion.costosServicios(sr1, servicio, reservacion);
      
        
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
    
    
    
    
    
=======
        RealizarEvento env1 = new RealizarEvento("Cumpleanios","14/09/2022","6 horas");
//        System.out.println(com1);
//      
//        System.out.println(car2.precioComidaPorHuesped(reservacion)+car3.precioComidaPorHuesped(reservacion)+
//       car4.precioComidaPorHuesped(reservacion));

    }
>>>>>>> b5907ae4ca45a64ae5581cc3b64ef0e443c4a2cb
    
}
