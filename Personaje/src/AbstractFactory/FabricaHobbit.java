package AbstractFactory;

public class FabricaHobbit extends AbstractFactory {

	@Override
	public
	Escudo crearEscudos() {
		
		return new EscudoHobbit();
	}
	

	@Override
	public
	Arma crearArmas() {
		
		return new ArmaHobbit();
	}
	
	

}
