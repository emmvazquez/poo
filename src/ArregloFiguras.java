import java.awt.Color;

public class ArregloFiguras {
private Figura[] miArreglo = new Figura[5];


	public ArregloFiguras() {
		// TODO Auto-generated constructor stub
	}

	public Figura[] regresaArreglo() {
		this.miArreglo[4] = new Figura(300,200,150,250, Color.MAGENTA);
		this.miArreglo[2] = new Figura(70,70,200,200, Color.PINK);
		this.miArreglo[3] = new Figura(200,300,50,50, Color.YELLOW);
		this.miArreglo[0] = new Figura(20,20,50,50, Color.BLUE);
		this.miArreglo[1] = new Figura(200,200,450,250, Color.RED);
		
		return this.miArreglo;
	}
}
