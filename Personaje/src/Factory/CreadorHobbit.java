package Factory;

public class CreadorHobbit extends Creador{

	
	public Personaje factorymethod() {
		
		return new Hobbit();
	}

}
