public class numberRectangle1 {
    public static void printPattern() {
        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == 6 || j == 6) {
                    System.out.print(4 + " ");
                } else if (i == 1 || j == 1 || i == 5 || j == 5) {
                    System.out.print(3 + " ");
                } else if (i == 2 || j == 2 || i == 4 || j == 4) {
                    System.out.print(2 + " ");
                } else if (i == 3 || j == 3) {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern();
    }
}