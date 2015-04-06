import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class ReverseString {

    public static void main(String[] args) throws Exception {
        // for reading in the data from the file
        File input = new File("B-large-practice.in");
        FileReader fr = new FileReader(input);
        BufferedReader br = new BufferedReader(fr);

        // for writing to the output file
        PrintWriter writer = new PrintWriter("large-output.txt", "UTF-8");

        // setup and for loop
        int numArgs = Integer.parseInt(br.readLine());
        String textRead = "";
        String[] words = null;

        // loop through the lines
        for (int i = 0; i < numArgs; i++) {
            textRead = br.readLine();
            words = textRead.split(" ");
            writer.printf("Case #%d: ", i + 1);

            // loop through and reverse the order of the words
            for (int j = words.length - 1, k = 0; j >= 0; j--, k++) {
                writer.print(words[j]);
                if (j != 0) {
                    writer.print(" ");
                }
            }
            if (i != numArgs - 1) {
                writer.print("\n");
            }
        }
        writer.close();
    }
}