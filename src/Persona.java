
public class Persona {
private String Nombre;
private String ApellidoPaterno;

	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(String nombre, String apellidoPaterno) {
		Nombre = nombre;
		ApellidoPaterno = apellidoPaterno;
	}

	protected void mostrarNombreCompleto() {
		System.out.println(this.Nombre + ' ' + this.ApellidoPaterno);
	//equivalentes	System.out.println(this.getNombre() + ' ' + this.getApellidoPaterno());
		
	}
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidoPaterno() {
		return ApellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		ApellidoPaterno = apellidoPaterno;
	}

}
