package Builder;

import AbstractFactory.*;


public class BuilderHumano extends Builder {


	public void buildArma() {
		AbstractFactory fabrica;
		 
		 fabrica = new FabricaHumano();
	    
		Arma a;
	    a = fabrica.crearArmas();
		p.setArma(a.operacionar());
		
	}


	public void buildEscudo() {
		AbstractFactory fabrica;
		 
		 fabrica = new FabricaHumano();
	    
		Escudo e;
	    e = fabrica.crearEscudos();
		p.setArma(e.operacionesc());
		
	}

}
