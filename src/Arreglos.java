
public class Arreglos {
private int Numero;


	public Arreglos() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String a[]) {
		int x, x1, x2;
		x = 8734;
		x1 = 23;
		x2 = 345;
		//System.out.println(x);
		
		int arreglo[] = new int[3]; //tamaño es de 3
		arreglo[0] = 8734; //posición 0
		arreglo[1] = 23;
		arreglo[2] = 345;
		//System.out.println(arreglo[1]);
		
		
		int arreglo2[] = {8734, 23, 345,67, 547, 524, 9863, 87653,32};
		
		//System.out.println(arreglo2[2]);
		arreglo2[2] = 27;   //asignamos un valor a una posición en específico 
		//System.out.println(arreglo2[0] + ' ' +  arreglo2[1]  + ' ' + arreglo2[2] + ' ' +  arreglo2[3]);
		
		System.out.println(arreglo2.length);
		
		for(int i = 0; i < arreglo2.length; i ++) {
			System.out.print(arreglo2[i] + ",");
		}	
		
		
		
		
		
	}
	
	
}
