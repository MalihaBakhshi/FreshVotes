package com.freshvotes.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Vote {
	
	private VoteId pk;
	private Boolean vote;
	
	@EmbeddedId
	public VoteId getPk() {
		return pk;
	}
	public void setPk(VoteId pk) {
		this.pk = pk;
	}
	public Boolean getVote() {
		return vote;
	}
	public void setVote(Boolean vote) {
		this.vote = vote;
	}
	
	
}
