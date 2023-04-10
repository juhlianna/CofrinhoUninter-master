package cofrinhoUninter;

import java.util.Objects;


public abstract class Moeda {

	double valor;

	double taxa;

	void info() {

	}

	double converter() {
		double total = 0;
		return total;
	}


	@Override
	public String toString() {
		return "Moeda [valor=" + valor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(taxa, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(taxa) == Double.doubleToLongBits(other.taxa)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

}
