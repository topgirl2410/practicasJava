package Operaciones;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ladoCuadrado = 8;

		int areaCuadrado = (int) Math.pow(ladoCuadrado, 2);
		int perimetroCuadrado = 4 * ladoCuadrado;

		System.out.println("Area cuadrado: " + areaCuadrado);
		System.out.println("Perimetro cuadrado: " + perimetroCuadrado);

		int baseTriangulo = 9;
		int alturaTriangulo = 8;
		int ladoUnoTriangulo = 8;
		int ladoDosTriangulo = 8;

		int areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
		int perimetroTriangulo = (ladoUnoTriangulo * 2) + baseTriangulo;
		System.out.println("Area triangulo: " + areaTriangulo);
		System.out.println("Perimetro triangulo: " + perimetroTriangulo);

		int baseRectangulo = 8;
		int alturaRectangulo = 6;

		int areaRectangulo = baseRectangulo * alturaRectangulo;
		int perimetroRectangulo = (2 * baseRectangulo) + (2 * alturaRectangulo);
		System.out.println("Area rectangulo: " + areaRectangulo);
		System.out.println("Perimetro rectangulo: " + perimetroRectangulo);
		
	}

}
