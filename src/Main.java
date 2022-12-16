import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 имен ");
        ArrayList<String> A = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            A.add(scanner.nextLine());
        }
        System.out.println(A);

        System.out.println(" Введите еще раз 5 имен ");

        Scanner scanner1=new Scanner(System.in);
    ArrayList<String>B= new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            B.add(scanner1.nextLine());

        }
        System.out.println(B);
        ArrayList<String> C= new ArrayList<>();

        Collections.reverse(B);

        C.add(A.get(0));
        C.add(B.get(0));
        C.add(A.get(1));
        C.add(B.get(1));
        C.add(A.get(2));
        C.add(B.get(2));
        C.add(A.get(3));
        C.add(B.get(3));
        C.add(A.get(4));
        C.add(B.get(4));

        Collections.sort(C, new Comp());
        System.out.println("Отсортированный список C по длине слова: "+ C);

        }
    }
