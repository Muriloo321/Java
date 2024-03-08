package application;
import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Shape> list = new ArrayList<Shape>();
        System.out.print("Enter the number of shapes: ");
            int numberShapes = sc.nextInt();

        for(int i=1; i<=numberShapes; i++){
            System.out.println("Shape #"+i+" data");

            System.out.print("Rectangle or Circle (r/c)? ");
                char rc = sc.next().charAt(0);
                sc.nextLine();

            System.out.print("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(sc.next());
                if(rc == 'r'){
                    System.out.print("Width: ");
                        double wth = sc.nextDouble();
                    System.out.print("Height: ");
                        double hth = sc.nextDouble();

                    list.add(new Rectangle(color, wth, hth));
                }
                else if (rc == 'c'){
                    System.out.print("Radius: ");
                        double rds = sc.nextDouble();

                    list.add(new Circle(color, rds));
                }
        }

        System.out.println("SHAPE AREAS: ");
        for(Shape sp : list){
            System.out.println(String.format("%.2f", sp.area()));
        }

        sc.close();
    }
}