
public class Deportista extends Persona{
private String Deporte;
private Double TiempoAcumulado;

	public Deportista(String nombre, String apellidoPaterno, String deporte) {
		// TODO Auto-generated constructor stub
		super(nombre, apellidoPaterno);
		Deporte = deporte;
		TiempoAcumulado = 0.0;
	}
	
	public void registrarTiempo(Double tiempo) {
		this.setTiempoAcumulado(this.getTiempoAcumulado() + tiempo);
	}
	
	public void mostrarFicha() {
		this.mostrarNombreCompleto();
		System.out.println(this.Deporte + ' ' + this.TiempoAcumulado);
	}

	public String getDeporte() {
		return Deporte;
	}

	public void setDeporte(String deporte) {
		Deporte = deporte;
	}

	public Double getTiempoAcumulado() {
		return TiempoAcumulado;
	}

	public void setTiempoAcumulado(Double tiempoAcumulado) {
		TiempoAcumulado = tiempoAcumulado;
	}

}
