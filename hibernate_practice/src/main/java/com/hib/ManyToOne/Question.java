package com.hib.ManyToOne;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


// need to map in xml

@Entity
public class Question {
	
	@Id
	private int qid;
	private String question;
	
	@OneToMany(mappedBy="question")
	private List<Answer> ans;
	
	
	public List<Answer> getAns() {
		return ans;
	}
	
	
	public void setAns(List<Answer> ans) {
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
