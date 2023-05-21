package com.surjeet.java.SOLID;



// High level modules should not depend on low level modules instead they should depend on abstractions

class MyMessanger{
	
	//TCPHandler tcphandler = new TCPHandler();
	
	ProtocolHandler handler;
	public MyMessanger(String protocol) {
		handler = ProtocolHandlerFactory.getProtocol(protocol);
	}
	
	public void send(String to, String message) {
		//tcphandler.sendMessage("Message to - "+ to + " | Message is- "+ message);
		handler.sendMessage("Message to - "+ to + " | Message is- "+ message);
	}
}


interface ProtocolHandler {
	 void sendMessage(String message);
}


// low level
class TCPHandler implements ProtocolHandler{
	
	@Override
	public void sendMessage(String message) {
		System.out.println("TCP-Handler is sending message : " + message);
	}
}


//low level
class UDPPHandler implements ProtocolHandler{
	
	@Override
	public void sendMessage(String message) {
		System.out.println("UDP-Handler is sending message : " + message);
	}
}



class ProtocolHandlerFactory {
	
	public static ProtocolHandler getProtocol(String protocol) {
	
		if("TCP".equalsIgnoreCase(protocol))
			return new TCPHandler();
		if("UDP".equalsIgnoreCase(protocol))
			return new UDPPHandler();
		return null;
	}
}

public class DependencyInversion {

	public static void main(String[] args) {
		
		MyMessanger m = new MyMessanger("UDP")
				;
		m.send("ABC", "Hiii....");

	}

}
