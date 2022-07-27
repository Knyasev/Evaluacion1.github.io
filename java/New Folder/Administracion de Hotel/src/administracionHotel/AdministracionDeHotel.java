/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package administracionHotel;

import administracion.dao.DAOBanio;
import administracion.dao.DAOBar;
import administracion.dao.DAOChef;
import administracion.dao.DAOCliente;
import administracion.dao.DAOFactura;
import administracion.dao.DAOGerente;
import administracion.dao.DAOHabitacion;
import administracion.dao.DAOHotel;
import administracion.dao.DAOMesero;
import administracion.dao.DAOParqueadero;
import administracion.dao.DAOPersona;
import administracion.dao.DAORealizarEvento;
import administracion.dao.DAORecepcion;
import administracion.dao.DAORecepcionista;
import administracion.dao.DAOReservacion;
import administracion.dao.DAOReservacionComida;
import administracion.dao.DAOServicio;
import administracion.dao.DAOServicioAdicional;
import administracion.dao.DAOUsuario;
import administracion.dao.HibernateUtil;
import administracion.model.Banio;
import administracion.model.Bar;
import administracion.model.Chef;
import administracion.model.Cliente;
import administracion.model.Cocina;
import administracion.model.Comedor;
import administracion.model.Factura;
import administracion.model.Gerente;
import administracion.model.Habitacion;
import administracion.model.Hotel;
import administracion.model.Mesero;
import administracion.model.Parqueadero;
import administracion.model.Persona;
import administracion.model.RealizarEvento;
import administracion.model.Recepcion;
import administracion.model.Recepcionista;
import administracion.model.Reservacion;
import administracion.model.ReservacionComida;
import administracion.model.Servicio;
import administracion.model.ServicioAdicional;
import administracion.model.Usuario;

import java.util.List;

/**
 *
 * @author Gonzalez G
 */
public class AdministracionDeHotel {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DAOPersona dAOPersona = new DAOPersona();
        Persona p1 = new Persona("Wilson", "Gonzales", "147852365");
        dAOPersona.guardarPersona(p1);
        
        DAOBanio dAOBanio = new DAOBanio();
        Banio b1 = new Banio(2, "Jabon, Cepillo de dientes, Shampoo");
        dAOBanio.guardarBanio(b1);
        
        DAOBar dAOBar = new DAOBar();
        Bar ba1 = new Bar(25, 52);
        dAOBar.guardarBar(ba1); 
        
        DAOChef dAOChef = new DAOChef();
        Chef ch1 = new Chef(14, "chef", "Gonzalo", "Plata", "22222222");
        dAOChef.guardarChef(ch1);  
        
        DAOCliente dAOCliente = new DAOCliente();
        Cliente c1= new Cliente("Fausto","Roldan","11225563");
        dAOCliente.guardarCliente(c1);
        
        DAOUsuario aOUsuario = new DAOUsuario();
        Usuario usuario = new Usuario(1548877, "empleado","Wilson", "Gonzalez","121578451");
        aOUsuario.guardar(usuario);
        
        DAOServicioAdicional aOServicioAdicional = new DAOServicioAdicional();
        ServicioAdicional sa = new ServicioAdicional(true,false, false,false, true, false);
        aOServicioAdicional.guardar(sa);
        
        DAOServicio daoservicio = new DAOServicio();
        Servicio s = new Servicio();
        daoservicio.guardar(s);
        
        DAOReservacionComida daorc = new DAOReservacionComida();
        ReservacionComida reservacionComida = new ReservacionComida(5f, 2f, 1.50f,"Arroz con pollo","Sopa","postre", true, true, true);
        daorc.guardar(reservacionComida);
        
        DAOReservacion daoreservacion = new DAOReservacion();
        Reservacion reservacion = new Reservacion(2, 5, 10f, "Presidencial");
        daoreservacion.guardar(reservacion);
        
        DAORecepcionista daorecepcionista = new DAORecepcionista();
        Recepcionista recepcionista  = new Recepcionista(12, "recepecionoista", "Wiliam", "Queen", "4545874412");
        daorecepcionista.guardar(recepcionista);
        
        DAORecepcion daorecepcion = new DAORecepcion();
        Recepcion r= new Recepcion("Grande con ventana",15);
        daorecepcion.guardar(r);
        
        DAORealizarEvento aORealizarEvento = new DAORealizarEvento();
        RealizarEvento realizarEvento = new RealizarEvento("cumpleaños","12-05-2020","12horas");
        aORealizarEvento.guardar(realizarEvento);
        
        DAOParqueadero daoparqueadero = new DAOParqueadero();
        Parqueadero par = new Parqueadero("AB215-54");
        daoparqueadero.guardar(par);
        
        DAOMesero daomesero =new  DAOMesero();
        Mesero mesero = new Mesero( 13, "mesero","Wilson","camachop", "215454541");
        daomesero.guardar(mesero);
        
        DAOHotel daohotel = new DAOHotel();
        Hotel h = new Hotel("CAMERUM HOTEL", 5,15,"12454758", 5,true, "Los Lagos","11-05-2018");
        
        DAOHabitacion daohabitacion = new DAOHabitacion();
        Habitacion habitacion = new Habitacion(true,2,2,10.10f,"Presidencial",20.00f,111);
     
        
        DAOGerente daogerente = new DAOGerente();
        Gerente gerente = new Gerente(12,"gerente","Alex","Carrion","123564584");
        daogerente.guardar(gerente);
        
        DAOFactura aOFactura = new DAOFactura();
        Factura f = new Factura(154, "1258","1254874");
        aOFactura.guardar(f);
        
//        Hotel hotel = new Hotel("CAMERUM HOTEL", 5,15,"12454758", 5,true, "Los Lagos","11-05-2018");
//        Habitacion h1 = new Habitacion(true,2,2,10.10f,"Presidencial",20.00f,111);     
//        Banio b1 = new Banio(2, "Shampo,Jabon,cepillo de dientes,Pasta dental");
//        Banio b3 = new Banio(1, "Shampo,Jabon,cepillo de dientes,Pasta dental");
//        Cocina co1 =new Cocina("7 x 7",true);
//        Bar br1 = new Bar(40,40);
//
//        //cliente
//        Cliente c1= new Cliente("Mario Alejandro", "Martines Pineda","14784578");
//        Cliente c2= new Cliente("Jose Rodrigo", "Velez Carrion","478541254");
//        Chef ch1 = new Chef(001, "Chef", "Alejandro", "Martines","147852" );
//        Chef ch2 = new Chef(002, "Chef", "Victor", "Ojeda","78451236" );
//        Comedor comedor = new Comedor(5, 5, "12");
//        Mesero mesero = new Mesero(comedor, 00012, "Mesero","David","Mendoza", "110548721");
//    
//        Reservacion reservacion = new Reservacion( 1, 4, 5f, "Normal");
//        Recepcion recepcion = new  Recepcion(15, 14.5f, "Habitaciones Especiales",hotel);
//        Recepcionista recepcionista = new Recepcionista( 0015, "Gerente", "Wilson", "Gonzalez","1154875");
//        ReservacionComida re1= new ReservacionComida(2.00f,1.00f,1.50f,"Pollo frito","Cafe con humas","Costilla de cerdo",true,true, true);
//        RealizarEvento env1 = new RealizarEvento("Cumpleanios","14/09/2022","6 horas");
//        Servicio servicio = new Servicio();
//        re1.precioComidaPorHuesped(reservacion);
//        hotel.getHabitacionList().add(h1);
//        h1.setHotel(hotel);
//        hotel.getRecepcionList().add(recepcion);
//        recepcion.getRecepcionList().add(recepcionista);
//        recepcionista.getReservacionList();
//        c1.setReservacion(reservacion);
//        reservacion.setHotel(hotel);
//        comedor.getMeseroList().add(mesero);
//        mesero.setComedor(comedor);
//        re1.setComedor(comedor);
//        c1.setChef(ch2);
//                                                    //tvCable,servicioHabitacion,servicioLimpieza,bare,spa,Gim
//        ServicioAdicional sr1= new ServicioAdicional(true,false,false,false,true,false);
//        env1.precioEvento(sr1);
//        sr1.precioAddServicio(reservacion);
//
//
//        reservacion.valorSubtotal(reservacion, re1, h1, sr1, servicio);
//        Factura factura = new Factura(125487978, "26/06/2022","1245645-654");
//        factura.calcularTotal(reservacion, re1, servicio, sr1, h1);
//        
//        
//        //Factura
//        
//       System.out.println("*******************************************************************");
//        System.out.println("\t\t\t"+hotel.getNombre());
//        System.out.println("*******************************************************************");
//        System.out.println("   Ruc Factura:"+factura.getRuc()+"   Fecha:"+ factura.getFecha()+"    Numero:"+factura.getNumero());
//        System.out.println("*******************************************************************");
//        System.out.println("  Datos de hotel");
//        System.out.println("\tRUC:        "+hotel.getRuc()+"  \tNumero de Estrellas:"+hotel.getNumeroEstrella()+"\n\tUbicacion:  "+hotel.getUbicacion());
//        System.out.println("*******************************************************************");
//        System.out.println("  Datos de Cliente");
//        System.out.println("\tNombres:   "+c1.getNombre()+"\tApellidos: "+c1.getApellido()+"\n\tCl.Identificacion: "+c1.getIdentificacion());
//        System.out.println("*******************************************************************");
//        System.out.println("  Datos de Reservacion");
//        System.out.println("\tN.Huepedes: "+reservacion.getNumeroHuespedes()+"\t\tTiempo Estancia(Dias): "+reservacion.getTiempoEstancia());
//        System.out.println("\tNumero Habitacion: "+h1.getNumeroHabitacion()
//        +"\tNumero Banios: "+h1.getNumeroBaños()+"\n\tNumero de Camas: "+h1.getNumeroCamas()
//        +"\tTipo de Habitacion: "+h1.getTipoHabitacion()+"\n\tPrecio Habitacion: "+h1.getPrecioHabitacion());
//        System.out.println("  Elementos aceo: "+b1.getElementosAceoPersonal());////
//        System.out.println("********************************************************************"); 
//        System.out.println("  Servicios Adicionales");
//        System.out.println("  |TvCable|Servicio Habitacion|Servicio Limpieza|Bar|Spa|Gimnacio|");
//        System.out.println("   "+sr1.getTvCable()+"\t   "+sr1.getServicioHabitacion()+"\t       "+sr1.getServicioLimpieza()+"\t\t"+sr1.getBare()
//                       +" "+sr1.getSpa()+" "+sr1.getGim());
//        System.out.println("********************************************************************"); 
//        System.out.println("  Descripcion");
//        System.out.println("    Habitacion: \t    "+reservacion.getPrecioReservacion());
//        System.out.println("    Servicios Adicionales:  "+ reservacion.getPrecioServicio());
//        System.out.println("    Comida: \t\t    "+ re1.precioComidaPorHuesped(reservacion));
//        System.out.println("********************************************************************");
//        System.out.println("  Costos Totales");
//        System.out.println(factura);
//        System.out.println("********************************************************************");


     }
    
    
    
    
    
    
}
