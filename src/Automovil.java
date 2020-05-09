
public class Automovil extends Vehiculo{
private int NumeroPuertas;
private String TipoTransmision;


	public Automovil(String modelo, int anio, String color, int numeroPuertas, String tipoTransmision) {
		super(modelo,anio, color);
		NumeroPuertas = numeroPuertas;
		TipoTransmision = tipoTransmision;
	}
	public void detalle() {
		this.detalleVehiculo();
		System.out.println("Numero de puertas : " + this.getNumeroPuertas());
		System.out.println("Tipo de transmisión : " + this.getTipoTransmision());
		System.out.println("Servicios  : " + this.getNumeroServicios());
		System.out.println("_______________");	
	}

	public int getNumeroPuertas() {
		return NumeroPuertas;
	}
	public void setNumeroPuertas(int numeroPuertas) {
		NumeroPuertas = numeroPuertas;
	}

	public String getTipoTransmision() {
		return TipoTransmision;
	}


	public void setTipoTransmision(String tipoTransmision) {
		TipoTransmision = tipoTransmision;
	}	
}
