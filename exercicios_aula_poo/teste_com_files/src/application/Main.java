package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Caminho padrão: C:\\Users\\muril\\OneDrive\\Documentos\\Java\\exercicios_aula_poo\\teste_com_files

        System.out.print("Digite o caminho do seu novo arquivo: ");
        String path = sc.nextLine();
        boolean file = new File(path+"\\teste").mkdir();
        String newPath = path + "\\teste\\texto.txt";

        System.out.print("Digite quantas linhas terão o seu arquivo: ");
        int nbrLines = sc.nextInt();
        sc.nextLine();
        String[] lines = new String[nbrLines];
        System.out.println("Agora digite o que quiser, considerando o número de linhas.");
        for(int i = 0; i < nbrLines; i++ ) {
            lines[i] = sc.nextLine();
        }


        try(BufferedWriter bf = new BufferedWriter(new FileWriter(newPath))) {

            for(String line : lines) {
                bf.write(line);
                bf.newLine();
            }
            System.out.println("Sucesso!");
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }

}