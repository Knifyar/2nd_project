package com.revature.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cards implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn
	private Deck deckid;
	@Id
	private int cards__id; //this follows the API naming convention not the Dev's
	private int cards__collectible;	
	private String cards__slug;
	private int cards__classId;
	private int cards__minionTypeId;
	private int cards__cardTypeId;
	private int cards__cardSetId;
	private int cards__rarityId;
	private String cards__artistName;
	private int cards__health;	
	private int cards__attack;
	private int cards__manaCost;
	private int cards__armor;
	private String cards__name;
	private String cards__text;
	private String cards__image;	
	private String cards__imageGold;	
	private String cards__flavorText;	
	private String cards__cropImage;
	private int cards__childIds__001;	
	private int cards__keywordIds__001;
	private int cards__keywordIds__002;
	private int cards__keywordIds__003;
	private int cards__childIds__002;	
	private int cards__childIds__003;	
	private int cards__childIds__004;	
	private int cards__childIds__005;	
	private int cards__childIds__006;	
	private int cards__childIds__007;	
	private int cards__childIds__008;	
	private int cards__childIds__009;	
	private int cards__childIds__010;	
	private int cards__childIds__011;	
	private int cardCount;	
	private int pageCount;	
	private int page;
	
	public Cards() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cards(Deck deckid, int cards__id, int cards__collectible, String cards__slug, int cards__classId,
			int cards__minionTypeId, int cards__cardTypeId, int cards__cardSetId, int cards__rarityId,
			String cards__artistName, int cards__health, int cards__attack, int cards__manaCost, int cards__armor,
			String cards__name, String cards__text, String cards__image, String cards__imageGold,
			String cards__flavorText, String cards__cropImage, int cards__childIds__001, int cards__keywordIds__001,
			int cards__keywordIds__002, int cards__keywordIds__003, int cards__childIds__002, int cards__childIds__003,
			int cards__childIds__004, int cards__childIds__005, int cards__childIds__006, int cards__childIds__007,
			int cards__childIds__008, int cards__childIds__009, int cards__childIds__010, int cards__childIds__011,
			int cardCount, int pageCount, int page) {
		super();
		this.deckid = deckid;
		this.cards__id = cards__id;
		this.cards__collectible = cards__collectible;
		this.cards__slug = cards__slug;
		this.cards__classId = cards__classId;
		this.cards__minionTypeId = cards__minionTypeId;
		this.cards__cardTypeId = cards__cardTypeId;
		this.cards__cardSetId = cards__cardSetId;
		this.cards__rarityId = cards__rarityId;
		this.cards__artistName = cards__artistName;
		this.cards__health = cards__health;
		this.cards__attack = cards__attack;
		this.cards__manaCost = cards__manaCost;
		this.cards__armor = cards__armor;
		this.cards__name = cards__name;
		this.cards__text = cards__text;
		this.cards__image = cards__image;
		this.cards__imageGold = cards__imageGold;
		this.cards__flavorText = cards__flavorText;
		this.cards__cropImage = cards__cropImage;
		this.cards__childIds__001 = cards__childIds__001;
		this.cards__keywordIds__001 = cards__keywordIds__001;
		this.cards__keywordIds__002 = cards__keywordIds__002;
		this.cards__keywordIds__003 = cards__keywordIds__003;
		this.cards__childIds__002 = cards__childIds__002;
		this.cards__childIds__003 = cards__childIds__003;
		this.cards__childIds__004 = cards__childIds__004;
		this.cards__childIds__005 = cards__childIds__005;
		this.cards__childIds__006 = cards__childIds__006;
		this.cards__childIds__007 = cards__childIds__007;
		this.cards__childIds__008 = cards__childIds__008;
		this.cards__childIds__009 = cards__childIds__009;
		this.cards__childIds__010 = cards__childIds__010;
		this.cards__childIds__011 = cards__childIds__011;
		this.cardCount = cardCount;
		this.pageCount = pageCount;
		this.page = page;
	}
	@Override
	public String toString() {
		return "Cards [deckid=" + deckid + ", cards__id=" + cards__id + ", cards__collectible=" + cards__collectible
				+ ", cards__slug=" + cards__slug + ", cards__classId=" + cards__classId + ", cards__minionTypeId="
				+ cards__minionTypeId + ", cards__cardTypeId=" + cards__cardTypeId + ", cards__cardSetId="
				+ cards__cardSetId + ", cards__rarityId=" + cards__rarityId + ", cards__artistName=" + cards__artistName
				+ ", cards__health=" + cards__health + ", cards__attack=" + cards__attack + ", cards__manaCost="
				+ cards__manaCost + ", cards__armor=" + cards__armor + ", cards__name=" + cards__name + ", cards__text="
				+ cards__text + ", cards__image=" + cards__image + ", cards__imageGold=" + cards__imageGold
				+ ", cards__flavorText=" + cards__flavorText + ", cards__cropImage=" + cards__cropImage
				+ ", cards__childIds__001=" + cards__childIds__001 + ", cards__keywordIds__001="
				+ cards__keywordIds__001 + ", cards__keywordIds__002=" + cards__keywordIds__002
				+ ", cards__keywordIds__003=" + cards__keywordIds__003 + ", cards__childIds__002="
				+ cards__childIds__002 + ", cards__childIds__003=" + cards__childIds__003 + ", cards__childIds__004="
				+ cards__childIds__004 + ", cards__childIds__005=" + cards__childIds__005 + ", cards__childIds__006="
				+ cards__childIds__006 + ", cards__childIds__007=" + cards__childIds__007 + ", cards__childIds__008="
				+ cards__childIds__008 + ", cards__childIds__009=" + cards__childIds__009 + ", cards__childIds__010="
				+ cards__childIds__010 + ", cards__childIds__011=" + cards__childIds__011 + ", cardCount=" + cardCount
				+ ", pageCount=" + pageCount + ", page=" + page + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cardCount;
		result = prime * result + cards__armor;
		result = prime * result + ((cards__artistName == null) ? 0 : cards__artistName.hashCode());
		result = prime * result + cards__attack;
		result = prime * result + cards__cardSetId;
		result = prime * result + cards__cardTypeId;
		result = prime * result + cards__childIds__001;
		result = prime * result + cards__childIds__002;
		result = prime * result + cards__childIds__003;
		result = prime * result + cards__childIds__004;
		result = prime * result + cards__childIds__005;
		result = prime * result + cards__childIds__006;
		result = prime * result + cards__childIds__007;
		result = prime * result + cards__childIds__008;
		result = prime * result + cards__childIds__009;
		result = prime * result + cards__childIds__010;
		result = prime * result + cards__childIds__011;
		result = prime * result + cards__classId;
		result = prime * result + cards__collectible;
		result = prime * result + ((cards__cropImage == null) ? 0 : cards__cropImage.hashCode());
		result = prime * result + ((cards__flavorText == null) ? 0 : cards__flavorText.hashCode());
		result = prime * result + cards__health;
		result = prime * result + cards__id;
		result = prime * result + ((cards__image == null) ? 0 : cards__image.hashCode());
		result = prime * result + ((cards__imageGold == null) ? 0 : cards__imageGold.hashCode());
		result = prime * result + cards__keywordIds__001;
		result = prime * result + cards__keywordIds__002;
		result = prime * result + cards__keywordIds__003;
		result = prime * result + cards__manaCost;
		result = prime * result + cards__minionTypeId;
		result = prime * result + ((cards__name == null) ? 0 : cards__name.hashCode());
		result = prime * result + cards__rarityId;
		result = prime * result + ((cards__slug == null) ? 0 : cards__slug.hashCode());
		result = prime * result + ((cards__text == null) ? 0 : cards__text.hashCode());
		result = prime * result + ((deckid == null) ? 0 : deckid.hashCode());
		result = prime * result + page;
		result = prime * result + pageCount;
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
		Cards other = (Cards) obj;
		if (cardCount != other.cardCount)
			return false;
		if (cards__armor != other.cards__armor)
			return false;
		if (cards__artistName == null) {
			if (other.cards__artistName != null)
				return false;
		} else if (!cards__artistName.equals(other.cards__artistName))
			return false;
		if (cards__attack != other.cards__attack)
			return false;
		if (cards__cardSetId != other.cards__cardSetId)
			return false;
		if (cards__cardTypeId != other.cards__cardTypeId)
			return false;
		if (cards__childIds__001 != other.cards__childIds__001)
			return false;
		if (cards__childIds__002 != other.cards__childIds__002)
			return false;
		if (cards__childIds__003 != other.cards__childIds__003)
			return false;
		if (cards__childIds__004 != other.cards__childIds__004)
			return false;
		if (cards__childIds__005 != other.cards__childIds__005)
			return false;
		if (cards__childIds__006 != other.cards__childIds__006)
			return false;
		if (cards__childIds__007 != other.cards__childIds__007)
			return false;
		if (cards__childIds__008 != other.cards__childIds__008)
			return false;
		if (cards__childIds__009 != other.cards__childIds__009)
			return false;
		if (cards__childIds__010 != other.cards__childIds__010)
			return false;
		if (cards__childIds__011 != other.cards__childIds__011)
			return false;
		if (cards__classId != other.cards__classId)
			return false;
		if (cards__collectible != other.cards__collectible)
			return false;
		if (cards__cropImage == null) {
			if (other.cards__cropImage != null)
				return false;
		} else if (!cards__cropImage.equals(other.cards__cropImage))
			return false;
		if (cards__flavorText == null) {
			if (other.cards__flavorText != null)
				return false;
		} else if (!cards__flavorText.equals(other.cards__flavorText))
			return false;
		if (cards__health != other.cards__health)
			return false;
		if (cards__id != other.cards__id)
			return false;
		if (cards__image == null) {
			if (other.cards__image != null)
				return false;
		} else if (!cards__image.equals(other.cards__image))
			return false;
		if (cards__imageGold == null) {
			if (other.cards__imageGold != null)
				return false;
		} else if (!cards__imageGold.equals(other.cards__imageGold))
			return false;
		if (cards__keywordIds__001 != other.cards__keywordIds__001)
			return false;
		if (cards__keywordIds__002 != other.cards__keywordIds__002)
			return false;
		if (cards__keywordIds__003 != other.cards__keywordIds__003)
			return false;
		if (cards__manaCost != other.cards__manaCost)
			return false;
		if (cards__minionTypeId != other.cards__minionTypeId)
			return false;
		if (cards__name == null) {
			if (other.cards__name != null)
				return false;
		} else if (!cards__name.equals(other.cards__name))
			return false;
		if (cards__rarityId != other.cards__rarityId)
			return false;
		if (cards__slug == null) {
			if (other.cards__slug != null)
				return false;
		} else if (!cards__slug.equals(other.cards__slug))
			return false;
		if (cards__text == null) {
			if (other.cards__text != null)
				return false;
		} else if (!cards__text.equals(other.cards__text))
			return false;
		if (deckid == null) {
			if (other.deckid != null)
				return false;
		} else if (!deckid.equals(other.deckid))
			return false;
		if (page != other.page)
			return false;
		if (pageCount != other.pageCount)
			return false;
		return true;
	}
	public Deck getDeckid() {
		return deckid;
	}
	public void setDeckid(Deck deckid) {
		this.deckid = deckid;
	}
	public int getCards__id() {
		return cards__id;
	}
	public void setCards__id(int cards__id) {
		this.cards__id = cards__id;
	}
	public int getCards__collectible() {
		return cards__collectible;
	}
	public void setCards__collectible(int cards__collectible) {
		this.cards__collectible = cards__collectible;
	}
	public String getCards__slug() {
		return cards__slug;
	}
	public void setCards__slug(String cards__slug) {
		this.cards__slug = cards__slug;
	}
	public int getCards__classId() {
		return cards__classId;
	}
	public void setCards__classId(int cards__classId) {
		this.cards__classId = cards__classId;
	}
	public int getCards__minionTypeId() {
		return cards__minionTypeId;
	}
	public void setCards__minionTypeId(int cards__minionTypeId) {
		this.cards__minionTypeId = cards__minionTypeId;
	}
	public int getCards__cardTypeId() {
		return cards__cardTypeId;
	}
	public void setCards__cardTypeId(int cards__cardTypeId) {
		this.cards__cardTypeId = cards__cardTypeId;
	}
	public int getCards__cardSetId() {
		return cards__cardSetId;
	}
	public void setCards__cardSetId(int cards__cardSetId) {
		this.cards__cardSetId = cards__cardSetId;
	}
	public int getCards__rarityId() {
		return cards__rarityId;
	}
	public void setCards__rarityId(int cards__rarityId) {
		this.cards__rarityId = cards__rarityId;
	}
	public String getCards__artistName() {
		return cards__artistName;
	}
	public void setCards__artistName(String cards__artistName) {
		this.cards__artistName = cards__artistName;
	}
	public int getCards__health() {
		return cards__health;
	}
	public void setCards__health(int cards__health) {
		this.cards__health = cards__health;
	}
	public int getCards__attack() {
		return cards__attack;
	}
	public void setCards__attack(int cards__attack) {
		this.cards__attack = cards__attack;
	}
	public int getCards__manaCost() {
		return cards__manaCost;
	}
	public void setCards__manaCost(int cards__manaCost) {
		this.cards__manaCost = cards__manaCost;
	}
	public int getCards__armor() {
		return cards__armor;
	}
	public void setCards__armor(int cards__armor) {
		this.cards__armor = cards__armor;
	}
	public String getCards__name() {
		return cards__name;
	}
	public void setCards__name(String cards__name) {
		this.cards__name = cards__name;
	}
	public String getCards__text() {
		return cards__text;
	}
	public void setCards__text(String cards__text) {
		this.cards__text = cards__text;
	}
	public String getCards__image() {
		return cards__image;
	}
	public void setCards__image(String cards__image) {
		this.cards__image = cards__image;
	}
	public String getCards__imageGold() {
		return cards__imageGold;
	}
	public void setCards__imageGold(String cards__imageGold) {
		this.cards__imageGold = cards__imageGold;
	}
	public String getCards__flavorText() {
		return cards__flavorText;
	}
	public void setCards__flavorText(String cards__flavorText) {
		this.cards__flavorText = cards__flavorText;
	}
	public String getCards__cropImage() {
		return cards__cropImage;
	}
	public void setCards__cropImage(String cards__cropImage) {
		this.cards__cropImage = cards__cropImage;
	}
	public int getCards__childIds__001() {
		return cards__childIds__001;
	}
	public void setCards__childIds__001(int cards__childIds__001) {
		this.cards__childIds__001 = cards__childIds__001;
	}
	public int getCards__keywordIds__001() {
		return cards__keywordIds__001;
	}
	public void setCards__keywordIds__001(int cards__keywordIds__001) {
		this.cards__keywordIds__001 = cards__keywordIds__001;
	}
	public int getCards__keywordIds__002() {
		return cards__keywordIds__002;
	}
	public void setCards__keywordIds__002(int cards__keywordIds__002) {
		this.cards__keywordIds__002 = cards__keywordIds__002;
	}
	public int getCards__keywordIds__003() {
		return cards__keywordIds__003;
	}
	public void setCards__keywordIds__003(int cards__keywordIds__003) {
		this.cards__keywordIds__003 = cards__keywordIds__003;
	}
	public int getCards__childIds__002() {
		return cards__childIds__002;
	}
	public void setCards__childIds__002(int cards__childIds__002) {
		this.cards__childIds__002 = cards__childIds__002;
	}
	public int getCards__childIds__003() {
		return cards__childIds__003;
	}
	public void setCards__childIds__003(int cards__childIds__003) {
		this.cards__childIds__003 = cards__childIds__003;
	}
	public int getCards__childIds__004() {
		return cards__childIds__004;
	}
	public void setCards__childIds__004(int cards__childIds__004) {
		this.cards__childIds__004 = cards__childIds__004;
	}
	public int getCards__childIds__005() {
		return cards__childIds__005;
	}
	public void setCards__childIds__005(int cards__childIds__005) {
		this.cards__childIds__005 = cards__childIds__005;
	}
	public int getCards__childIds__006() {
		return cards__childIds__006;
	}
	public void setCards__childIds__006(int cards__childIds__006) {
		this.cards__childIds__006 = cards__childIds__006;
	}
	public int getCards__childIds__007() {
		return cards__childIds__007;
	}
	public void setCards__childIds__007(int cards__childIds__007) {
		this.cards__childIds__007 = cards__childIds__007;
	}
	public int getCards__childIds__008() {
		return cards__childIds__008;
	}
	public void setCards__childIds__008(int cards__childIds__008) {
		this.cards__childIds__008 = cards__childIds__008;
	}
	public int getCards__childIds__009() {
		return cards__childIds__009;
	}
	public void setCards__childIds__009(int cards__childIds__009) {
		this.cards__childIds__009 = cards__childIds__009;
	}
	public int getCards__childIds__010() {
		return cards__childIds__010;
	}
	public void setCards__childIds__010(int cards__childIds__010) {
		this.cards__childIds__010 = cards__childIds__010;
	}
	public int getCards__childIds__011() {
		return cards__childIds__011;
	}
	public void setCards__childIds__011(int cards__childIds__011) {
		this.cards__childIds__011 = cards__childIds__011;
	}
	public int getCardCount() {
		return cardCount;
	}
	public void setCardCount(int cardCount) {
		this.cardCount = cardCount;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	
}
