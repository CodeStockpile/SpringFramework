package com.spring.ref;

public class Laptop {

		private String model;
		private Battery battery;
		public Laptop() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Laptop(String model, Battery battery) {
			super();
			this.model = model;
			this.battery = battery;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public Battery getBattery() {
			return battery;
		}
		public void setBattery(Battery battery) {
			this.battery = battery;
		}
		@Override
		public String toString() {
			return "Laptop [model=" + model + ", battery=" + battery + "]";
		}
	
		
}
