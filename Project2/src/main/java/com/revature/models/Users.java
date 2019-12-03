 package com.revature.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;



@Entity
public class Users implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
    @SequenceGenerator(sequenceName="users_seq", name="u_seq")
    @GeneratedValue(generator="u_seq", strategy=GenerationType.SEQUENCE)
	private long userid;
	@Column(unique = true)
	private String username;
	private String password;
	@ManyToOne
	@JoinColumn
	private Role roleid;
	@OneToOne
	private Classtype classid;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(long userid, String username, String password) {
		super();
		this.userid = userid; //this will be overridden and managed by Postgres
		this.username = username;
		this.password = password;
		this.roleid = new Role(1L, "User");
		this.classid = null;
	}
	public Users(long userid, String username, String password, Role roleid, Classtype classid) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.roleid = roleid;
		this.classid = classid;
	}
	@Override
	public String toString() {
		return "Users [userid=" + userid + ", username=" + username + ", password=" + password + ", roleid=" + roleid
				+ ", classid=" + classid + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classid == null) ? 0 : classid.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((roleid == null) ? 0 : roleid.hashCode());
		result = prime * result + (int) (userid ^ (userid >>> 32));
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Users other = (Users) obj;
		if (classid == null) {
			if (other.classid != null)
				return false;
		} else if (!classid.equals(other.classid))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (roleid == null) {
			if (other.roleid != null)
				return false;
		} else if (!roleid.equals(other.roleid))
			return false;
		if (userid != other.userid)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRoleid() {
		return roleid;
	}
	public void setRoleid(Role roleid) {
		this.roleid = roleid;
	}
	public Classtype getClassid() {
		return classid;
	}
	public void setClassid(Classtype classid) {
		this.classid = classid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}