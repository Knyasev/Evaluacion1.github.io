/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario iTC
 */
public class Banio {
    private Integer numeroDuchas;
    private String elementosAceoPersonal;
    private Habitacion habitacion;

    public Banio(Integer numeroDuchas, String elementosAceoPersonal) {
        this.numeroDuchas = numeroDuchas;
        this.elementosAceoPersonal = elementosAceoPersonal;
      
    }
    
    

    public Integer getNumeroDuchas() {
        return numeroDuchas;
    }

    public void setNumeroDuchas(Integer numeroDuchas) {
        this.numeroDuchas = numeroDuchas;
    }

    public String getElementosAceoPersonal() {
        return elementosAceoPersonal;
    }

    public void setElementosAceoPersonal(String elementosAceoPersonal) {
        this.elementosAceoPersonal = elementosAceoPersonal;
    }

    @Override
    public String toString() {
        return "numeroDuchas " + numeroDuchas + "  elementosAceoPersonal " + elementosAceoPersonal ;
    }
    
          
}
