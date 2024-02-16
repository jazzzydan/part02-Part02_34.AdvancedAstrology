
public class AdvancedAstrology {

//    public static void printStars(int number) {
//        for (int i = 0; i < number; i++) {
//            System.out.print("*");
//        }
//    }

    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 0; i < size; i++) {
            printSpaces(size - i - 1);
            printStars(i + 1);
//            System.out.println(); // Move to the next line
        }
    }

    public static void christmasTree(int height) {
        for (int i = 0; i < height; i++) {
            printSpaces(height - i - 1);
            printStars(2 * i + 1);
//            System.out.println(); // Move to the next line
        }

        // Print the tree trunk
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
//            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
