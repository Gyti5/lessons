package lt.baltictalents.lesson3.pattern.example.di.client;


import lt.baltictalents.lesson3.pattern.example.di.service.PaymentService;

public class MyDIApplication implements Client {

	private PaymentService service;
	public MyDIApplication(PaymentService service){
		this.service = service;
	}
	
	public MyDIApplication(){}
	
	public void setService(PaymentService service) {
		this.service = service;
	}
	public String get(){
		return null;
	}
	@Override
	public String processMessages(String msg, Integer rec){
		// Do some msg validation, manipulation logic etc
		this.service.sendPayment(msg, rec);
		return service.sendPayment(msg, rec);
	}


}
