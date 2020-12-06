package abstrato;

public abstract class  Animal {
	
	private String status= "parado";
	
	
	
	 public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	String comer() {
		return "Comendo";
	}
	 
	 String respirar() {
		 return "CO2";
	 }
	
	 String andar() {
		 return "andando";
	 }
}
