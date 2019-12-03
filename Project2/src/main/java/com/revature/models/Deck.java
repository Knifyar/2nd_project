package com.revature.models;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Deck implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
    @Id
    @SequenceGenerator(sequenceName="deck_seq", name="d_seq")
    @GeneratedValue(generator="d_seq", strategy=GenerationType.SEQUENCE)
	private long deckid;
	private String deckvalue;
	private String[] cards;
	@ManyToOne
	@JoinColumn
	private Users userid;
	
	
	public Deck() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Deck(long deckid, String deckvalue, String[] cards, Users userid) {
		super();
		this.deckid = deckid;
		this.deckvalue = deckvalue;
		this.cards = cards;
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Deck [deckid=" + deckid + ", deckvalue=" + deckvalue + ", cards=" + Arrays.toString(cards) + ", userid="
				+ userid + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cards);
		result = prime * result + (int) (deckid ^ (deckid >>> 32));
		result = prime * result + ((deckvalue == null) ? 0 : deckvalue.hashCode());
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
		Deck other = (Deck) obj;
		if (!Arrays.equals(cards, other.cards))
			return false;
		if (deckid != other.deckid)
			return false;
		if (deckvalue == null) {
			if (other.deckvalue != null)
				return false;
		} else if (!deckvalue.equals(other.deckvalue))
			return false;
		if (userid == null) {
			if (other.userid != null)
				return false;
		} else if (!userid.equals(other.userid))
			return false;
		return true;
	}
	public long getDeckid() {
		return deckid;
	}
	public void setDeckid(long deckid) {
		this.deckid = deckid;
	}
	public String getDeckvalue() {
		return deckvalue;
	}
	public void setDeckvalue(String deckvalue) {
		this.deckvalue = deckvalue;
	}
	public String[] getCards() {
		return cards;
	}
	public void setCards(String[] cards) {
		this.cards = cards;
	}
	public Users getUserid() {
		return userid;
	}
	public void setUserid(Users userid) {
		this.userid = userid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	
}