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

public class Exemplo5 {

    public static final String STRING_MATCH = "May the force be with you!";

    public static void main(String[] args) {
        /*
         Pattern p = Pattern.compile("a*b");
         Matcher m = p.matcher("aaaaab");
         boolean b = m.matches();
         */

        //Cria o objeto pattern com a REGEX desejada;
        Pattern pattern = Pattern.compile("\\w+");

        //Cria o matcher com a String a ser verificada;
        Matcher matcher = pattern.matcher(STRING_MATCH);

        //O método find() checa a próxima ocorrência da REGEX na string;
        while (matcher.find()) {
            //O método start() retorna o índice inicial do grupo atual;
            System.out.print("Start index: " + matcher.start());
            //O método end() retorna o índice inicial do grupo atual;
            System.out.print("End index: " + matcher.end() + " ");
            //Retorna o agrupamento atual;
            System.out.println(matcher.group());
        }

        Pattern replace = Pattern.compile("\\s+");
        Matcher matcher2 = replace.matcher(STRING_MATCH);
        //Substitui todas as ocorrencias da regex por "\t"
        System.out.println(matcher2.replaceAll("\t"));
    }
}
