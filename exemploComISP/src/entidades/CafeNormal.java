package entidades;


public class CafeNormal extends Cafe{
	
	public CafeNormal(int docura, int tamanho, GraoCafe graoCafe) {
		super(docura, tamanho, graoCafe);
	}	
	
	@Override
	public String toString() {
		return "Caf� Normal:\n" + super.toString();
	}
		
}
