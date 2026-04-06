import java.util.Scanner;

public class Task3 {

    public static void main(String args[]) {
        boolean chant = true;
        int maxlength = 0;
        String greatest = "";
        Scanner sc = new Scanner(System.in);
        while (chant == true) {

            String spell = sc.nextLine();

            if (spell.equals("stop")) {
                chant = false;
                break ;
            }
            String pureString = ""; 

            for (int i = 0; i < spell.length(); i++) {
                char c = spell.charAt(i);
                if (Character.isLetter(c)) {
                    pureString += c;
                }

            }
            pureString = pureString.trim();
            if (pureString.length() > maxlength) {
                maxlength = pureString.length();
                greatest = pureString.toUpperCase();

            }

        }
        System.out.println("Largest Spell : " + greatest);

    }
}
