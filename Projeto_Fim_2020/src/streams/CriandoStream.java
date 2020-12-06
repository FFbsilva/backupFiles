package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {
public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Double> printDo = System.out::print;
		
		Stream<String> linguas = Stream.of(" Java "," PHP "," Lua \n");
		linguas.forEach(print);
		
		Stream<Double> fracos = Stream.of(3.89 , 4.89 , 5.89);
		fracos.forEach(printDo);
		
		String[] maislinguas = {" C# "," Javascript ","C"," Go \n"};
		Stream.of(maislinguas).forEach(print);
		
		Arrays.stream(maislinguas).forEach(print);
		Arrays.stream(maislinguas,1,4).forEach(print);
		
		List<String> outrasLinguas = Arrays.asList(" Kotlin "," Typescript "," Python \n");
		outrasLinguas.stream().forEach(print);
		outrasLinguas.parallelStream().forEach(print);
}
}
