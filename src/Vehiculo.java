public class Vehiculo {
private String Modelo;
private int Anio;
private String Color;
private Boolean estadoVehiculo;

private int NumeroServicios;

	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}	
	
	public Vehiculo(String modelo, int anio, String color) {
		Modelo = modelo;
		Anio = anio;
		Color = color;
		estadoVehiculo = false;
		NumeroServicios = 0;
	}
	
	
	public void encender() {
		if(this.getEstadoVehiculo() == false) {
			this.setEstadoVehiculo(true);
			System.out.println("El vehículo está encendido");
		}
		else {
			this.setEstadoVehiculo(false);
			System.out.println("El vehículo está apagado");
		}
		
	}	
	
	public void Polimorfo() {
		System.out.println("Este método se ejecuta desde la clase vehículo");
	}
	
	
	
	public void darServicio() {
		this.setNumeroServicios(this.getNumeroServicios() + 1);
		
	}

	public void detalleVehiculoI() {
		System.out.println("Modelo : " + this.getModelo());
		System.out.println("Año : " + this.getAnio());
		System.out.println("Color : " + this.getColor());
	}
	
	public String detalleVehiculo() {
		return "Modelo : " + this.getModelo() + '\n' + 
		"Año : " + this.getAnio() + '\n' +
		"Color : " + this.getColor();
	}
	
	
	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public int getAnio() {
		return Anio;
	}

	public void setAnio(int anio) {
		Anio = anio;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public Boolean getEstadoVehiculo() {
		return estadoVehiculo;
	}

	public void setEstadoVehiculo(Boolean estadoVehiculo) {
		this.estadoVehiculo = estadoVehiculo;
	}

	public int getNumeroServicios() {
		return NumeroServicios;
	}

	public void setNumeroServicios(int numeroServicios) {
		NumeroServicios = numeroServicios;
	}
}
