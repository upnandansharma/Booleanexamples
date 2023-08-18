public class Question4 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        check(1, 90, 91);

    }

    public static void check(int a, int b, int c) {
        if (a > b && a > c) {

            System.out.println("int a is greatest");
        } else if (b > a && b > c) {
            System.out.println("int b is the greatest");
        } else {
            System.out.println("int c is the greatest");
        }


    }


}