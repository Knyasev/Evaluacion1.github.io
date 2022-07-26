package administracion.dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
   to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit
   this template
 */

import administracion.dao.HibernateUtil;
import administracion.model.Chef;
import administracion.model.Cliente;
import administracion.model.Cocina;
import administracion.model.Persona;
import org.hibernate.Session;

/**
 *
 * @author Usuario iTC
 */

 
public class DAOCocina {
        public void guardarCocina(Cocina cocina){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(cocina);
        session.getTransaction().commit();
        
    }   
}

