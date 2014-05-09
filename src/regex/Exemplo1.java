/**
 * ==============================================================================
 * Laboratorio de Extensao e Desenvolvimento de Sistemas - Leds
 * ==============================================================================
 * Description: Exemplo de uso de Common Matching Symbols
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
 *
 * @author Lucas
 */
public class Exemplo1 {

//    public static final String REGEX = ".";
    public static final String REGEX = "a|b";
//    public static final String REGEX = "ab";
//    public static final String REGEX = "[abc]";
//    public static final String REGEX = "[^abc]";
//    public static final String REGEX = "[a-z]";

    public static void main(String[] args) {
        String string;
        Scanner input = new Scanner(System.in);

        do {
            string = input.nextLine();
            System.out.println(string.matches(REGEX));
        } while (!string.matches("exit"));

    }

}
