import java.awt.Color;

public class Matriz {

	private int m[][] = new int[4][4];
	
		
	public Matriz() {
		// TODO Auto-generated constructor stub	
		m[0][0] = -1;
		m[0][1] = 15;
		m[0][2] = 14;
		m[0][3] = 13;
		m[1][0] = 12;
		m[1][1] = 11;
		m[1][2] = 10;
		m[1][3] = 9;
		m[2][0] = 8;
		m[2][1] = 7;
		m[2][2] = 6;
		m[2][3] = 5;
		m[3][0] = 4;
		m[3][1] = 3;
		m[3][2] = 2;
		m[3][3] = 1;
	}

	
	public Color regresaColor(int valor) {
		if(valor%2==0) {
			return Color.BLACK;
		}
		else {
			return Color.WHITE;
		}
	}
	
	
	
	
	public int[][] getM() {
		return m;
	}

	public void setM(int[][] m) {
		this.m = m;
	}

	
}
