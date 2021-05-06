package almacen;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Productos {

	public void listaProductos() {

		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion; //
		double price;
		int Total;
		double domicilio = 5000;
		int pos = 0;

		String name = "";

		ArrayList<String> Carrito = new ArrayList<String>();
		ArrayList<Double> Precios = new ArrayList<Double>();

		while (!salir) {

			System.out.println("ID:1, Celular Precio " + (price = 50000));
			System.out.println("ID:2, Pc Precio " + (price = 60000));
			System.out.println("ID:3 Video Game Precio " + (price = 900000));
			System.out.println("ID:4 Dejar de comprar");
			System.out.println("ID:5 Eliminar Producto");

			try {

				System.out.println("Escribe uno de los ID para anexar a su carrito el producto");
				opcion = sn.nextInt();

				switch (opcion) {
				case 1:
					System.out.println("Has metido al carrito el celular");

					if (opcion == 1) {

						name = "celular";
						price = 50000;
						Carrito.add(name);
						Precios.add(price);
						System.out.println("Productos " + Carrito + " El total es: " + Precios);
						System.out.println("");

						if (price > 70000) {
							price = price * 0.19 + (price);
							System.out.println("El total con iva es: " + price);
							System.out.println("");
						} else {

							System.out.println("El total con iva es: " + price);
							System.out.println("");
						}

						System.out.println("Quieres editar tu compra? 1 para SI, 2 para NO");
						int editar = sn.nextInt();
						if (editar == 1) {
							Carrito.remove("celular");
							Precios.remove(price);
							System.out.println("eliminaste tu producto");
							System.out.println("Productos " + Carrito + " El total es: " + Precios);
						}
					}

					break;
				case 2:
					System.out.println("Has metido al carrito el Pc");
					if (opcion == 2) {

						name = "Pc";
						Carrito.add(name);
						price = 60000;
						Precios.add(price);
						System.out.println("Productos " + Carrito + " El total es: " + Precios);
						System.out.println("");
						if (price > 70000) {
							price = price * 0.19 + (price);
							System.out.println("El total con iva es: " + price);
							System.out.println("");
						} else {

							System.out.println("El total con iva es: " + price);
							System.out.println("");
						}
						System.out.println("Quieres editar tu compra? 1 para SI, 2 para NO");
						int editar = sn.nextInt();
						if (editar == 1) {
							Carrito.remove("Pc");
							Precios.remove(price);
							System.out.println("eliminaste tu producto");
							System.out.println("Productos " + Carrito + " El total es: " + Precios);
						}
					}
					break;
				case 3:
					System.out.println("Has metido al carrito el video game");
					if (opcion == 3) {

						name = "video game";
						price = 90000;
						Carrito.add(name);
						Precios.add(price);
						System.out.println("Productos " + Carrito + " El total es: " + Precios);
						System.out.println("");

						if (price > 70000) {
							price = price * 0.19 + (price);
							System.out.println("El total con iva es: " + price);
							System.out.println("");

						} else {

							System.out.println("El total con iva es: " + price);
							System.out.println("");
						}
						System.out.println("Quieres editar tu compra? 1 para SI, 2 para NO");
						int editar = sn.nextInt();
						if (editar == 1) {
							Carrito.remove("video game");
							Precios.remove(price);
							System.out.println("eliminaste tu producto");
							System.out.println("Productos " + Carrito + " El total es: " + Precios);
						}

					}
					break;
				case 4:

					salir = true;
					break;
				case 5:

					Carrito.remove("celular");

					System.out.println("Productos Eliminados " + Carrito);

					break;
				default:
					System.out.println("Por el momento solo hay en existencia 3 productos");
				}
			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un ID");
				sn.next();
			}
		}

	}

}
