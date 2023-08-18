public class ForLoop {
    public static void main(String[] args) {


        for (int counter = 1; counter <= 10; counter++) {
            System.out.println(String.format("2 X %d = %d", counter, counter * 2));
        }
        System.out.println("********************");
        tableOfThree();
        System.out.println("********************");
        allEvenNumbers();
        System.out.println("********************");
        sumOfFirst10MultiplesOfThree();
        System.out.println("********************");
        sumOfFibonocciSeries();
    }

    public static void tableOfThree() {
        for (int counter = 1; counter <= 10; counter++) {
            System.out.println(String.format("3 X %d = %d", counter, 3 * counter));
        }

    }

    public static void allEvenNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(i);

            }
        }

    }

    public static void sumOfFirst10MultiplesOfThree() {
        int sum = 0;
        for (int i = 0; i <= 30; i++) {
            if (i % 3 == 0) {
                sum = sum + i;
                System.out.println(sum);
            }

        }
            // Indentation= Alt+Ctrl+L
    }

    public static void sumOfFibonocciSeries(){
        int n1= 0;
        int n2= 1;
        System.out.println(n1);
        System.out.println(n2);
        int next =0;
        for (int i = 1; i <=8 ; i++) {
            next= n1+n2;
            System.out.println(next);
            n1=n2;
            n2=next;


        }
    }
    public static void sumOfFibonocciSeries(){
        int n1= 0;
        int n2= 1;
        System.out.println(n1);
        System.out.println(n2);
        int next =0;
        for (int i = 1; i <=8 ; i++) {
            next= n1+n2;
            System.out.println(next);
            n1=n2;
            n2=next;

        }

