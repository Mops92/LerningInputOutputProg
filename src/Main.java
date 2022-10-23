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
                    case "�":
                        latin[i] = "a";
                        break;
                    case "�":
                        latin[i] = "b";
                        break;
                    case "�":
                        latin[i] = "v";
                        break;
                    case "�":
                        latin[i] = "g";
                        break;
                    case "�":
                        latin[i] = "d";
                        break;
                    case "�":
                        latin[i] = "e";
                        break;
                    case "�":
                        latin[i] = "yo";
                        break;
                    case "�":
                        latin[i] = "j";
                        break;
                    case "�":
                        latin[i] = "z";
                        break;
                    case "�":
                        latin[i] = "i";
                        break;
                    case "�":
                        latin[i] = "k";
                        break;
                    case "�":
                        latin[i] = "l";
                        break;
                    case "�":
                        latin[i] = "m";
                        break;
                    case "�":
                        latin[i] = "n";
                        break;
                    case "�":
                        latin[i] = "o";
                        break;
                    case "�":
                        latin[i] = "p";
                        break;
                    case "�":
                        latin[i] = "r";
                        break;
                    case "�":
                        latin[i] = "s";
                        break;
                    case "�":
                        latin[i] = "t";
                        break;
                    case "�":
                        latin[i] = "u";
                        break;
                    case "�":
                        latin[i] = "f";
                        break;
                    case "�":
                        latin[i] = "h";
                        break;
                    case "�":
                        latin[i] = "ts";
                        break;
                    case "�":
                        latin[i] = "ch";
                        break;
                    case "�":
                        latin[i] = "sh";
                        break;
                    case "�":
                        latin[i] = "shch";
                        break;
                    case "�":
                        latin[i] = "'";
                        break;
                    case "�":
                        latin[i] = "y";
                        break;
                    case "�":
                        latin[i] = "";
                        break;
                    case "�":
                        latin[i] = "e";
                        break;
                    case "�":
                        latin[i] = "yu";
                        break;
                    case "�":
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

        System.out.println("�������� ��������");

    }


}
