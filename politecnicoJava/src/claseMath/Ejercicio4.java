package claseMath;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero1 = (Math.random() * 50);
		double numero2 = (Math.random() * 50);

		int numeroUnoRedondeado = (int) Math.ceil(numero1); // Redondea un numero decimal hacia arriba
		int numeroDosRedondeado = (int) Math.round(numero2); // Redondea un numero al entero mas cercano

		System.out.println("Numero 1: " + numeroUnoRedondeado);
		System.out.println("Numero 2: " + numeroDosRedondeado);

		System.out.println("El numero mayor es: " + Math.max(numeroUnoRedondeado, numeroDosRedondeado)); // ENcontrar el numero mas grande entre dos valores
	}

}
