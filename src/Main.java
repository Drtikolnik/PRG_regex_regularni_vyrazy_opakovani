import java.util.regex.*;

public class Main {
    public static void main(String[] args) {

        String text = "Hello 2025! 123 1 ok OK čas 42 12345 ha hahaha hahahaha _a a_ a1 a_b";
        Pattern p = Pattern.compile("[0-9]+"); // slice
        Matcher m = p.matcher(text);
        if (m.find()) {
            System.out.println(" Nalezeno : " + m.group()); // -> 2025
        }
        while (m.find()) {
            System.out.println(" Nalezeno : " + m.group()); // -> 2025 , 123
        }


        Pattern p2 = Pattern.compile("Hello"); //Najděte přesně řetězec Hello.
        Matcher m2 = p2.matcher(text);
        if (m2.find()) {
            System.out.println(" Nalezeno2 : " + m2.group());
        }

        Pattern p3 = Pattern.compile("[A-Z]+"); //Najděte velká písmena (A–Z).
        Matcher m3 = p3.matcher(text);
        if (m3.find()) {
            System.out.println(" Nalezeno3 : " + m3.group());
        }

        Pattern p4 = Pattern.compile("[a-z|A-Z]+"); //Najděte všechna písmena (malé nebo velké).
        Matcher m4 = p4.matcher(text);
        if (m4.find()) {
            System.out.println(" Nalezeno4 : " + m4.group());
        }

        Pattern p5 = Pattern.compile("/d"); //Najděte jednociferné číslo.
        Matcher m5 = p5.matcher(text);
        if (m5.find()) {
            System.out.println(" Nalezeno5 : " + m5.group());
        }


        //text = " ID : cz -123 , sk -987 " ;
        //p = Pattern . compile ( " ( cz | sk ) -(\\ d +) " ) ;
        //m = p . matcher ( text ) ;
        //while ( m . find () ) {
        //    System.out.println( " Cela shoda : " + m . group (0) ) ;
        //    System.out.println( " Kod zeme : " + m . group (1) ) ;
        //    System.out.println( " Cislo : " + m . group (2) ) ;
        //}


        //ÚKOL 2-------------------------------------------------------------------

        Pattern p6 = Pattern.compile("\\b\\p{L}{2,}\\b"); //- unicode   //Najděte slovo tvořené pouze písmeny (alespoň 2 znaky).
        Matcher m6 = p6.matcher(text);
        while (m6.find()) {
            System.out.println(" Nalezeno6 : " + m6.group());
        }

        Pattern p7 = Pattern.compile("\\b\\d{3,5}\\b"); //Najděte číslo s 3 až 5 číslicemi.
        Matcher m7 = p7.matcher(text);
        while (m7.find()) {
            System.out.println(" Nalezeno7 : " + m7.group());
        }

        Pattern p8 = Pattern.compile("\\b(ha){2,4}\\b"); //Najděte výskyty ha opakované 2 až 4× po sobě (např. hahaha).
        /*
        \b(ha){2,4}\b: Vyžaduje, aby řetězec tvořil celé samostatné slovo.
        (?:ha){2,4}: Najde sekvenci kdekoliv, třeba i uprostřed delšího slova.
        (ha): Zachytávající skupina (Capturing Group) – uloží nalezený text do paměti (jako Skupinu 1 / $1). To se hodí, pokud chceš text později nahradit nebo z něj část vytáhnout.
        (?:ha): Nezachytávající skupina (Non-capturing Group) – slouží pouze ke seskupení pro kvantifikátor {2,4}. Nic neukládá do paměti, což je rychlejší a šetří výpočetní výkon.
         */
        Matcher m8 = p8.matcher(text);
        while (m8.find()) {
            System.out.println(" Nalezeno8 : " + m8.group());
        }

        Pattern p9 = Pattern.compile("[\\p{L}\\p{N}_]+"); //-unicode   //Najděte libovolný „token“ typu slovo: písmena/číslice/podtržítko (alespoň 1 znak).
        Matcher m9 = p9.matcher(text);
        while (m9.find()) {
            System.out.println(" Nalezeno9 : " + m9.group());
        }


























    }


}
