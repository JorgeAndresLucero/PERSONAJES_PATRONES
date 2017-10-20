package Builder;

public abstract class Builder {
	
	protected PersonajeArmado p;
	public PersonajeArmado getPersonajeArmado() {
		return p;
	}
	
	public void crearPersonaje() {
		p = new PersonajeArmado();
	}
	
public abstract void buildArma();
public abstract void buildEscudo();


	

}
