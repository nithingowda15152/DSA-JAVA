import java.util.Scanner;

public class DeleteAtbeg {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = s.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Before deleting at beginning");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        // delete at beginning (shift left)
        for (int i = 0; i < n - 1; i++) {
            a[i] = a[i + 1];
        }

        System.out.println("\nAfter deleting at beginning");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + " ");
        }

        s.close();
    }
}