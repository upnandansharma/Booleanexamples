import java.util.Scanner;

public class ArraysDemoTwo {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter marks of subject :" + (i + 1));
            arr[i] = sc.nextInt();

        }
        System.out.println("Total is");
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result = result + arr[i];

        }
        System.out.println(result);

    }
}


