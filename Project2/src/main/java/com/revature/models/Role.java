package com.revature.models;

import java.io.Serializable;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Role implements Serializable{

	private static final long serialVersionUID = 1L;
	
    @Id
	private long roleid;
	private String role;
	
	public Role() {
		super();
	}
	
	public Role(long roleid, String role) {
		super();
		this.roleid = roleid;
		this.role = role;
	}
	public long getRoleid() {
		return roleid;
	}
	public void setRoleid(long roleid) {
		this.roleid = roleid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + (int) (roleid ^ (roleid >>> 32));
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
		Role other = (Role) obj;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (roleid != other.roleid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserRole [roleid=" + roleid + ", role=" + role + "]";
	}
	
}
