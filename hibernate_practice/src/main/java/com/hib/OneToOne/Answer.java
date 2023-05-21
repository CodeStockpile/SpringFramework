package com.hib.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
		
		@Id
		private int ansId;
		private String answer;
		
		// in case we want to see store the question id in answer id
		@OneToOne(mappedBy="answer") // variable in question 
		private Question question;
		
		public int getAnsId() {
			return ansId;
		}
		public void setAnsId(int ansId) {
			this.ansId = ansId;
		}
		public String getAnswer() {
			return answer;
		}
		public void setAnswer(String answer) {
			this.answer = answer;
		}
}
