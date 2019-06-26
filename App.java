package com.gits.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
public class App 
{
    public static void main( String[] args )
    {
  EmployeeDetails obj = new EmployeeDetails();
  
  EmployeeNameClass an = new EmployeeNameClass();
  an.setFname("Mrunal");
  an.setLname("thakur");
  
  obj.setEmployeeId(115);
  obj.setEmployeeName(an);
  
  
  //obj.setEmployeeId(203);
  
  //obj.setEmployeeName("Thakur","Mrunal");
  
  obj.setEmployeeAddress("7/456,bhaya steert,malar colony,coimbatore");
  
  obj.setEmployeeMail("Mrunalthakur@mail.com");
  
  Configuration con = new Configuration().configure().addAnnotatedClass(EmployeeDetails.class);
  
  ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
  
  SessionFactory sf = con. buildSessionFactory(reg);
  
  Session session = sf.openSession();
  
  Transaction tx = session.beginTransaction();
  // obj = (EmployeeDetails)session.get(EmployeeDetails.class,200);
  
  session.save(obj);
  
  //session.delete(110);
  //session.update(user);
  tx.commit();
   System.out.println(obj);
    }
    
} 
