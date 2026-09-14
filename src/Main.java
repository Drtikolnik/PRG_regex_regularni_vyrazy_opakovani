import java.util.regex.*;

public class Main {
    public static void main(String[] args) {

        String text = "Hello 2025! 123 1";
        Pattern p = Pattern.compile("[0-9]+"); // slice
        Matcher m = p.matcher(text);
        if (m.find()) {
            System.out.println(" Nalezeno : " + m.group()); // -> 2025
        }
        while (m.find()) {
            System.out.println(" Nalezeno : " + m.group()); // -> 2025 , 123
        }


        Pattern p2 = Pattern.compile("Hello");
        Matcher m2 = p2.matcher(text);
        if (m2.find()) {
            System.out.println(" Nalezeno2 : " + m2.group());
        }

        Pattern p3 = Pattern.compile("[A-Z]+");
        Matcher m3 = p3.matcher(text);
        if (m3.find()) {
            System.out.println(" Nalezeno3 : " + m3.group());
        }

        Pattern p4 = Pattern.compile("[a-z|A-Z]+");
        Matcher m4 = p4.matcher(text);
        if (m4.find()) {
            System.out.println(" Nalezeno4 : " + m4.group());
        }

        Pattern p5 = Pattern.compile("/d");
        Matcher m5 = p5.matcher(text);
        if (m5.find()) {
            System.out.println(" Nalezeno5 : " + m5.group());
        }

    }


}
