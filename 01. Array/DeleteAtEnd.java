import java.util.Scanner;

public class DeleteAtEnd {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = s.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Before deleting at end");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        // delete at end (no shifting)
        System.out.println("\nAfter deleting at end");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + " ");
        }

        s.close();
    }
}