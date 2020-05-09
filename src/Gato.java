
public class Gato  extends Animal{
private int Vidas;

	public Gato() {
		// TODO Auto-generated constructor stub
	}
	
	public Gato(String nombre, String color, String raza) {
		super(nombre, color, raza);
		Vidas = 7;
	}

	public String Sonido() {
		return "- Miauuu ..";
	}
	
	
	public String muere() {
		this.setVidas(this.getVidas() - 1);
		return "El gato " + this.getNombre()+ "tiene ahora" + this.getVidas();
	}
	public int getVidas() {
		return Vidas;
	}

	public void setVidas(int vidas) {
		Vidas = vidas;
	}

}
