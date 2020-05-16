public class ArregloFiguras {
private Figura[] miArreglo = new Figura[5];


	public ArregloFiguras() {
		// TODO Auto-generated constructor stub
	}

	public Figura[] regresaArreglo() {
		
		this.miArreglo[0] = new Figura(20,20,50,50);
		this.miArreglo[1] = new Figura(200,200,50,50);
		this.miArreglo[2] = new Figura(70,70,200,200);
		this.miArreglo[3] = new Figura(200,300,50,50);
		this.miArreglo[4] = new Figura(300,2000,50,50);	
		
		return this.miArreglo;
	}
}
