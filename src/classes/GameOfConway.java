package classes;

//Import Scanner.
import java.util.Scanner;

//Game of Conway class.
public class GameOfConway {

	// Variables.
	Scanner scan = new Scanner(System.in);
	int HEIGHT = 100;
	int WIDTH = 100;
	char world[][] = new char[100][100];
	int count;
	String name = "Player101";
	int worldRules[] = { 2, 3, 3 };

	// Main function.
	public static void main(String[] args) {

		GameOfConway GOC = new GameOfConway();
		GOC.principal();

	}

	// Principal function.
	public void principal() {

		// Menu.
		menu();

	}

	// World Inicialize function.
	private void worldInicialize() {

		// Y-AXIS.
		for (count = 0; count < HEIGHT; count++) {

			// X-AXIS.
			for (int metaCount = 0; metaCount < WIDTH; metaCount++) {

				// Set this position the value ' '.
				world[count][metaCount] = ' ';

			}

		}

	}

	// WorldPrinting function.
	private void worldPrint() {

		// Print title.
		System.out.print("\n" + name + " món!\n");

		// Print.
		// Y-AXIS.
		for (count = 0; count < HEIGHT; count++) {

			// X-AXIS.
			for (int metaCount = 0; metaCount < WIDTH; metaCount++) {

				// Print the value at this position and [] before and after the value.
				System.out.print("[" + world[count][metaCount] + "]");

			}

			// Print a new line before the last value of the X-AXIS to Y-AXIS.
			System.out.print("\n");

		}

	}

	// Is a number function.
	private boolean isANumber(String x) {

		// Variables.
		boolean isANumber = false;

		// X is a number?
		for (int metaCount = 0; metaCount < x.length(); metaCount++) {

			// Filter the value of the position metaCount to compare with a number.
			if (x.charAt(metaCount) == '0' || x.charAt(metaCount) == '1' || x.charAt(metaCount) == '2'
					|| x.charAt(metaCount) == '3' || x.charAt(metaCount) == '4' || x.charAt(metaCount) == '5'
					|| x.charAt(metaCount) == '6' || x.charAt(metaCount) == '7' || x.charAt(metaCount) == '8'
					|| x.charAt(metaCount) == '9') {

				// Set isANumber as true.
				isANumber = true;

			} else {

				// Set isANumber as false.
				isANumber = false;

				// close the bucle if one caracter of the String is not a number.
				metaCount = x.length();

			}

		}

		// Return the value of isANumber(True or false).
		return isANumber;

	}

	// World generate function.
	private void worldGenerate() {

		// Inicialitze variables.
		char[][] newWorld = new char[HEIGHT][WIDTH];
		int sum;

		// Generate next generation of the world.
		// Y-AXIS.
		for (count = 0; count < HEIGHT; count++) {

			// X-AXIS.
			for (int metaCount = 0; metaCount < WIDTH; metaCount++) {

				// Sum = 0;
				sum = 0;

				// Filter if the cells is alive...
				/*
				 * Rules of alive cell:
				 * 
				 * 1. If cell is near to worldRules[0] - worldRules[1] they keep alive.
				 * 
				 * 2. If cell is near to 4 or more cells they die.
				 * 
				 * 3. If cell is near to 1 or less cells they die.
				 * 
				 */
				if (world[count][metaCount] == '·') {

					if (HEIGHT > (count + 1)) {
						if (world[count + 1][metaCount] == '·') {

							// Sum 1...
							sum++;

						}
					}

					if (HEIGHT > (count + 1) && WIDTH > (metaCount + 1)) {
						if (world[count + 1][metaCount + 1] == '·') {

							// Sum 1...
							sum++;

						}
					}

					if (WIDTH > (metaCount + 1)) {
						if (world[count][metaCount + 1] == '·') {

							// Sum 1...
							sum++;

						}
					}

					if (0 <= (count - 1) && WIDTH > (metaCount + 1)) {
						if (world[count - 1][metaCount + 1] == '·') {

							// Sum 1...
							sum++;

						}
					}

					if (0 <= (count - 1)) {
						if (world[count - 1][metaCount] == '·') {

							// Sum 1...
							sum++;

						}
					}

					if (0 <= (count - 1) && 0 <= (metaCount - 1)) {
						if (world[count - 1][metaCount - 1] == '·') {

							// Sum 1...
							sum++;

						}
					}

					if (0 <= (metaCount - 1)) {
						if (world[count][metaCount - 1] == '·') {

							// Sum 1...
							sum++;

						}
					}

					if (HEIGHT > (count + 1) && 0 <= (metaCount - 1)) {
						if (world[count + 1][metaCount - 1] == '·') {

							// Sum 1...
							sum++;

						}
					}

					if (sum >= worldRules[0] && sum <= worldRules[1]) {
						newWorld[count][metaCount] = '·';
					} else {
						newWorld[count][metaCount] = ' ';
					}

				}

				// Filter if the cell is dead.
				/**
				 * 
				 * Rules of dead cell:
				 * 
				 * 1. If dead cell is near to 3 live cells then they revive.
				 * 
				 */
				else {

					if (HEIGHT > (count + 1)) {
						if (world[count + 1][metaCount] == '·') {

							// Sum 1...
							sum++;

						}
					}

					if (HEIGHT > (count + 1) && WIDTH > (metaCount + 1)) {
						if (world[count + 1][metaCount + 1] == '·') {

							// Sum 1...
							sum++;

						}
					}

					if (WIDTH > (metaCount + 1)) {
						if (world[count][metaCount + 1] == '·') {

							// Sum 1...
							sum++;

						}
					}

					if (0 <= (count - 1) && WIDTH > (metaCount + 1)) {
						if (world[count - 1][metaCount + 1] == '·') {

							// Sum 1...
							sum++;

						}
					}

					if (0 <= (count - 1)) {
						if (world[count - 1][metaCount] == '·') {

							// Sum 1...
							sum++;

						}
					}

					if (0 <= (count - 1) && 0 <= (metaCount - 1)) {
						if (world[count - 1][metaCount - 1] == '·') {

							// Sum 1...
							sum++;

						}
					}

					if (0 <= (metaCount - 1)) {
						if (world[count][metaCount - 1] == '·') {

							// Sum 1...
							sum++;

						}
					}

					if (HEIGHT > (count + 1) && 0 <= (metaCount - 1)) {
						if (world[count + 1][metaCount - 1] == '·') {

							// Sum 1...
							sum++;

						}
					}

					// Filter if the worldRules[2] to revive cells are fulfilled.
					if (sum == worldRules[2]) {

						// Set this position of the worl to '·'.
						newWorld[count][metaCount] = '·';

					} // Filter if the worldRules[2] to revive cells aren't fulfilled

					else {

						// Set this position of the worl to ' '.
						newWorld[count][metaCount] = ' ';

					}
				}
			}

		}

		// Equals the world to the newWorld.
		world = newWorld;

	}

	// Game Function.
	private void game() {

		// Inicialize variables.
		boolean bucleJoc = true;
		String question;

		// Game.
		while (bucleJoc) {

			// Print world.
			worldPrint();

			// Generate the new world.
			worldGenerate();

			// Ask to continue the game.
			System.out.print("Vols passar a la seguent generació?{S/N}");
			question = scan.next();

			if (question.equals("N") || question.equals("n")) {

				bucleJoc = false;

			}
		}

	}

	// Cell position function.
	public void cellposition(String option) {

		// Inicialize number.
		boolean isANumber;
		String pH, pW;
		int H, W;
		int coloniaNumber = 5;

		for (count = 0; count <= 5; count++) {

			System.out.print("\n/*Forma Manual*/\n");
			worldPrint();

			if (option.equalsIgnoreCase("0")) {

				System.out.print("\nPosa un valor per la altura on vols posar la cèl·lula numero[" + (count + 1)
						+ "] [0] - [" + (HEIGHT - 1) + "]:\n>> ");
				pH = scan.next();

				isANumber = isANumber(pH);

				if (!isANumber) {

					System.out.print("\nSiusplau posa un numero correcte!\n");
					count--;

				} else {

					H = Integer.parseInt(pH);

					if ((H > (HEIGHT - 1) || H < 0)) {

						System.out.print("\nEl valor no forma part del array\n");
						count--;

					} else {

						System.out.print("\nPosa un valor per la llargada on vols posar la cèl·lula numero["
								+ (count + 1) + "] [0] - [" + (WIDTH - 1) + "]:\n>> ");
						pW = scan.next();

						isANumber = isANumber(pW);

						if (!isANumber) {

							System.out.print("\nSiusplau posa un numero correccte!\n");
							count--;

						} else {

							W = Integer.parseInt(pW);

							if ((W > (WIDTH - 1) || W < 0)) {

								System.out.print("\nEl valor no forma part del array\n");
								count--;

							} else {

								if (world[H][W] == '·') {

									System.out.print("\nJa hi ha una cèl·lula colocada en aquesta posició!\n");
									count--;

								} else {

									world[H][W] = '·';

								}

							}

						}

					}

				}

			} else {

				for (count = 0; count < 20; count++) {

					System.out.print("\nCuantes colonies vols posar? (Cada colonia consta de 5 cellules):\n>> ");

					String colonia = scan.next();

					isANumber = isANumber(colonia);

					if (isANumber) {

						System.out.print("\nLa cantidad de colonies s'ha assignat a [" + colonia + "]\n");
						count = 998;
						coloniaNumber = Integer.parseInt(colonia);

					} else {

						System.out.print("\nSiusplau entra un valor valid!!\n");

					}

				}

				if (count != 999) {

					System.out.print("\nEl valor sa assignat a 5");

				}

				for (count = 0; count < (coloniaNumber * 5); count++) {

					H = (int) (Math.random() * HEIGHT);

					W = (int) (Math.random() * WIDTH);

					if ((W > WIDTH || W < 0)) {

						count--;

					} else {

						if (world[H][W] == '·') {

							count--;

						} else {

							world[H][W] = '·';

						}

					}

				}

			}

		}

		worldPrint();

	}

	// Menu function.
	public void menu() {

		// Variables.
		boolean menuLoop = true;
		String option;
		String x;
		boolean isANumber = false;
		String a1, a2, b;
		boolean cellsloop = true;
		boolean worldInicialize = false;
		boolean cellsInicialize = false;

		// Start Menu.
		while (menuLoop) {

			// Question, do.
			System.out.print(
					"\nQue vols fer?\n[0] - - -> {Posar nom}\n[1] - - -> {Posar tamany al món}\n[2] - - -> {Canviar regles}\n[3] - - -> {Col·locar cèl·lules}\n[4] - - -> {Jugar}\n[5] - - > {Sortir}\n>> ");
			option = scan.next();

			// Filter the result.
			switch (option) {

			// Change name.
			case "0":
				System.out.print("\nPosa el teu nom:\n>> ");
				name = scan.next();

				isANumber = isANumber(name);

				if (isANumber) {

					name = "MathLover";

				} else if (name.equals("carles") || name.equals("Cristina")) {

					name = "Professor";

				}

				break;

			// Put the world size.
			case "1":
				if (!cellsInicialize) {

					for (count = 0; count < 20; count++) {

						// Ask for width.
						System.out.print(
								"\nQuina vols que sigui la allargada del món (Maxim 100 i minim 10)(Eix X)?\n>> ");
						x = scan.next();

						isANumber = isANumber(x);

						if (isANumber) {

							WIDTH = Integer.parseInt(x);

							if (WIDTH <= 100 && WIDTH >= 10) {

								System.out.print("\nValor assignat, el món té [" + WIDTH + "] caselles de llargada\n");
								count = 998;

							} else {

								System.out.print("\nSiusplau posa un valor entre 10 i 100\n");

							}

						} else {

							System.out.print("\nSiusplau entra un valor valid!!\n");

						}

					}

					if (count != 999) {

						System.out.print("\nEl valor sa assignat a 10");
						WIDTH = 10;

					}

					for (count = 0; count < 20; count++) {

						// Ask for width.
						System.out.print("\nQuina vols que sigui la altura del món (Maxim 100)(Eix Y)?\n>> ");
						x = scan.next();

						isANumber = isANumber(x);

						if (isANumber) {

							HEIGHT = Integer.parseInt(x);

							if (HEIGHT <= 100 && HEIGHT >= 10) {

								System.out.print("\nValor assignat, el món té [" + HEIGHT + "] caselles de llargada\n");
								count = 998;

							} else {

								System.out.print("\nSiusplau posa un valor entre 10 i 100\n");

							}

						} else {

							System.out.print("\nSiusplau entra un valor valid!!\n");

						}

					}

					if (count != 999) {

						System.out.print("\nEl valor sa assignat a 10");
						HEIGHT = 10;

					}

					worldInicialize();
					worldPrint();
					worldInicialize = true;

				} else {

					System.out.print(
							"\nJa s'han col·locat les cèl·lules, després d'acabar la proxima partida podras tornar a canviar aquests valors\n");

				}

				break;

			// Change the world rules.
			case "2":

				for (count = 0; count < 20; count++) {

					// Ask for a1
					System.out.print(
							"\nLes regles són:\n[23/3] -|-|- {AA/B}\nIntrodueix les noves, primer el valor de la primera A:\n>> ");
					a1 = scan.next();

					isANumber = isANumber(a1);

					if (isANumber) {
						worldRules[0] = Integer.parseInt(a1);
						System.out.print("\nValor assignat, [" + worldRules[0] + "A/B]\n");

						count = 998;

					} else {

						System.out.print("\nSiusplau entra un valor valid!!\n");

					}

				}

				if (count != 999) {

					System.out.print("\nEl valor sa assignat a 2\n");
					worldRules[0] = 2;

				}

				for (count = 0; count < 20; count++) {

					// Ask for a2.
					System.out.print("\nSegon valor de la segona A:\n>> ");
					a2 = scan.next();

					isANumber = isANumber(a2);

					if (isANumber) {
						worldRules[1] = Integer.parseInt(a2);
						System.out.print("\nValor assignat, [" + worldRules[0] + "" + worldRules[1] + "/B]\n>> ");

						count = 998;

					} else {

						System.out.print("\nSiusplau entra un valor valid!!\n");

					}

				}

				if (count != 999) {

					System.out.print("\nEl valor sa assignat a 3\n");
					worldRules[1] = 3;

				}

				// Ask for b.
				System.out.print("\nEl valor de B:\n>> ");
				b = scan.next();

				isANumber = isANumber(b);

				if (isANumber) {

					worldRules[2] = Integer.parseInt(b);

					System.out.print(
							"\nValor assignat, [" + worldRules[0] + "" + worldRules[1] + "/" + worldRules[2] + "]\n");
					count = 998;

				} else {

					System.out.print("\nSiusplau entra un valor valid!!\n");

				}

				if (count != 999) {

					System.out.print("\nEl valor sa assignat a 3\n");
					worldRules[2] = 3;

				}

				break;

			// Put the cells in to the world.
			case "3":

				cellsloop = true;

				// Start cells Loop.
				while (cellsloop && worldInicialize) {

					System.out.print(
							"\nVols posar les cèl·lules de forma:\n[0] - - -> {Manual}\n[1] - - -> {Automatica}\n>> ");
					option = scan.next();

					switch (option) {

					case "0":

						worldInicialize();
						cellposition(option);
						cellsloop = false;
						cellsInicialize = true;
						break;

					case "1":

						worldInicialize();
						cellposition(option);
						cellsloop = false;
						cellsInicialize = true;
						break;

					default:
						System.out.print("\nCaracter no valid!\n");
						break;

					}

				}

				if (!worldInicialize) {

					System.out.print("\nPrimer inicialitza el món siusplau\n");

				}

				break;

			// Start the game,
			case "4":
				if (worldInicialize) {

					game();

					worldInicialize();
					cellsloop = true;
					worldInicialize = false;
					cellsInicialize = false;

				}
				break;

			// Close the menu.
			case "5":
				System.out.print("\nBye!\n");
				menuLoop = false;

				break;

			// Another caracter.
			default:
				System.out.print("\nCaracter no valid\n\n");

			}

		}

	}

}