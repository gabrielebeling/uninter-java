package trabalho;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>();
	
	public void adicionar(Moeda m)
	{
		listaMoeda.add(m);
	}
	
	public void remover(Moeda m)
	{
		listaMoeda.remove(m);
	}
	
	public void listar()
	{
		for (Moeda m : listaMoeda) {
			System.out.println(m);
		}
	}
	
	 public double totalConvertido() {
	        double total = 0;
	        for (Moeda moeda : listaMoeda) {
	            total += moeda.converter();  // Chama o método converter() de cada moeda
	        }
	        return total;
	    }
	
}
