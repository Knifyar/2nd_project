package com.revature.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Classtype implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
    @Id
	private long classid;
	private String classtype;
	
	public Classtype() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Classtype(long classid, String classtype) {
		super();
		this.classid = classid;
		this.classtype = classtype;
	}
	@Override
	public String toString() {
		return "Classtype [classid=" + classid + ", classtype=" + classtype + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (classid ^ (classid >>> 32));
		result = prime * result + ((classtype == null) ? 0 : classtype.hashCode());
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
		Classtype other = (Classtype) obj;
		if (classid != other.classid)
			return false;
		if (classtype == null) {
			if (other.classtype != null)
				return false;
		} else if (!classtype.equals(other.classtype))
			return false;
		return true;
	}
	public long getClassid() {
		return classid;
	}
	public void setClassid(long classid) {
		this.classid = classid;
	}
	public String getClasstype() {
		return classtype;
	}
	public void setClasstype(String classtype) {
		this.classtype = classtype;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
