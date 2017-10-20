package Factory;

public class CreadorOrco extends Creador{
	
	public Personaje factorymethod() {
		return new Orco();
	}

}
