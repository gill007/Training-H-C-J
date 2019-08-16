package com.vehicle.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.vehicle.entities.Vehicle;

public class VehicleDs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		EntityManager em=null;
	    EntityManagerFactory emf=Persistence.createEntityManagerFactory("VehicleProject");
	   em=emf.createEntityManager();
		
        try
        {
       
        em.getTransaction().begin();
        Vehicle vehicle=new Vehicle();
        vehicle.setOwnerId(500);
        vehicle.setName("WagonR");
        vehicle.setPrice(30000);
       
     
        em.persist(vehicle);
        em.getTransaction().commit();
        System.out.println("Vehicle Persisted:"+vehicle.getVehicleId());
        
       }catch(Exception e)
        {
        e.printStackTrace();
        }
       finally {em.close();}
	}

}
