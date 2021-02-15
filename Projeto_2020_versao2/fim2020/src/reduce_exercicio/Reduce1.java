package reduce_exercicio;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
public static void main(String[] args) {
	
	List<Integer> nums = Arrays.asList(2,4,6,8,10,12,14,16);
	
	BinaryOperator<Integer> soma = (ac, n) -> ac+n;
	
	Integer total =  nums.stream().reduce(soma).get();
	Integer total2 = nums.stream().reduce(100, soma);
	
	System.out.println(total);
	System.out.println(total2);
	
	nums.stream().filter(n-> n>8).reduce(soma).ifPresent(System.out::println);
	
	int processador = Runtime.getRuntime().availableProcessors();
	System.out.println(processador);
}
}
