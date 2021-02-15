package streams;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
public class Desafio_streams {

public static void main(String[] args) {
	
	Consumer<Object> println = System.out::println;
	
	List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
	
	Function<Integer,String> paraBi = n-> Integer.toBinaryString(n);
	UnaryOperator<String>invertFim = n-> new StringBuilder(n).reverse().toString();
	Function<String,Integer> fim = n-> Integer.parseInt(n, 2);
	
	nums.stream()
	.map(paraBi).forEach(println);
	
	System.out.println("\n");
	
	nums.stream().map(paraBi).map(invertFim).map(fim).forEach(println);
}
}
