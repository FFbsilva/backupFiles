package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filters {
public static void main(String[] args) {
	
	Aluno a1 = new Aluno("Luca",2.5);
	Aluno a2 = new Aluno("Dani",7.8 );
	Aluno a3 = new Aluno("Marcelo", 5.7);
	Aluno a5 =  new Aluno("Marcio",7.8);
	Aluno a6 = new Aluno ("Andre", 8.9);
	Aluno a7 = new Aluno ("Andreia", 9);
	
	List<Aluno>alunos = Arrays.asList(a1,a2,a3,a5,a6,a7);
	Predicate<Aluno> aprovado = b -> b.nota>=7; 
	alunos.stream().filter(aprovado)
	.map(a-> "Parabén "+ a.nome + " você foi aprovado").
	forEach(System.out::println);
}
}
