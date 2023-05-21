package com.hib.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Answer {
		
		@Id
		private int ansId;
		private String answer;
		
		@ManyToOne
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
