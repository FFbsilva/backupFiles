package padroes_observer;

import java.util.Date;

public class ChegadaHomensEvent {

	private final Date horario;
	
	
	public ChegadaHomensEvent(Date horario) {
		// TODO Auto-generated constructor stub
	  this.horario = horario;
	}
	
	public Date getHorario() {
		return this.horario;
	}
}
