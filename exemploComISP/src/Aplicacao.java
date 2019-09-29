import entidades.CafeEspresso;
import entidades.CafeNormal;
import entidades.GraoCafe;
import entidades.MaquinaEspresso;
import entidades.MaquinaNormal;
import interfaces.IMaquinaCafe;
import interfaces.IMaquinaCafeEspresso;
import interfaces.IMaquinaCafeNormal;

public class Aplicacao {
	private static MaquinaNormal maquinaNormal = new MaquinaNormal();
	private static MaquinaEspresso maquinaEspresso = new MaquinaEspresso() ;

	private static GraoCafe grao;


	public static void main(String[] args) {
		int quantidadeAcucar, tamanhoMl;
		
		grao = new GraoCafe("Arabica", "Shulambs");		
		quantidadeAcucar= 50;
		tamanhoMl = 500;
		
		
		maquinaEspresso.adicionarGraoCafe(grao);
		
		CafeEspresso cafeEspresso = maquinaEspresso.prepararCafeEspresso(tamanhoMl, quantidadeAcucar);	
		
		System.out.println(cafeEspresso);	
		
		System.out.println("");
		

		quantidadeAcucar= 0;
		tamanhoMl = 300;
		maquinaNormal.adicionarGraoCafe(grao);

		
		CafeNormal cafeNormal= maquinaNormal.prepararCafeNormal(tamanhoMl, quantidadeAcucar);
		cafeNormal.setDocura(20);
		System.out.println(cafeNormal);		
		
	}
}
