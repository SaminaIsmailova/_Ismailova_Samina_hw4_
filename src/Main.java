import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> A = new ArrayList<>();

        Scanner name = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            A.add(name.next());
        }
        System.out.println(A);

        ArrayList<String> B = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            B.add(name.next());
        }
        System.out.println(B);

        ArrayList<String> C = new ArrayList<>();
        C.add(A.get(0));
        C.add(B.get(4));
        C.add(A.get(1));
        C.add(B.get(3));
        C.add(A.get(2));
        C.add(B.get(2));
        C.add(A.get(3));
        C.add(B.get(1));
        C.add(A.get(4));
        C.add(B.get(0));
        System.out.println(C);

        Collections.sort(C, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println(C);
    }
}