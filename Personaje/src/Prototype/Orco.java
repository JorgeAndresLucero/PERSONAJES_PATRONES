package Prototype;

public class Orco implements Personajes{
	private String nombre;
	private String arma;
	private String escudo;

	@Override
	public void setNombre(String n) {
		this.nombre=n;
		
	}

	@Override
	public String getNombre() {
		
		return nombre;
	}

	@Override
	public void setArma(String a) {
		 this.arma=a;
	}

	@Override
	public String getArma() {
		
		return arma;
	}

	@Override
	public void setEscudo(String e) {
		
		this.escudo=e;
	}

	@Override
	public String getEscudo() {
		// TODO Auto-generated method stub
		return escudo;
	}

	@Override
	public Personajes clonar() {
		Personajes personaje = new Orco();
		personaje.setNombre(this.nombre);
		personaje.setArma(this.arma);
		personaje.setEscudo(this.escudo);
		
		return personaje;
	}

	

	


}
