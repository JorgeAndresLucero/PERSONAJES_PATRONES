package Builder;

import AbstractFactory.*;

public class BuilderOrco extends Builder {
	
	 
     
     
	public void buildArma() {
		AbstractFactory fabrica;
		 
		 fabrica = new FabricaOrco();
	    
		Arma a;
	    a = fabrica.crearArmas();
		p.setArma(a.operacionar());
		
	}


	public void buildEscudo() {
		AbstractFactory fabrica;
		 
		 fabrica = new FabricaOrco();
	    
	    Escudo e;
		e = fabrica.crearEscudos();
		p.setEscudo(e.operacionesc());
		
	}

}
