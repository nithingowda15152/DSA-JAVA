import java.util.Scanner;

public class InsertAtEnd {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = s.nextInt();

        // create array with extra space
        int[] a = new int[n + 1];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Before inserting at last");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nEnter element to insert");
        int ele = s.nextInt();

        // insert at last
        a[n] = ele;

        System.out.println("After inserting at last");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        s.close();
    }
}