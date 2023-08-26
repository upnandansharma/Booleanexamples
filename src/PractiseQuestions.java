public class PractiseQuestions {
    public static void main(String[] args) {
       hello10Times();
       numbersFrom1To100();
       numbersFrom100To1();
    }

    public static void hello10Times(){
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Hello");

        }

    }
    public static void numbersFrom1To100(){
        for (int i = 1; i <=100 ; i++) {
            System.out.println(i);

        }
    }

    public static void numbersFrom100To1(){
        for (int i = 100; i >=1 ; i--) {
            System.out.println(i);
        }

    }

}
