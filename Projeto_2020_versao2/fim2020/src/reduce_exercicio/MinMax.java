package reduce_exercicio;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
public static void main(String[] args) {
	
	Aluno a1 = new Aluno ("Pedro",7.5);
	Aluno a2 = new Aluno("Paulo",false,5.7);
	Aluno a3 = new Aluno("Angela" , 9.8);
	Aluno a4 = new Aluno("Bia", 5.9);
	Aluno a5 = new Aluno ("Carla", false,8.7);
	
	List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);
	Comparator<Aluno> melhorNota = (aluno1,aluno2) -> {
		if(aluno1.nota > aluno2.nota) return 1;
		if(aluno1.nota< aluno2.nota) return -1;
		return 0;
	};
	
	System.out.println(alunos.stream().max(melhorNota).get());
	
}
}
