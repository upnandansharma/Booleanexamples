import java.sql.SQLOutput;

public class SwitchDemo {
    public static void main(String[] args) {
        printMonthName();
    }
    public static void printMonthName(){
        int month = 12;
        switch (month){
            case 1 :
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
        System.out.println("bye");
    }

}
