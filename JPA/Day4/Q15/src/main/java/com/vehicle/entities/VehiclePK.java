package com.vehicle.entities;

import java.io.Serializable;


public class VehiclePK implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ownerId;
		result = prime * result + vehicleId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehiclePK other = (VehiclePK) obj;
		if (ownerId != other.ownerId)
			return false;
		if (vehicleId != other.vehicleId)
			return false;
		return true;
	}
	private int vehicleId;
	private int ownerId;
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	
}
