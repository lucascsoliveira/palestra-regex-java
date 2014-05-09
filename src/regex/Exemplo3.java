/**
 * ==============================================================================
 * Laboratorio de Extensao e Desenvolvimento de Sistemas - Leds
 * ==============================================================================
 * Description: Exemplo de uso de Quantificadores
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

/**
 * Quantificadores
 *
 * @author Lucas
 */
public class Exemplo3 {

    public static final String REGEX = "\\d{5}";
//    public static final String REGEX = "\\d{1,5}";
//    public static final String REGEX = "\\d{1,}";
//    public static final String REGEX = "\\d*";
//    public static final String REGEX = "\\d+";
//    public static final String REGEX = "\\d?";
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
