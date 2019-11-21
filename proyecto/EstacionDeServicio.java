package proyecto;

import java.util.Scanner;

public class EstacionDeServicio {


	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

			}
		}
		int totalPorNafta[] = { 0, 0, 0 };
		int totalPorEstacion[] = { 0, 0, 0 };
		String nombres[] = { "Estación A", "Estación B", "Estación C" };
		String naftas[] = { "Gasoil", "Super", "Premium" };
		System.out.println("Ingrese cantidad de litros");
		Scanner scan = new Scanner(System.in);
		int litros = scan.nextInt();
		while (litros != 0) {
			System.out.println("Ingrese tipo de Nafta 0 = Gasoil, 1 = Super, 2 = Premium ");
			int nafta = scan.nextInt();
			int costototal = 0;
			switch (nafta) {
			case 0:
				costototal = litros * 10;
				break;
			case 1:
				costototal = litros * 20;
				break;
			case 2:
				costototal = litros * 40;
				break;
			}
			System.out.println("Ingrese estación de servicio 0 = Estación A, 1 = Estación B, 2 = Estación C");
			int estacion = scan.nextInt();
			matriz[nafta][estacion] += costototal;
			totalPorNafta[nafta] += costototal;
			totalPorEstacion[estacion] += costototal;
			System.out.println("Ingrese cantidad de litro");
			litros = scan.nextInt();

		}
		System.out.println("Total ganado por estación");
		for (int i = 0; i < totalPorEstacion.length; i++) {
			System.out.println("Estación " + nombres[i] + ": " + totalPorEstacion[i]);
		}
		System.out.println("Total ganado por nafta");
		for (int i = 0; i < totalPorNafta.length; i++) {
			System.out.println("Nafta " + naftas[i] + ": " + totalPorNafta[i]);
		}
		System.out.println("Tipo de nafta mas vendido");
		int masVendido = 0;
		int indiceMasVendido = 0;

		for (int i = 0; i < totalPorNafta.length; i++) {
			if (totalPorNafta[i] > masVendido) {
				masVendido = totalPorNafta[i];
				indiceMasVendido = i;

			}
		}
		System.out.println(naftas[indiceMasVendido] + ":" + masVendido);
	}

}
