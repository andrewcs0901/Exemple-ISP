package entidades;

public class CafeEspresso extends Cafe{

	public CafeEspresso(int docura, int tamanho, GraoCafe graoCafe) {
		super(docura, tamanho, graoCafe);
	}
	
	@Override
	public String toString() {
		return "Caf� Espresso:\n" + super.toString();
	}

}
