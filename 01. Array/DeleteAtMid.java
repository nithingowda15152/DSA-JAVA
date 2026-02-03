import java.util.Scanner;

public class DeleteAtMid {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = s.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Before deleting at middle");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nEnter position to delete (0 based index)");
        int pos = s.nextInt();

        // delete at middle (shift left from pos)
        for (int i = pos; i < n - 1; i++) {
            a[i] = a[i + 1];
        }

        System.out.println("After deleting at middle");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + " ");
        }

        s.close();
    }
}