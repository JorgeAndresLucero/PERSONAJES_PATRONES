package AbstractFactory;

public class FabricaMago extends AbstractFactory {

	@Override
	public
	Escudo crearEscudos() {
	
		return new EscudoMago();
	}

	@Override
	public
	Arma crearArmas() {
		
		return new ArmaMago();
	}

}
