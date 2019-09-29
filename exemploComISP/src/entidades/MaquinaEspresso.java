package entidades;

import interfaces.IMaquinaCafeEspresso;

public class MaquinaEspresso extends MaquinaCafe implements IMaquinaCafeEspresso {
	@Override
	public CafeEspresso prepararCafeEspresso(int tamanho, int acucar) {
		return new CafeEspresso(acucar, tamanho, graoCafe);
	}

	

}
