
public class Perro extends Animal{
private String Trucos;

	public Perro() {
		// TODO Auto-generated constructor stub
	}
	
	public Perro(String nombre, String color, String raza, String trucos) {
		super(nombre, color, raza);
		Trucos = trucos;
	}
	
	public String Ficha() {
		return this.DatosAnimal() + "Trucos : " + this.getTrucos();
	}
	
	public String Sonido() {
		return "- Guauuu ..";
	}

	public String getTrucos() {
		return Trucos;
	}

	public void setTrucos(String trucos) {
		Trucos = trucos;
	}
	
	

}
