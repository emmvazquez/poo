
public class ArregloCompuesto {

	public ArregloCompuesto() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal Arr1[] = new Animal[5];
		
		
		Animal a1 = new Animal("tuf","blanco","boxer");
		Animal a2 = new Animal("Dante","cafe","boxer");
		Animal a3 = new Animal("Remi","café","cuyo");
		Animal a4 = new Animal("Negro","negro","sin raza");
		
		
		Arr1[0] = a1;
		Arr1[1] = a2;
		Arr1[2] = a3;
		Arr1[3] = a4;
		Arr1[4] = a1;
		
		for(int i =0; i< Arr1.length; i++) {
			System.out.println(Arr1[i].getNombre());
		}	
	
	}

}
