/**
 * ==============================================================================
 * Laboratorio de Extensao e Desenvolvimento de Sistemas - Leds
 * ==============================================================================
 * Description: Exemplo de uso das classes Pattern e Matcher
 *
 * @author Lucas Coutinho de S. Oliveira <lucascs.oliveira@gmail.com>
 * @version 1.0
 * ==============================================================================
 * Created on May 09th, 2014
 * ==============================================================================
 */
package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exemplo6 {

    public static final String STRING_MATCH = "09-05-2014";
    public static final String REGEX = "(?<dia>\\d{2}).?(?<mes>\\d{2}).?(?<ano>\\d{4})";

    public static void main(String[] args) {
        //Cria o objeto pattern com a REGEX desejada;
        Pattern pattern = Pattern.compile(REGEX);

        //Cria o matcher com a String a ser verificada;
        Matcher matcher = pattern.matcher(STRING_MATCH);

        //Substitui todas as ocorrencias da regex por "\t"
        System.out.println(matcher.replaceAll("${ano}-${mes}-${dia}"));
    }
}
