package entidades;

public class Cafe{
	private int docura;
	private int tamanho;
	private GraoCafe graoCafe;
	
	public Cafe(int docura, int tamanho, GraoCafe graoCafe) {
		this.docura = docura;
		this.tamanho = tamanho;
		this.graoCafe = graoCafe;
	}
	
	public int getDocura() {
		return docura;
	}
	public void setDocura(int docura) {
		this.docura += docura;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public GraoCafe getGraoCafe() {
		return graoCafe;
	}
	public void setGraoCafe(GraoCafe graoCafe) {
		this.graoCafe = graoCafe;
	}
	
	@Override
	public String toString() {
		return "Grao :  " + this.graoCafe.getDescricao() + "\n" +
			   "Tamanho:" + this.tamanho + " ml\n" +
			   "Doçura: " + this.getDocura() + "%";
	}

	
}
