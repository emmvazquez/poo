import java.awt.Color;

public class Caracol {
	private int matrizP[][] = new int[4][4];
	
	public Caracol() {
		// TODO Auto-generated constructor stub
		matrizP[2][1] = -1;
		matrizP[2][2] = 15;
		matrizP[1][2] = 14;
		matrizP[1][1] = 13;
		matrizP[1][0] = 12;
		matrizP[2][0] = 11;
		matrizP[3][0] = 10;
		matrizP[3][1] = 9;
		matrizP[3][2] = 8;
		matrizP[3][3] = 7;
		matrizP[2][3] = 6;
		matrizP[1][3] = 5;
		matrizP[0][3] = 4;
		matrizP[0][2] = 3;
		matrizP[0][1] = 2;
		matrizP[0][0] = 1;
	}

	public Color regresaColor(int valor) {
		if(valor == -1) {
			return Color.GRAY;
		}
		if(valor%2==0) {
			return Color.BLACK;
		}
		else {
			return Color.WHITE;
		}
	}
	
	
	public int[][] getMatrizP() {
		return matrizP;
	}

	public void setMatrizP(int[][] matrizP) {
		this.matrizP = matrizP;
	}

}
