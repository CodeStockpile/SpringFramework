package com.hib.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


// need to map in xml

@Entity
public class Question {
	
	@Id
	private int qid;
	private String question;
	
	@OneToOne
	@JoinColumn(name="and_id")  // to rename the foreign key
	private Answer ans;
	
	public Answer getAns() {
		return ans;
	}
	public void setAns(Answer ans) {
		this.ans = ans;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
}
