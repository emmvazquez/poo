
public class MainAnimales {

	public MainAnimales() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro perro1 = new Perro("Tuf","Blanco con café","Boxer","Dar la mano");
		Gato gato1 = new Gato("Pelusa","Negro","Minino");
		
		System.out.println(perro1.Enfada() + perro1.getTrucos() + perro1.Sonido());
		
		System.out.println(gato1.Enfada() + gato1.Sonido());
		
		System.out.println(gato1.muere());
		System.out.println(gato1.muere());
		
		
	}

}
