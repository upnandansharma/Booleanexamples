public class ArrayDemoThree {
    public static void main(String[] args) {
        int[] arr = new int[]{11,12,34,50,56,65,78,99,87,66,55};
        smallestInArray();
        greatest();
        reverseArray();
        int[] reverseArray = reverseArray();



    }

    public static void smallestInArray() {
        int[] arr = new int[]{11,12,34,50,56,65,78,99,87,66,55};
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<smallest){
                smallest = arr[i];

        }
        }
        System.out.println("Smallest number is " + smallest);

    }
    public static void greatest() {
        int[] arr = new int[]{11,12,34,50,56,65,78,99,87,66,55};
        int greatest = arr[0];
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i]>greatest){
                greatest = arr[i];

            }
        }
        System.out.println("Smallest number is " + greatest);

    }
    public static int[] reverseArray() {
        int[] arr = new int[]{11, 12, 34, 50, 56, 65, 78, 99, 87, 66, 55};
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[arr.length - 1 - i] = arr[i];
        }
            return reversed;


        }

                                                        ////

    }






