package padraoObserver2;

import java.util.Date;

public class EventoAniversariante {
	
	private final Date horario;

	public EventoAniversariante(Date horario) {
		this.horario = horario;
	}

	public Date getHorario() {
		return horario;
	}
	
}
