package abstrato;

public class Dragao_Comodo extends Reptil {
	
	private String status = "parado";
	
	
	
	
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	String andar() {
	if(status == "parado") {

		// TODO Auto-generated method stub
		return this.getStatus();	
	}else {	return "andando a 6 km/h"; }
		
	}
	
	
	
	
}
