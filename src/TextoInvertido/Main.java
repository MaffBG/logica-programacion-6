package TextoInvertido;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		 System.out.println("¡Juguemos a leer al revés!");
        System.out.println("Introduce la palabra o frase de tu agrado:");
        String texto = scanner.nextLine();

        //  Se emplea un bucle para inviertir el texto
        String textoInvertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }

        System.out.println("¡Chaca chacán! Tu texto invertido es... " + textoInvertido);

        scanner.close();
    }
}
