package generico;

import java.util.Arrays;
import java.util.List;

public class ListaUtil_Teste {
public static void main(String[] args) {
	List<String> langs = Arrays.asList("PHP", "C++", "Java", "Vue");
	List<Integer> numeros = Arrays.asList(12,13,1,4,15,16,17,18,19);
	 	
	
	ListaUtil lista = new ListaUtil();
	
	String linguas = (String) lista.getUltimo(langs);
	System.out.println(linguas);
	
	String linguas2 = lista.getUltimo2(langs);
	System.out.println(linguas2);
	
	
}
}
