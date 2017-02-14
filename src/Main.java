
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of disks: ");
        int numberOfDisks = scanner.nextInt();
        TowerOfHanoi tw = new TowerOfHanoi(numberOfDisks);
    }
}

class TowerOfHanoi {

    int disks;

    public TowerOfHanoi(int disks) {
        this.disks = disks;

        solve(disks, "A", "B", "C");
    }

    public void solve(int n, String start, String auxiliary, String end) {
        if (n == 1) {
            System.out.println("MOVE disk " + n + " FROM Peg " + start + " TO Peg " + end);
        } else {
            solve(n - 1, start, end, auxiliary);
            System.out.println("MOVE disk " + n + " FROM Peg " + start + " TO Peg " + end);
            solve(n - 1, auxiliary, start, end);
        }
    }


}
