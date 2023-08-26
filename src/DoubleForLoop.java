public class DoubleForLoop {
    public static void main(String[] args) {
        hello();
        counting();
    }

    public static void hello() {
        for (int i = 1; i <= 6; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
    public static void counting(){
        for (int i = 1; i <=6 ; i++) {

            for (int j = 1; j <=5 ; j++) {
                System.out.print(j +" " );

            }
            System.out.println();
        }
    }
        // public static void pyramidStructure(){
        //  for (int i = 1; i <=8 ; i++) {
        //   for (int j = ; j < ; j++) {





}
System.out.println("");