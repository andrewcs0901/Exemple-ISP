package interfaces;

import entidades.CafeNormal;

public interface IMaquinaCafeNormal extends IMaquinaCafe{
	
	public CafeNormal prepararCafeNormal(int tamanho, int acucar);

}
