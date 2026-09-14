import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        String text1 = " Hello 2025! 123 ";
        Pattern p1 = Pattern.compile(" [0-9]+"); // slice
        Matcher m1 = p1.matcher(text1);
        if(m1.find()) {
            System.out.println(" Nalezeno : " + m1.group());
        }

        while(m1.find()) {
            System.out.println(" Nalezeno : " + m1.group()); // -> 2025 , 123
        }


        String text2 = " Hello 2025! 123 ";
        Pattern p2 = Pattern.compile("Hello"); // slice
        Matcher m2 = p2.matcher(text2);
        if(m2.find()) {
            System.out.println(" Nalezeno : " + m2.group());
        }


        String text3 = " Hello 2025! 123 ";
        Pattern p3 = Pattern.compile("[A-Z]"); // slice
        Matcher m3 = p3.matcher(text3);
        if(m3.find()) {
            System.out.println(" Nalezeno : " + m3.group());
        }


        String text9 = " Hello 2025! 123 ";
        Pattern p9 = Pattern.compile("[a-z|A-Z]"); // slice
        Matcher m9 = p9.matcher(text9);
        if(m9.find()) {
            System.out.println(" Nalezeno : " + m9.group());
        }


        String text4 = " Hello 2025! 123 ";
        Pattern p4 = Pattern.compile("/d"); // slice
        Matcher m4 = p4.matcher(text4);
        if(m4.find()) {
            System.out.println(" Nalezeno : " + m4.group());
        }

    }


}