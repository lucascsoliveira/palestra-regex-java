/**
 * ==============================================================================
 * Laboratorio de Extensao e Desenvolvimento de Sistemas - Leds
 * ==============================================================================
 * Description: Exemplo de uso de Metacaracteres
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

public class Exemplo2 {

    public static final String REGEX = "\\d";
//    public static final String REGEX = "\\D";
//    public static final String REGEX = "\\s";
//    public static final String REGEX = "\\S";
//    public static final String REGEX = "\\w";
//    public static final String REGEX = "\\W";
//    public static final String REGEX = "\\b";

    public static void main(String[] args) {
        String string;
        Scanner input = new Scanner(System.in);

        do {
            string = input.nextLine();
            System.out.println(string.matches(REGEX));
        } while (!string.matches("exit"));

    }
}
