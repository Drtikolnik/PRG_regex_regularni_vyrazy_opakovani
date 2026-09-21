import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ukol3ReplaceAll {

    static void replace(String title, String regex, String replacement, String input) {
        System.out.println("\n=== " + title + " ===");
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        boolean any = false;
        while (m.find()) {
            any = true;
            System.out.println("MATCH: \"" + m.group() + "\"");
            String result = input.replaceAll ( regex,replacement);
            System.out.println(result);
        }
        if (any) {
            System.out.println("Žádné shody");
        }

    }


    public static void main(String[] args){
        String input = "Hello 2025! 123 CZK 1 ok OK     čas 42 12345 ha hahaha hahahaha _a a_ a1 a_b 2025-12-12";

        //Přepište všechny ceny z formátu 123 CZK na 123 Kč.
        replace("3.1 ", "(\\b\\d+)\\s*CZK\\b", "$1 Kč", input);
        //Najděte všechna slova začínající velkým písmenem a obalte je do hranatých závorek.
        replace("3.2 ", "\\b(\\p{Lu}\\p{L}*)\\b", "[$1]", input);
        //Převeďte všechny vícečetné mezery na jedinou mezeru.
        replace("3.3 ", " {2,}", " ", input);
        //V textu s daty 2025-09-24 nahraďte pomlčky za lomítka (/).
        replace("3.4 ", "(\\p{N}{4})-(\\p{N}{2})-(\\p{N}{2})", "$1/$2/$3", input);










    }













}
