package trabalho;

import java.util.Objects;

public class Dolar extends Moeda{
	
	double cotacaoDolar = 5.80; //Cotação do dólar hoje

	

	public Dolar(double valor) {
		super(valor);
	}



	@Override
	public String toString()
	{
		return "Valor: USD " + valor + ", Valor convertido: R$ " + converter() + "  ";
	}

	double converter() {
		return valor * cotacaoDolar;
	}; 
	
	void info() {
		System.out.println("Dolar: " + valor);
	}	
}
