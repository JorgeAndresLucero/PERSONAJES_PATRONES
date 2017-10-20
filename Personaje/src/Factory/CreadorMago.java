package Factory;

public class CreadorMago extends Creador {


	public Personaje factorymethod() {
		
		return new Mago();
	}

}
