
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextInput = scanner.nextLine();
        while(!nextInput.equals("end")) {
            int currNum = Integer.parseInt(nextInput);
            int cube = currNum * currNum * currNum;
            System.out.println(cube);
            nextInput = scanner.nextLine();
        }
        scanner.close();
    }
}
