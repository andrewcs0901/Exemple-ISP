package interfaces;

import entidades.*;

public interface IMaquinaCafe {	
	
	public void adicionarGraoCafe(GraoCafe graoCafe);
	public CafeEspresso prepararCafeEspresso(int tamanho, int acucar);
	public CafeNormal prepararCafeNormal(int tamanho, int acucar);

	
	
}
