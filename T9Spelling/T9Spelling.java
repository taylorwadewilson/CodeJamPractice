import java.util.HashMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;


public class T9Spelling {
    
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader(new File("C-large-practice.in"));
        BufferedReader br = new BufferedReader(fr);
        PrintWriter writer = new PrintWriter("large-output.txt", "UTF-8");

        int cases = Integer.parseInt(br.readLine());
        char previous = ' ';
        char current = ' ';
        String line = "";
        for (int i = 0; i < cases; i++) {
            writer.printf("Case #%d: ", i+1);
            previous = ' ';
            current = ' ';
            line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                if (j > 0) {
                    previous = line.charAt(j - 1);
                }
                current = line.charAt(j);
                if (t9TypeLetter(previous).charAt(0) == t9TypeLetter(current).charAt(0)) {
                    writer.print(" ");
                }
                writer.print(t9TypeLetter(line.charAt(j)));
            }
            if (i != cases - 1) {
                writer.print("\n");
            }
        }
        writer.close();
    }

    private static String t9TypeLetter(char c) {
        switch (c) {
            case 'a': return ("2");
            case 'b': return ("22");
            case 'c': return ("222");
            case 'd': return ("3");
            case 'e': return ("33");
            case 'f': return ("333");
            case 'g': return ("4");
            case 'h': return ("44");
            case 'i': return ("444");
            case 'j': return ("5");
            case 'k': return ("55");
            case 'l': return ("555");
            case 'm': return ("6");
            case 'n': return ("66");
            case 'o': return ("666");
            case 'p': return ("7");
            case 'q': return ("77");
            case 'r': return ("777");
            case 's': return ("7777");
            case 't': return ("8");
            case 'u': return ("88");
            case 'v': return ("888");
            case 'w': return ("9");
            case 'x': return ("99");
            case 'y': return ("999");
            case 'z': return ("9999");
            case ' ': return ("0");
        }
        return "";
    }
}