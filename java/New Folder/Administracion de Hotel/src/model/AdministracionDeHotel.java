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
//        System.out.println(c1);
        Cliente c2= new Cliente("Jose", "Martines","478541254");
//        System.out.println(c2);
        Cliente c3= new Cliente("Maria", "Velazquez","1958658");
//        System.out.println(c3);
        
        //banio
        Banio b1 = new Banio(2, "Shampo,Jabon,cepillo de dientes,Pasta dental");
//        System.out.println(b1);
        Banio b2 = new Banio(3, "Shampo,Jabon,cepillo de dientes,Pasta dental");
//        System.out.println(b2);
        Banio b3 = new Banio(1, "Shampo,Jabon,cepillo de dientes,Pasta dental");
//        System.out.println(b3);
       
        Carta car2 = new Carta("Pollo frito", "Pollo, PorcionArroz,Ensalada,Salsas(Mayonesa Salsa de Tomate),Agua de horchata", 3.50f);
        Carta car3 = new Carta("Tilapia Sudada", "Tilapia,Porcion de arroz, platanos,limon,Fresco de Maracuyá", 5.30f);
        Carta car4 = new Carta("Café", "Pan,cafe,Tamal", 1.25f);
        System.out.println(car4);
        
        Hotel hotel = new Hotel("Cameru,", 5,15,"12454758", 5,true, "Los Lagos","11-05-2018");
//        System.out.println(hotel);

        

    }
    
}
