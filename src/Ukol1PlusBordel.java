import java.util.regex.*;


public class Ukol1PlusBordel {
    public static void main(String[] args) {

        String text = "Hello 2025! 123 1 ok OK čas 42 12345 ha hahaha hahahaha _a a_ a1 a_b";

        //ÚKOL 1-------------------------------------------------------------------
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


        //ÚKOL 3-------------------------------------------------------------------

        text = " Cena : 250 CZK " ;
        String result = text.replaceAll ( " (\\d +) \\s * CZK " , " $1 Kc " ) ;
        System.out.println(result); // -> Cena : 250 Kc




        String vezni = "Pavel Novák;1.1.2008;+420 123 456 789;pavel@seznam.cz;Rokycany;Svazu bojovníků za svobodu;112;332 01\n" +
                "Anna Černá;12.5.1995;+420 777 888 999;anna.cerna@gmail.com;Brno;Křenová;45;602 00\n" +
                "Josef Dvořák;29.2.2000;+420 606 111 222;josef.dvorak@email.cz;Praha;Dlouhá;128;110 00\n" +
                "Marie Křížová;30.11.1987;+420 608 333 444;marie.krizova@posta.cz;České Budějovice;Jižní;7;370 01\n" +
                "Lukáš Říha;7.7.1975;+420 602 555 666;lukas.riha@example.cz;Plzeň;Sokolovská;931;301 00\n" +
                "Eva Veselá;31.12.2004;+420 721 234 567;eva.vesela@mail.cz;Karlovy Vary;Zahradní;26;360 01\n" +
                "pavel novák;1.1.2008;+420 123 456 789;pavel@seznam.cz;Rokycany;Svazu;112;332 01\n" +
                "Jan Novák Dlouhý;4.4.1990;+420 777 111 222;jan.novak@email.cz;Praha;Hlavní;15;120 00\n" +
                "Pavel Novák;31.2.2008;+420 123 456 789;pavel@seznam.cz;Rokycany;Svazu;112;332 01\n" +
                "Pavel Novák;1.13.2008;+420 123 456 789;pavel@seznam.cz;Rokycany;Svazu;112;332 01\n" +
                "Pavel Novák;1.1.2008;123456789;pavel@seznam.cz;Rokycany;Svazu;112;332 01\n" +
                "Pavel Novák;1.1.2008;+420 123 456 789;pavel@seznam;Rokycany;Svazu;112;332 01\n" +
                "Pavel Novák;1.1.2008;+420 123 456 789;pavel@seznam.cz;rokycany;Svazu;112;332 01\n" +
                "Pavel Novák;1.1.2008;+420 123 456 789;pavel@seznam.cz;Rokycany;ulice;112;332 01\n" +
                "Pavel Novák;1.1.2008;+420 123 456 789;pavel@seznam.cz;Rokycany;Svazu;0;332 01\n" +
                "Pavel Novák;1.1.2008;+420 123 456 789;pavel@seznam.cz;Rokycany;Svazu;112;33201\n" +
                "Alena Procházková;8.8.1998;+420 777 222 333;alena@email.cz;Brno;;75;602 00\n" +
                "Karel Malý;10.10.1980;+420 603 444 555;karel.maly@email.cz;Olomouc;Polní;31;\n" +
                "David Jelínek;6.6.1992;+420 604 666 777;david.jelinek@email.cz;Liberec;Lesní;44\n" +
                "Petra Bílá;9.9.1989;+420 605 888 999;petra.bila@email.cz;Pardubice;Nádražní;18;530 02;navíc";

        System.out.println(vezni);


















    }


}
