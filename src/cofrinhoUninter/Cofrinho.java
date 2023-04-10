package cofrinhoUninter;

import java.util.ArrayList;
import java.util.Objects;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

	Moeda moeda;

	public ArrayList<Moeda> getListaMoedas() {
		return listaMoedas;
	}

	public void setListaMoedas(ArrayList<Moeda> listaMoedas) {
		this.listaMoedas = listaMoedas;
	}

	@Override
	public String toString() {
		return "Cofrinho [listaMoedas=" + listaMoedas + ", moeda=" + moeda + "]";
	}

	void adicionar(Moeda c) {
		listaMoedas.add(c);
	}

	void remover(Moeda c) {
		listaMoedas.remove(c);
	}

	void listagemMoedas(Moeda c) {
		System.out.println(getListaMoedas());
	}

	double totalConvertido(Moeda c) {
		double total = 0;
		total = c.converter();
		return total;
	}

	@Override
	public int hashCode() {
		return Objects.hash(listaMoedas, moeda);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cofrinho other = (Cofrinho) obj;
		return Objects.equals(listaMoedas, other.listaMoedas) && Objects.equals(moeda, other.moeda);
	}

}
