package com.training.model;

public class SimCard {
	private String serviceProvider;
	private String contactNo;
	private boolean fiveGenabled;
		
		SimCard(){}
	
		
		public String getServiceProvider() {
			return serviceProvider;
		}
		public void setServiceProvider(String serviceProvider) {
			this.serviceProvider = serviceProvider;
		}
		
		public String getContactNo() {
			return contactNo;
		}
		public void setContactNo(String contactNo) {
			this.contactNo = contactNo;
		}
		
		public boolean isFiveGenabled() {
			return fiveGenabled;
		}
		public void setFiveGenabled(boolean fiveGenabled) {
			this.fiveGenabled = fiveGenabled;
		}
		
		
	
}
