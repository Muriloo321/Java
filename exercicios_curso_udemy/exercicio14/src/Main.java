import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Instâncias do set para representar os cursos.

        Set<Integer> courseA = new HashSet<>();
        Set<Integer> courseB = new HashSet<>();
        Set<Integer> courseC = new HashSet<>();

        System.out.print("How many students for course A? ");
            studentCount(sc, courseA);

        System.out.print("How many students for course B? ");
            studentCount(sc, courseB);

        System.out.print("How many students for course C? ");
            studentCount(sc, courseC);

       //Abaixo, utilizo da união dos conjutos para apenas adicionar elementos distintos, sem repetições.

        Set<Integer> total = new HashSet<>(courseA);
            total.addAll(courseB);
            total.addAll(courseC);

        System.out.println("Total students: " + total.size());

        sc.close();
    }

    public static void studentCount(Scanner sc, Set<Integer> course){
        int students = sc.nextInt();
        for(int i = 0; i < students; i++) {
            int stdtCode = sc.nextInt();
            course.add(stdtCode);
        }
    }
}