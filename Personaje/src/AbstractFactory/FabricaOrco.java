package AbstractFactory;

public class FabricaOrco extends AbstractFactory {

	@Override
	public Escudo crearEscudos() {
	
		return new EscudoOrco();
	}

	@Override
	public Arma crearArmas() {
		
		return new ArmaOrco();
	}



}
