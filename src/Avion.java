//			 avión hereda Vehiculo
public class Avion extends Vehiculo{
private int NumeroTurbinas;
private int NumeroPasajeros;

	public Avion() {
		// TODO Auto-generated constructor stub
	}

	public Avion(String modelo, int anio, String color, int numeroTurbinas, int numeroPasajeros) {
		super(modelo, anio, color);  //se mandan los parametros a la clase padre
		NumeroTurbinas = numeroTurbinas;
		NumeroPasajeros = numeroPasajeros;
	}
	
	public String ficha() {
		
		return 
		this.detalleVehiculo() + 
		"Numero de turbinas : " + this.getNumeroTurbinas() + '\n' +
		"Número de pasajeros : " + this.getNumeroPasajeros() + '\n' +
		"Servicios  : " + this.getNumeroServicios() + '\n' +
		"_______________";
		
	}
	
	public void encender() {
		if(this.getEstadoVehiculo() == false) {
			this.setEstadoVehiculo(true);
			System.out.println("El avión está encendido");
		}
		else {
			this.setEstadoVehiculo(false);
			System.out.println("El avión está apagado");
		}
		
	}
	
	public void Polimorfo() {
		System.out.println("Este método se ejecuta desde la clase avión");
	}

	public int getNumeroTurbinas() {
		return NumeroTurbinas;
	}

	public void setNumeroTurbinas(int numeroTurbinas) {
		NumeroTurbinas = numeroTurbinas;
	}

	public int getNumeroPasajeros() {
		return NumeroPasajeros;
	}

	public void setNumeroPasajeros(int numeroPasajeros) {
		NumeroPasajeros = numeroPasajeros;
	}
}
