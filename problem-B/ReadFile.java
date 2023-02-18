mport java.io.File;
import java.io.FileNotFoundException;

import java.util.*;
public class pra3 {
    public static void main(String[] args) {

        String [] linne = readFile("popo.txt");
        for (String s : linne) {
            System.out.println(s);
        }

    }

        public static String[] readFile(String filename) {
            String[] lines = new String[10];
            int lineCounter = 0;

            try {
                File file = new File(filename);
                Scanner s = new Scanner(file);

                while (s.hasNextLine()) {
                    String line = s.nextLine();
                    lines[lineCounter] = line;
                    lineCounter++;
                }
                s.close();
            } catch (FileNotFoundException exception) {
                System.out.println("There is no exist file such as: " + filename);
            } catch (NullPointerException e) {
                System.out.println("There is nothing ");
            }

            String result[] = new String[lineCounter];
            for (int i = 0; i < lineCounter; i++) {
                result[i] = "[" + i + "]" + lines[i];
            }
            return result;

        }
    }


