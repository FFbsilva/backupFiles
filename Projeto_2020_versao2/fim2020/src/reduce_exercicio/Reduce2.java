package reduce_exercicio;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
public static void main(String[] args) {
	
	Aluno a1 = new Aluno ("Pedro",7.5);
	Aluno a2 = new Aluno("Paulo",false,5.7);
	Aluno a3 = new Aluno("Angela" , 9.8);
	Aluno a4 = new Aluno("Bia", 5.9);
	Aluno a5 = new Aluno ("Carla", false,8.7);
	
	List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);
	
	Predicate<Aluno> aprovado = a-> a.nota> 5 && a.comportamento == true;
	Function<Aluno,Double> apenasNota = a-> a.nota;
	BinaryOperator<Double> somatorio = (a,b)-> a+b;
	
	alunos.stream().filter(aprovado)
	.map(apenasNota)
	.reduce(somatorio)
	.ifPresent(System.out::println);
}
}
