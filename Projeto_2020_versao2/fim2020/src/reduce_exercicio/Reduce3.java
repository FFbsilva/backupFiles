package reduce_exercicio;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
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
	BiFunction<Media,Double,Media> mediaN = (m1,nota) -> m1.adicionar(nota); 
	BinaryOperator<Media> combinarN = (m1,m2) -> Media.combinar(m1,m2);
	Media resultante = alunos.stream().filter(aprovado).map(apenasNota).reduce(new Media(), mediaN, combinarN);
	
	//System.out.println(a);
	System.out.println(resultante.getValor());
	
}
}
