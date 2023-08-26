import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[5];
        arr[0] = "Upnandan";
        arr[1] = "Aman";
        arr[2] = "Adesh";
        arr[3] = "Abcd";
        arr[4] = "Efgh";

        System.out.println(Arrays.toString(arr));
        System.out.println(arr);

    }
}
