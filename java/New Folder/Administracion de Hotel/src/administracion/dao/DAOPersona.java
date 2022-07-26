package administracion.dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
   to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit
   this template
 */

import administracion.dao.HibernateUtil;
import administracion.model.Persona;
import org.hibernate.Session;

/**
 *
 * @author Usuario iTC
 */

 
public class DAOPersona {
        public void guardarPersona(Persona persona){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(persona);
        session.getTransaction().commit();
       
    }   
}
