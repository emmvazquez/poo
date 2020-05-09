
public class Animal {
private String Nombre;
private String Color;
private String Raza;


	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public String Enfada() {
		return "gr grgrgrgrgr";
	}
	
	

	public Animal(String nombre, String color, String raza) {
		super();
		Nombre = nombre;
		Color = color;
		Raza = raza;
	}



	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getColor() {
		return Color;
	}


	public void setColor(String color) {
		Color = color;
	}


	public String getRaza() {
		return Raza;
	}


	public void setRaza(String raza) {
		Raza = raza;
	}

}
