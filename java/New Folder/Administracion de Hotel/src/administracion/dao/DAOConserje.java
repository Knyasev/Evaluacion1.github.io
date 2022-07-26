package administracion.dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
   to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit
   this template
 */

import administracion.dao.HibernateUtil;
import administracion.model.Comedor;
import administracion.model.Conserje;
import administracion.model.Persona;
import org.hibernate.Session;

/**
 *
 * @author Usuario iTC
 */

 
public class DAOConserje {
        public void guardarConserje(Conserje conserje){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(conserje);
        session.getTransaction().commit();
        
    }   
}

