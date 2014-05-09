/**
 * ==============================================================================
 * Laboratorio de Extensao e Desenvolvimento de Sistemas - Leds
 * ==============================================================================
 * Description: Exemplo de uso de Agrupamentos e BackReference
 *
 * @author Lucas Coutinho de S. Oliveira <lucascs.oliveira@gmail.com>
 * @version 1.0
 * ==============================================================================
 * Created on May 09th, 2014
 * ==============================================================================
 *
 */
package regex;

import java.util.Scanner;

public class Exemplo4 {

    public static final String REGEX = "(\\d{2})[/-](\\d{2})[/-](\\d{4})";

    public static void main(String[] args) {
        String string;
        Scanner input = new Scanner(System.in);

        do {
            string = input.nextLine();
            if (string.matches(REGEX)) {
                System.out.println(string.replaceAll(REGEX, "$3-$2-$1"));
            } else {
                System.out.println("false");
            }
        } while (!string.matches("exit"));

    }
}
