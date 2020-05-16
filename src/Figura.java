import java.awt.Color;

public class Figura {
private int PosX;
private int PosY;
private int Largo;
private int Ancho;
private Color Color;


	public Figura() {
		// TODO Auto-generated constructor stub
	}
	
	public Figura(int x, int y, int l, int a, Color c) {
		PosX = x;
		PosY = y;
		Largo = l;
		Ancho = a;
		Color = c;
	}

	public int getPosX() {
		return PosX;
	}

	public void setPosX(int posX) {
		PosX = posX;
	}

	public int getPosY() {
		return PosY;
	}

	public void setPosY(int posY) {
		PosY = posY;
	}

	public int getLargo() {
		return Largo;
	}

	public void setLargo(int largo) {
		Largo = largo;
	}

	public int getAncho() {
		return Ancho;
	}

	public void setAncho(int ancho) {
		Ancho = ancho;
	}

	public Color getColor() {
		return Color;
	}

	public void setColor(Color color) {
		Color = color;
	}
	
}
