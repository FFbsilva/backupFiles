package modelo.basico;

import infra.DAO_Escola;

public class NovoAluno {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Maria Joaquina", true,"Serie6");
		
		DAO_Escola<Aluno> dao = new DAO_Escola<>(Aluno.class);
		dao.incluirFull(aluno1).fecharEm();
		//dao.buscarT(5,8);
	}

}
