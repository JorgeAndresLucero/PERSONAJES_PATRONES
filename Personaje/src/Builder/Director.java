package Builder;

public class Director {

	private Builder personajesbuilder;
	
	public void construirPersonaje() {
		personajesbuilder.crearPersonaje();
		personajesbuilder.buildArma();
		personajesbuilder.buildEscudo();
	}

	public void setPersonajesbuilder(Builder pb) {
	personajesbuilder = pb;
	}
	
	public PersonajeArmado getPersonajeArmado() {
		return personajesbuilder.getPersonajeArmado();
		
	}



	

}
