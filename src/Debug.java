
public class Debug {

	public Debug() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 27;
		int variable = 0;
		
		variable = 5;
		
		variable = 13;
		
		variable = variable + x;
		
		//System.out.print(variable);
		
		int arreglo[] = new int[5];
		
		int posicion = 0;
		
		for(int i=17; i < 33; i = i +2) {	
			if(posicion < 5) {
				arreglo[posicion] = i;
				posicion ++;
			}
		}
		
	}

}
