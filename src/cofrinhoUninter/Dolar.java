package cofrinhoUninter;

import java.util.Objects;

public class Dolar extends Moeda{
	
	int idDolar = 01;
	double taxa = 5.05;
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(idDolar, taxa);
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
		Dolar other = (Dolar) obj;
		return idDolar == other.idDolar && Double.doubleToLongBits(taxa) == Double.doubleToLongBits(other.taxa);
	}

	@Override
	public String toString() {
		return "Dolar = " + valor + "";
	}

	@Override
	double converter() {
		// TODO Auto-generated method stub
		double total = this.valor * this.taxa;
		return total;
	}



	

	
	
}
