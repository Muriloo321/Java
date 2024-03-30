import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> votes = new LinkedHashMap<>();

        //O caminho do arquivo que estarei utilizando: C:\Users\muril\OneDrive\Documentos\Java\exercicios_curso_udemy\exercicio15\texto.txt
        System.out.print("Enter the full path of the file: ");
            String path = sc.nextLine();

        try(BufferedReader bf = new BufferedReader(new FileReader(path))) {

            String line = bf.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                if(votes.containsKey(name)){
                    int additionalVotes = votes.get(name);
                    votes.put(name, count + additionalVotes);
                }

                else{
                    votes.put(name, count);
                }

                line = bf.readLine();
            }

            for(String key : votes.keySet()){
                System.out.println(key + ": " + votes.get(key));
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}