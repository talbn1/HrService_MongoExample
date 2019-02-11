package com.talbn.HRService.model;

public class Subordinates {
	
	String subordinatesId;

	public String getSubordinatesId() {
		return subordinatesId;
	}

	public void setSubordinatesId(String subordinatesId) {
		this.subordinatesId = subordinatesId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subordinatesId == null) ? 0 : subordinatesId.hashCode());
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
		Subordinates other = (Subordinates) obj;
		if (subordinatesId == null) {
			if (other.subordinatesId != null)
				return false;
		} else if (!subordinatesId.equals(other.subordinatesId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Subordinates [subordinatesId=" + subordinatesId + "]";
	}
	
	

}
