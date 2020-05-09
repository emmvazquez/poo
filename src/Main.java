
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deportista od1  = new Deportista("Emmanuel","Vazquez","Natación");
		od1.registrarTiempo(20.1);
		od1.registrarTiempo(18.5);
		od1.registrarTiempo(8.3);
		od1.mostrarFicha();
		
		
		Persona op1  = new Persona ("Juan", "Pérez");
		op1.mostrarNombreCompleto();
	}

}
