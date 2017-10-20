package Builder;

import AbstractFactory.*;

public class BuilderHobbit extends Builder {

	public void buildArma() {
		AbstractFactory fabrica;
		 
		 fabrica = new FabricaHobbit();
	    
		Arma a;
	    a = fabrica.crearArmas();
		p.setArma(a.operacionar());
		
	}

	
	public void buildEscudo() {
		
		AbstractFactory fabrica;
		 
		 fabrica = new FabricaHobbit();
	    
		Escudo e;
	    e = fabrica.crearEscudos();
		p.setArma(e.operacionesc());
	}

}
