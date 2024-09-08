
public class Triangulo {
	double a, b, c;
	
	public double calcularPerimetro(){
		return(a + b + c) / 2;
	}
	
	public double calcularArea() {
		double s = calcularPerimetro();
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
}
