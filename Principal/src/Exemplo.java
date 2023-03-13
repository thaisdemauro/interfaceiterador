import java.util.ArrayList;

public class Exemplo {

	public static void main(String[] args) {

	ArrayList<String> listaNome = new ArrayList<>();
	listaNome.add("Kiss");
	listaNome.add("Helena");
	listaNome.add("Renato");
	listaNome.add("Rute");
	
	
	for(String nome: listaNome) {
		System.out.println(nome);
	}
	}

}
