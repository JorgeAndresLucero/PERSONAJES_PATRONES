package AbstractFactory;

public class FabricaHumano extends AbstractFactory{

	@Override
	public
	Escudo crearEscudos() {
		
		return new EscudoHumano();
	}

	@Override
	public
	Arma crearArmas() {
		
		return new ArmaHumano();
	}

}
