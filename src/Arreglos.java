
public class Arreglos {
private int Numero;


	public Arreglos() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String a[]) {
//		int x, x1, x2;
//		x = 8734;
//		x1 = 23;
//		x2 = 345;
//		//System.out.println(x);
//		
//		int arreglo[] = new int[3]; //tamaño es de 3
//		arreglo[0] = 8734; //posición 0
//		arreglo[1] = 23;
//		arreglo[2] = 345;
//		
//		String arreglo3[] = {"hola","a","todos","desde","el","arreglo"};
//		System.out.print(arreglo3[4]);
//		
//		
//		Boolean arreglo4[] = {true, false, true, true};   //arreglo Bool
//		Double arreglo5[] = {1.0,34.8, 4.6};   // arreglo doble
//		
//		/*
//		try {
//			System.out.println(arreglo[2]);
//			System.out.println("hola desde try");
//		}
//		catch(Exception e) {
//			System.out.println("hola esta es tu excepción" + e);
//		}
//		*/
//		
//		
//		int arreglo2[] = {8734, 23, 345,67, 547, 524, 9863, 87653,32};
//		
//		//System.out.println(arreglo2[2]);
//		arreglo2[2] = 27;   //asignamos un valor a una posición en específico 
//		//System.out.println(arreglo2[0] + ' ' +  arreglo2[1]  + ' ' + arreglo2[2] + ' ' +  arreglo2[3]);
//		
//		//System.out.println(arreglo2.length);
//		
//		for(int i = 0; i < arreglo2.length; i ++) {
//			//System.out.print(arreglo2[i] + ",");
//		}	
//		
//		
//		
		
		
		String nombres[] =  {"Emmanuel", "Abdiel","Ailyn","Clau"};;
		int edad[] = {36, 15,9,43};
		
		
		Double totalEdad = 0.0;
		for(int i =0; i < nombres.length; i ++) {
			System.out.println(nombres[i] + " tiene " + edad[i] + " años");
			totalEdad = totalEdad + edad[i];
			
		}
		
		System.out.println("La edad acumulada es " + totalEdad);
		System.out.println("La promedio de edad " + totalEdad/edad.length);
		
	}
	
	
}
