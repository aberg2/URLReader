import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by magnus on 2022-02-07.
 */
public class URLReader {
    public static void main(String[] args) {
        String url = JOptionPane.showInputDialog(null, "where?","The Ultimate Textbrowser",JOptionPane.QUESTION_MESSAGE);
        try {
            URL resource = new URL(url);
           /*
           Scanner urlScanner = new Scanner(resource.openStream());
            while (urlScanner.hasNext()) {
                System.out.println(urlScanner.nextLine());
            }*/



            BufferedReader urlReader = new BufferedReader(new InputStreamReader(resource.openStream()));
            String line = urlReader.readLine();
            while (line != null) {
                if (line.contains("a")){
                    System.out.println(line);
                }
                line = urlReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}