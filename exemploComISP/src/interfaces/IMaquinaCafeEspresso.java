package interfaces;

import entidades.CafeEspresso;

public interface IMaquinaCafeEspresso extends IMaquinaCafe{
	
	public CafeEspresso prepararCafeEspresso(int tamanho, int acucar);

}
