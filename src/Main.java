public class Main {
    public static void main(String[] args) {
        System.out.println("Massives corrected!");

        System.out.println("Tasks 1-4");
        int[] ints = new int[]{1, 2, 3};
        double[] doubles = {1.57, 7.654, 9.986};
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        String[] months = new String[10];
        int[] numbers = new int[10];

        for (int i = 0; i < ints.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(ints[i]);
        }
        System.out.println();

        for (int i = 0; i < doubles.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(doubles[i]);
        }
        System.out.println();

        for (int i = 0; i < chars.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(chars[i]);
        }
        System.out.println();

        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = doubles.length - 1; i >= 0; i--) {
            System.out.print(doubles[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                ints[i]++;
            }
//            if (i > 0) {
//                System.out.print(", ");
//            }
            if (i != ints.length - 1) {
                System.out.print(ints[i] + ", ");
            } else {
                System.out.print(ints[i]);
            }
        }
        System.out.println();

    }
}