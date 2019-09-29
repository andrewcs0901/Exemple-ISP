package entidades;

import interfaces.IMaquinaCafe;

public class MaquinaNormal implements IMaquinaCafe{
	
	private GraoCafe graoCafe;
	
	@Override
	public CafeNormal prepararCafeNormal(int tamanho, int acucar) {
		return new CafeNormal(acucar, tamanho, graoCafe);
	}

	@Override
	public void adicionarGraoCafe(GraoCafe graoCafe) {
		this.graoCafe = graoCafe;
	}

	@Override
	public CafeEspresso prepararCafeEspresso(int tamanho, int acucar) {
		return null;
	}

}
