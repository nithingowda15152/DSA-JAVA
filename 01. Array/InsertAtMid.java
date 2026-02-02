import java.util.Scanner;

public class InsertAtMid{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = s.nextInt();

        int[] a = new int[n + 1];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Before inserting at middle");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nEnter position (0 based index)");
        int pos = s.nextInt();

        System.out.println("Enter element to insert");
        int ele = s.nextInt();

        // Insert at middle
        for (int i = a.length - 1; i > pos; i--) {
            a[i] = a[i - 1];
        }
        a[pos] = ele;

        System.out.println("After inserting at middle");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}