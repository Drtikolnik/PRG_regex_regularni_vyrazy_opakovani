import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ukol2 {

    static void findAll(String title, String regex, String input) {
        System.out.println("\n=== " + title + " ===");
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        boolean any = false;
        while (m.find()) {
            any = true;
            System.out.println("MATCH: \"" + m.group() + "\"");
        }
        if (any) {
            System.out.println("Žádné shody");
        }

    }


    public static void main(String[] args){
        String input = "Hello 2025! 123 1 ok OK čas 42 12345 ha hahaha hahahaha _a a_ a1 a_b";

        //Najděte slovo tvořené pouze písmeny (alespoň 2 znaky).
        findAll("2.1 Pouze písmena, 2+", "\\b\\p{L}{2,}\\b",  input);
        //Najděte číslo s 3 až 5 číslicemi.
        findAll("2.2 číslo 3-5 číslic", "\\b\\d{3,5}\\b", input);
        //Najděte výskyty ha opakované 2 až 4× po sobě (např. hahaha)
        findAll("2.3 (ha){2,4}", "\\b(ha){2,4}\\b", input);
        //Najděte libovolný „token“ typu slovo: písmena/číslice/podtržítko (alespoň 1 znak).
        findAll("2.4 \\w+(slovní token)", "[\\p{L}\\p{N}_]+", input);










    }
















}
