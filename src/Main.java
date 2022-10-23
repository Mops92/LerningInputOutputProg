import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\SuperUser\\IdeaProjects\\LerningInputOutputProg\\src\\Input.txt");
        Scanner sc = new Scanner(input);
        File output = new File("C:\\Users\\SuperUser\\IdeaProjects\\LerningInputOutputProg\\src\\Output.txt");
        PrintWriter writer = new PrintWriter(output);

        while (sc.hasNextLine()) {

            String line = sc.nextLine();

            char[] assistant = line.toLowerCase().toCharArray();


            String[] latin = new String[assistant.length+1];

            for(int i = 0; i < latin.length-1; i++){
                latin[i] = String.valueOf(assistant[i]);

            }
            latin [latin.length-1] = "\n";


            for(int i = 0; i < latin.length; i++){
                switch  (latin[i]) {
                    case "а":
                        latin[i] = "a";
                        break;
                    case "б":
                        latin[i] = "b";
                        break;
                    case "в":
                        latin[i] = "v";
                        break;
                    case "г":
                        latin[i] = "g";
                        break;
                    case "д":
                        latin[i] = "d";
                        break;
                    case "е":
                        latin[i] = "e";
                        break;
                    case "ё":
                        latin[i] = "yo";
                        break;
                    case "ж":
                        latin[i] = "j";
                        break;
                    case "з":
                        latin[i] = "z";
                        break;
                    case "и":
                        latin[i] = "i";
                        break;
                    case "к":
                        latin[i] = "k";
                        break;
                    case "л":
                        latin[i] = "l";
                        break;
                    case "м":
                        latin[i] = "m";
                        break;
                    case "н":
                        latin[i] = "n";
                        break;
                    case "о":
                        latin[i] = "o";
                        break;
                    case "п":
                        latin[i] = "p";
                        break;
                    case "р":
                        latin[i] = "r";
                        break;
                    case "с":
                        latin[i] = "s";
                        break;
                    case "т":
                        latin[i] = "t";
                        break;
                    case "у":
                        latin[i] = "u";
                        break;
                    case "ф":
                        latin[i] = "f";
                        break;
                    case "х":
                        latin[i] = "h";
                        break;
                    case "ц":
                        latin[i] = "ts";
                        break;
                    case "ч":
                        latin[i] = "ch";
                        break;
                    case "ш":
                        latin[i] = "sh";
                        break;
                    case "щ":
                        latin[i] = "shch";
                        break;
                    case "ъ":
                        latin[i] = "'";
                        break;
                    case "ы":
                        latin[i] = "y";
                        break;
                    case "ь":
                        latin[i] = "";
                        break;
                    case "э":
                        latin[i] = "e";
                        break;
                    case "ю":
                        latin[i] = "yu";
                        break;
                    case "я":
                        latin[i] = "ya";
                        break;
                }
            }

            for(int i = 0; i < latin.length; i++){
                writer.print(latin[i]);

            }

        }
        sc.close();
        writer.close();

        System.out.println("Транслит завершён");

    }


}
