package entidades;

import interfaces.IMaquinaCafe;

public class MaquinaCafe implements IMaquinaCafe{
	
	protected GraoCafe graoCafe;
	
	@Override
	public void adicionarGraoCafe(GraoCafe graoCafe) {
		this.graoCafe = graoCafe;
	}
	
	

}
