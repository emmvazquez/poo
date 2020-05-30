
public class Matrices {

	public Matrices() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		String matriz1[][] =  new String[2][3];
		
		matriz1[0][0] = "Emmanuel";
		matriz1[0][1] = "Vázquez";
		matriz1[0][2] ="Benito";
		
		matriz1[1][0]= "Abdiel";
		matriz1[1][1] ="Vázquez";
		matriz1[1][2] = "Peralta";
		
		/*
		 * try { matriz1[0][0] ="Pedro"; System.out.println(matriz1[0][0]); }
		 * catch(Exception e){ System.out.
		 * println("estás intentando acceder a una posición fuera de la matriz"); }
		 */
		
		
		
		/*
		 * for(int x=0; x < 2; x++) { for(int y = 0; y < 3; y++) {
		 * System.out.print(matriz1[x][y]); System.out.print(" "); }
		 * System.out.println(); }
		 */
		
		int matrizP[][] = new int[4][4];
		matrizP[0][0] = -1;
		matrizP[0][1] = 15;
		matrizP[0][2] = 14;
		matrizP[0][3] = 13;
		matrizP[1][0] = 12;
		matrizP[1][1] = 11;
		matrizP[1][2] = 10;
		matrizP[1][3] = 9;
		matrizP[2][0] = 8;
		matrizP[2][1] = 7;
		matrizP[2][2] = 6;
		matrizP[2][3] = 5;
		matrizP[3][0] = 4;
		matrizP[3][1] = 3;
		matrizP[3][2] = 2;
		matrizP[3][3] = 1;
		

		
		for(int x=0; x < 4; x++) { 
			for(int y = 0; y < 4; y++) {
				 System.out.print(matrizP[x][y] + " "); 
			}
			 System.out.println(); 
		}
	}

}
