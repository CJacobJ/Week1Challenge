package Week1Challenge;

import java.util.Scanner;

public class Week1ChallengeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number to check for ascending");
        String num = scanner.nextLine();
        System.out.println("Ascending number = " + Week1Solution.ascending(num));

        System.out.println("Enter number to create patch");
        num = scanner.nextLine();
        int[][] square = Week1Solution.squarePatch(num);
        for (int[] row : square) {
            for (int point : row) {
                System.out.print(point + " ");
            }
            System.out.println();
        }
    }
}
