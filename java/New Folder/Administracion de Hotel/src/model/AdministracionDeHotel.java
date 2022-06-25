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
        
        Reservacion reservacion = new Reservacion(5, 7, 2, 54f, 45f, 12f, 4, 10f, "Presidencial");
        //System.out.println(reservacion);
        Recepcion recepcion = new  Recepcion(15, 14.5f, "Habitaciones Especiales",hotel);
        Recepcionista recepcionista = new Recepcionista( 5, "Gerente", "Wilson", "Gonzalez","1154875");
        recepcion.getRecepcionList().add(recepcionista);
        //System.out.println(recepcion);
        
        
        
        
      
        Bar br1 = new Bar(40,40);
        //System.out.println(br1);
        
        Spa sp1 = new Spa(true, false);
        
        ReservacionComida com1 = new ReservacionComida("Continental","Ligero","Especial",car2.precioComidaPorHuesped(reservacion),car3.precioComidaPorHuesped(reservacion) ,car4.precioComidaPorHuesped(reservacion));
        
        RealizarEvento env1 = new RealizarEvento("Cumpleanios","14/09/2022","6 horas");
        System.out.println(com1);
        
        System.out.println(car2.precioComidaPorHuesped(reservacion)+car3.precioComidaPorHuesped(reservacion)+
        car4.precioComidaPorHuesped(reservacion));

    }
    
}
