package application;

import entities.Item;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Item> list = new ArrayList<>();

        String path = "C:\\Users\\muril\\OneDrive\\Documentos\\Java\\exercicios_curso_udemy\\exercicio12";
        Boolean file = new File(path + "\\oout").mkdir();

        path = "C:\\Users\\muril\\OneDrive\\Documentos\\Java\\exercicios_curso_udemy\\exercicio12\\oout\\summary.csv";

        try(BufferedWriter bf = new BufferedWriter(new FileWriter(path))){

            System.out.print("Type the amount of items: ");
                int qntItems = sc.nextInt();

            for(int i = 0; i < qntItems; i++){

                sc.nextLine();
                System.out.print("Enter item name: ");
                    String nameItem = sc.nextLine();
                System.out.print("Enter item price: ");
                    double priceItem = sc.nextDouble();
                System.out.print("Enter item quantity: ");
                    int qntItem = sc.nextInt();

                list.add(new Item(nameItem, priceItem, qntItem));
            }

            for(Item it : list){
                bf.write(it.toString());
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (InputMismatchException e){
            System.out.println("Valor incorreto.");
        }


         sc.close();
    }
}