package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter full file path: ");
            // C:\Users\muril\OneDrive\Documentos\Java\exercicios_curso_udemy\exercicio16\employee.txt
            String path = sc.nextLine();

            try (BufferedReader br = new BufferedReader(new FileReader(path))){

                List<Employee> list = new ArrayList<>();

                String line = br.readLine();
                while(line != null){
                    String[] fields = line.split(",");
                    list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                    line = br.readLine();
                }

                System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                List<String> emails = list.stream().filter(p -> p.getSalary() > salary).map(p -> p.getEmail()).sorted().collect(Collectors.toList());
                System.out.println("Email of employees whose salary is over "+salary+":");
                emails.forEach(System.out::println);

                double sum = list.stream().filter(p -> p.getName().toUpperCase().charAt(0) == 'M').map(p -> p.getSalary()).reduce(0.0, (x,y) -> x + y);
                System.out.print("Sum of employees whose name starts with a 'M': " + sum);
            }
            catch (FileNotFoundException e) {
                System.out.println( e.getMessage());
            } catch (IOException e) {
                System.out.println( e.getMessage());
            }
        sc.close();

    }
}