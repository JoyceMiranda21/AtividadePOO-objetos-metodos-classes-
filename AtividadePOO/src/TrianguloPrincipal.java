import java.util.Scanner;

public class TrianguloPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangulo x = new Triangulo();
		
		System.out.println("Digite os lados do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		Triangulo y = new Triangulo();
		System.out.println("Digite os lados do triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.calcularArea();
		double areaY = y.calcularArea();
		
		System.out.println("Area do triangulo X: " + areaX);
		System.out.println("Area do triangulo Y: " + areaY);
		
		if (areaX > areaY) {
			System.out.println("O triangulo X tem a maior área.");
		} else if( areaY > areaX) {
			System.out.println("O triangulo Y tem a maior área.");
		}else {
			System.out.println("Os triangulos tem área iguais.");
		}
	sc.close();	
	}
}
