package Factory;

public class CreadorHumano extends Creador {
	
	public Personaje factorymethod() {
		return new Humano();
	}

}
