//4737
//Lab #2
//COP 3530

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of disks: ");
        int numberOfDisks = scanner.nextInt();
        TowerOfHanoi tw = new TowerOfHanoi(numberOfDisks);
        tw.printNumberOfMoves();
    }
}

class TowerOfHanoi {

    private int numberOfMoves = 0;
    private int disks;

    public TowerOfHanoi(int disks) {
        this.disks = disks;
        hanoi(disks, "A", "B", "C");
    }

    public void hanoi(int n, String start, String auxiliary, String end) {
        if (n == 1) {
            System.out.println("MOVE disk " + n + " FROM Peg " + start + " TO Peg " + end);
        } else {
            hanoi(n - 1, start, end, auxiliary);
            System.out.println("MOVE disk " + n + " FROM Peg " + start + " TO Peg " + end);
            hanoi(n - 1, auxiliary, start, end);
        }

        numberOfMoves++;
    }

    public void printNumberOfMoves(){
        System.out.println("The total number of moves to move " + disks + " disks is: " + numberOfMoves);
    }


}
