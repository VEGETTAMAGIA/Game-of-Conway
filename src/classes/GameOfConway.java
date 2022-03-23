package classes;

//Import Scanner.
import java.util.Scanner;

//Game of Conway class.
public class GameOfConway {

	// Variables.
	Scanner scan = new Scanner(System.in);
	int HEIGHT = 10;
	int WIDTH = 10;
	char world[][] = new char[HEIGHT][WIDTH];
	int count;
	int worldRules[] = { 2, 3, 3 };

	// Main function.
	public static void main(String[] args) {

		GameOfConway GOC = new GameOfConway();
		GOC.principal();

	}

	// Principal function.
	public void principal() {

		// Variables.
		boolean gameLoop = false;
		String name;

		// Menu.
		menu();

		// Print World.
		worldPrint();

	}

	// WorldPrinting function.
	private void worldPrint() {

		// Print title.
		System.out.print("\nWorld!\n");

		// Print.
		for (int count = 0; count < HEIGHT; count++) {

			for (int metaCount = 0; metaCount < WIDTH; metaCount++) {

				System.out.print("[" + world[count][metaCount] + "]");

			}

			System.out.print("\n");

		}

	}

	// Is a number function.
	private boolean isANumber(String x) {

		// Variables.
		boolean isANumber = false;

		// X is a number?
		for (int metaCount = 0; metaCount < x.length(); metaCount++) {

			if (x.charAt(metaCount) == '0' || x.charAt(metaCount) == '1' || x.charAt(metaCount) == '2'
					|| x.charAt(metaCount) == '3' || x.charAt(metaCount) == '4' || x.charAt(metaCount) == '5'
					|| x.charAt(metaCount) == '6' || x.charAt(metaCount) == '7' || x.charAt(metaCount) == '8'
					|| x.charAt(metaCount) == '9') {

				isANumber = true;

			} else {

				isANumber = false;

				metaCount = x.length();

			}

		}

		return isANumber;

	}

	// World generate function.
	private void worldGenerate() {

		// Inicialitze variables.
		int newWorld[][] = new int[HEIGHT][WIDTH];
		int sum;

		// Generate.
		for (count = 0; count < HEIGHT; count++) {

			for (int metaCount = 0; metaCount < WIDTH; metaCount++) {

				// Sum = 0;
				sum = 0;

				// Filter if the cell is alive or dead.
				if (world[count][metaCount] == '·') {

					// Filter the rules of alive cell.
					/*
					 * Near 3 live cells then respawn the cell.
					 */
					// Filter the first line.
					if (count == 0) {

						// Filter the first column.
						if (metaCount == 0) {

							// Serch the cells near.
							if (world[(count + 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count + 1)][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}

							// Compare the near cells.
							if (!(sum == worldRules[0] || sum == worldRules[1])) {

								newWorld[count][metaCount] = ' ';

							}

						} else if (metaCount == WIDTH) {

							// Serch the cells near.
							if (world[(count + 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count + 1)][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}

							// Compare the near cells.
							if (!(sum == worldRules[0] || sum == worldRules[1])) {

								newWorld[count][metaCount] = ' ';

							}

						} else {

							// Serch the cells near.
							if (world[(count + 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count + 1)][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count + 1)][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}

							// Compare the near cells.
							if (!(sum == worldRules[0] || sum == worldRules[1])) {

								newWorld[count][metaCount] = ' ';

							}

						}

					} else if (count > 0 && count < HEIGHT) {

						if (metaCount == 0) {

							// Serch the cells near.
							if (world[(count - 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[(count + 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count - 1)][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count + 1)][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}

							// Compare the near cells.
							if (!(sum == worldRules[0] || sum == worldRules[1])) {

								newWorld[count][metaCount] = ' ';

							}

						} else if (metaCount == WIDTH) {

							// Serch the cells near.
							if (world[(count - 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[(count + 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count - 1)][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count + 1)][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}

							// Compare the near cells.
							if (!(sum == worldRules[0] || sum == worldRules[1])) {

								newWorld[count][metaCount] = ' ';

							}

						} else {

							// Serch the cells near.
							if (world[(count - 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[(count + 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count - 1)][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count - 1)][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count + 1)][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count + 1)][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}

							// Compare the near cells.
							if (!(sum == worldRules[0] || sum == worldRules[1])) {

								newWorld[count][metaCount] = ' ';

							}

						}

					} else if (count == HEIGHT) {

						if (metaCount == 0) {

							// Serch the cells near.
							if (world[(count - 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count - 1)][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}

							// Compare the near cells.
							if (!(sum == worldRules[0] || sum == worldRules[1])) {

								newWorld[count][metaCount] = ' ';

							}

						} else if (metaCount == WIDTH) {

							// Serch the cells near.
							if (world[(count - 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count - 1)][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}

							// Compare the near cells.
							if (!(sum == worldRules[0] || sum == worldRules[1])) {

								newWorld[count][metaCount] = ' ';

							}

						} else {

							// Serch the cells near.
							if (world[(count - 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count - 1)][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count - 1)][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}

							// Compare the near cells.
							if (!(sum == worldRules[0] || sum == worldRules[1])) {

								newWorld[count][metaCount] = ' ';

							}

						}

					}

				} else {

					// Filter the rules of dead cell.
					/*
					 * Near 3 live cells then respawn the cell.
					 */
					// Filter the first line.
					if (count == 0) {

						// Filter the first column.
						if (metaCount == 0) {

							// Serch the cells near.
							if (world[(count + 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count + 1)][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}

							// Compare the near cells.
							if (sum == worldRules[2]) {

								newWorld[count][metaCount] = '·';

							}

						} else if (metaCount == WIDTH) {

							// Serch the cells near.
							if (world[(count + 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count + 1)][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}

							// Compare the near cells.
							if (sum == worldRules[2]) {

								newWorld[count][metaCount] = '·';

							}

						} else {

							// Serch the cells near.
							if (world[(count + 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count + 1)][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count + 1)][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}

							// Compare the near cells.
							if (sum == worldRules[2]) {

								newWorld[count][metaCount] = '·';

							}

						}

					} else if (count > 0 && count < HEIGHT) {

						if (metaCount == 0) {

							// Serch the cells near.
							if (world[(count - 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[(count + 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count - 1)][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count + 1)][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}

							// Compare the near cells.
							if (sum == worldRules[2]) {

								newWorld[count][metaCount] = '·';

							}

						} else if (metaCount == WIDTH) {

							// Serch the cells near.
							if (world[(count - 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[(count + 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count - 1)][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count + 1)][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}

							// Compare the near cells.
							if (sum == worldRules[2]) {

								newWorld[count][metaCount] = '·';

							}

						} else {

							// Serch the cells near.
							if (world[(count - 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[(count + 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count - 1)][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count - 1)][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count + 1)][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count + 1)][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}

							// Compare the near cells.
							if (sum == worldRules[2]) {

								newWorld[count][metaCount] = '·';

							}

						}

					} else if (count == HEIGHT) {

						if (metaCount == 0) {

							// Serch the cells near.
							if (world[(count - 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count - 1)][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}

							// Compare the near cells.
							if (sum == worldRules[2]) {

								newWorld[count][metaCount] = '·';

							}

						} else if (metaCount == WIDTH) {

							// Serch the cells near.
							if (world[(count - 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count - 1)][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}

							// Compare the near cells.
							if (sum == worldRules[2]) {

								newWorld[count][metaCount] = '·';

							}

						} else {

							// Serch the cells near.
							if (world[(count - 1)][metaCount] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[count][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count - 1)][(metaCount - 1)] == '·') {

								// Then...
								sum++;

							}
							if (world[(count - 1)][(metaCount + 1)] == '·') {

								// Then...
								sum++;

							}

							// Compare the near cells.
							if (sum == worldRules[2]) {

								newWorld[count][metaCount] = '·';

							}

						}

					}

				}

			}

		}

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

		boolean isANumber;
		String pH, pW;
		int H, W;

		for (count = 0; count <= 5; count++) {

			System.out.print("\n/*Forma Manual*/\n");
			worldPrint();

			if (option == "0") {

				System.out.print(
						"\nPosa un valor per la altura on vols posar la cèl·lula numero[" + (count + 1) + "]:\n>> ");
				pH = scan.next();

				isANumber = isANumber(pH);

				if (!isANumber) {

					System.out.print("\nSiusplau posa un numero correcte!\n");
					count--;

				} else {

					H = Integer.parseInt(pH);

					if ((H > HEIGHT || H < 0)) {

						System.out.print("\nEl valor no forma part del array\n");
						count--;

					} else {

						System.out.print("\nPosa un valor per la llargada on vols posar la cèl·lula numero["
								+ (count + 1) + "]:\n>> ");
						pW = scan.next();

						isANumber = isANumber(pW);

						if (!isANumber) {

							System.out.print("\nSiusplau posa un numero correccte!\n");
							count--;

						} else {

							W = Integer.parseInt(pW);

							if ((W > WIDTH || W < 0)) {

								System.out.print("\nEl valor no forma part del array\n");
								count--;

							} else {

								if (world[H][W] == '·') {

									System.out.print("\nJa hi ha una cèl·lula colocada en aquesta posició!\n");
									count--;

								} else {

									world[(H - 1)][(W - 1)] = '·';

								}

							}

						}

					}

				}

			} else {

				H = (int) (Math.random() * HEIGHT);

				W = (int) (Math.random() * HEIGHT);

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

	// Menu function.
	public void menu() {

		// Variables.
		boolean menuLoop = true;
		String option;
		String name = "Player101";
		String x;
		boolean isANumber = false;
		String a1, a2, b;
		boolean cellsloop = true;

		// Start Menu.
		while (menuLoop) {

			// Question, do.
			System.out.print(
					"Que vols fer?\n[0] - - -> {Posar nom}\n[1] - - -> {Posar tamany al món}\n[2] - - -> {Canviar regles}\n[3] - - -> {Col·locar cèl·lules}\n[4] - - -> {Jugar}\n[5] - - > {Sortir}\n>> ");
			option = scan.next();

			// Filter the result.
			switch (option) {

			// Change name.
			case "0":
				System.out.print("\nPosa el teu nom:\n>> ");
				name = scan.next();

				break;

			// Put the world size.
			case "1":
				for (count = 0; count < 20; count++) {

					// Ask for width.
					System.out.print("\nQuina vols que sigui la allargada del món?(Eix X)?\n>> ");
					x = scan.next();

					isANumber = isANumber(x);

					if (isANumber) {

						WIDTH = Integer.parseInt(x);

						System.out.print("\nValor assignat, el món té [" + WIDTH + "] caselles de llargada\n");
						count = 998;

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
					System.out.print("\nQuina vols que sigui la altura del món?(Eix Y)?\n>> ");
					x = scan.next();

					isANumber = isANumber(x);

					if (isANumber) {

						HEIGHT = Integer.parseInt(x);

						System.out.print("\nValor assignat, el món té [" + HEIGHT + "] caselles de llargada\n");
						count = 998;

					} else {

						System.out.print("\nSiusplau entra un valor valid!!\n");

					}

				}

				if (count != 999) {

					System.out.print("\nEl valor sa assignat a 10");
					HEIGHT = 10;

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

				// Start cells Loop.
				while (cellsloop) {

					System.out.print(
							"\nVols posar les cèl·lules de forma:\n[0] - - -> {Manual}\n[1] - - -> {Automatica}\n>> ");
					option = scan.next();

					switch (option) {

					case "0":

						cellposition(option);
						cellsloop = false;
						break;

					case "1":
						cellposition(option);
						cellsloop = false;
						break;

					}

				}

				break;

			// Start the game,
			case "4":
				game();
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