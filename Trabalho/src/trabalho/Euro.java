package trabalho;

import java.util.Objects;

public class Euro extends Moeda{
	
	double cotacaoEuro = 6.30; //Cotação do Euro hoje

	public Euro(double valor) {
		super(valor);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cotacaoEuro);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Euro other = (Euro) obj;
		return Double.doubleToLongBits(cotacaoEuro) == Double.doubleToLongBits(other.cotacaoEuro);
	}

	@Override
	public String toString() 
	{
		return "Valor: EUR " + valor + ", Valor convertido: R$ " + converter() + "  ";
	}

	public double converter() {
		return valor * cotacaoEuro;
	};
	
	void info() {
		System.out.println("Euro: " + valor);
	}
}
