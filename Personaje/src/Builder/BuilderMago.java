package Builder;

import AbstractFactory.*;


public class BuilderMago extends Builder {

	
	public void buildArma() {
		AbstractFactory fabrica;
		 
		 fabrica = new FabricaMago();
	    
		Arma a;
	    a = fabrica.crearArmas();
		p.setArma(a.operacionar());
		
	}

	
	public void buildEscudo() {
		AbstractFactory fabrica;
		 
		 fabrica = new FabricaMago();
	    
		Escudo e;
	    e = fabrica.crearEscudos();
		p.setArma(e.operacionesc());
		
	}

}
