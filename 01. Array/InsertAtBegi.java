import java.util.Scanner;

public class InsertAtBegi {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = s.nextInt();

        // array creation
        int[] a = new int[n + 1];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Before inserting at beg ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nEnter ele to insert");
        int ele = s.nextInt();

        // Insert At Beg
        for (int i = a.length - 1; i >= 0; i--) {
            if (i == 0) {
                a[i] = ele;
            } else {
                a[i] = a[i - 1];
            }
        }

        System.out.println("After inserting at beg ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}