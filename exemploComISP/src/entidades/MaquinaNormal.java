package entidades;

import interfaces.IMaquinaCafeNormal;

public class MaquinaNormal extends MaquinaCafe implements IMaquinaCafeNormal{
	@Override
	public CafeNormal prepararCafeNormal(int tamanho, int acucar) {
		return new CafeNormal(acucar, tamanho, graoCafe);
	}
	
}
