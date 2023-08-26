public class TwoDArray {
    public static void main(String[] args) {
        twoDArray();
    }


    public static void twoDArray() {
        int[] twoDArray[] = new int[3][5];
        twoDArray = new int[][]{
                {95, 99, 98, 88, 75},
                {88, 99, 77, 79, 89},
                {90, 80, 70, 89, 99}
        };
        int s;
        int highest = 0;
        int average = 0;
        for (int i = 0; i < twoDArray.length; i++) {
            s = 0;
            for (int j = 0; j < twoDArray[i].length; j++) {
                s = s + twoDArray[i][j];
            }
            if (s > highest) {
                highest = s;

            }
            average = s / 5;


            System.out.println("Marks obtained by " + (i + 1) + " is " + s);
            System.out.println("Average = " + average);


        }
        System.out.println(highest + " is the highest total");


    }

}



