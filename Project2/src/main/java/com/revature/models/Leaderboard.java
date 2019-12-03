package com.revature.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Leaderboard implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(sequenceName = "leaderboard_seq", name = "l_seq")
	@GeneratedValue(generator = "l_seq", strategy = GenerationType.SEQUENCE)
	private long leaderid;
	@ManyToOne
	@JoinColumn
	private Deck deckid;
	@ManyToOne
	@JoinColumn
	private Users userid;
	private int points;
	public Leaderboard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Leaderboard(long leaderid, Deck deckid, Users userid, int points) {
		super();
		this.leaderid = leaderid;
		this.deckid = deckid;
		this.userid = userid;
		this.points = points;
	}
	@Override
	public String toString() {
		return "Leaderboard [leaderid=" + leaderid + ", deckid=" + deckid + ", userid=" + userid + ", points=" + points
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deckid == null) ? 0 : deckid.hashCode());
		result = prime * result + (int) (leaderid ^ (leaderid >>> 32));
		result = prime * result + points;
		result = prime * result + ((userid == null) ? 0 : userid.hashCode());
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
		Leaderboard other = (Leaderboard) obj;
		if (deckid == null) {
			if (other.deckid != null)
				return false;
		} else if (!deckid.equals(other.deckid))
			return false;
		if (leaderid != other.leaderid)
			return false;
		if (points != other.points)
			return false;
		if (userid == null) {
			if (other.userid != null)
				return false;
		} else if (!userid.equals(other.userid))
			return false;
		return true;
	}
	public long getLeaderid() {
		return leaderid;
	}
	public void setLeaderid(long leaderid) {
		this.leaderid = leaderid;
	}
	public Deck getDeckid() {
		return deckid;
	}
	public void setDeckid(Deck deckid) {
		this.deckid = deckid;
	}
	public Users getUserid() {
		return userid;
	}
	public void setUserid(Users userid) {
		this.userid = userid;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}