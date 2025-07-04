package trabalho;

import java.util.Objects;

public class Real extends Moeda{

	public Real(double valor) {
		super(valor);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Valor: R$ " + valor + ", Valor convertido: R$ " + converter() + " ";
	} 

	double converter() {
		return valor * 1;
	}; 
	
	void info() {
		System.out.println("Real: " + valor);
	}
}
