import entidades.CafeEspresso;
import entidades.CafeNormal;
import entidades.GraoCafe;
import entidades.MaquinaEspresso;
import entidades.MaquinaNormal;

public class Aplicacao {
	private static MaquinaEspresso maquinaEspresso;
	private static MaquinaNormal   maquinaNormal;

	private static GraoCafe grao;


	public static void main(String[] args) {
		int quantidadeAcucar, tamanhoMl;

		maquinaEspresso = new MaquinaEspresso();
		maquinaNormal   = new MaquinaNormal();
		
		grao 	= new GraoCafe("Arabica", "Shulambs");		
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
