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
import com.vehicle.entities.VehiclePK;

public class VehicleDs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		EntityManager em=null;
	    EntityManagerFactory emf=Persistence.createEntityManagerFactory("VehicleProject");
	   em=emf.createEntityManager();
		
        try
        {
       
       VehiclePK pk= new VehiclePK();
       pk.setOwnerId(101);
       pk.setVehicleId(1001);
       
       Vehicle vh=em.find(Vehicle.class,pk);
       if(vh==null)
       {
    	   System.out.println("could not find the entity");
       }
       else
       {
    	   System.out.println(vh.getName());
    	   System.out.println(vh.getPrice());
       }
        
        
       }catch(Exception e)
        {
        e.printStackTrace();
        }
       finally {em.close();}
	}

}
