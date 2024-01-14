
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int currInput = scanner.nextInt();
        double count = 0;
        double average = 0;
        while(currInput != 0) {
            if(currInput > 0) {
                sum += currInput;
                count += 1;
            }
            currInput = scanner.nextInt();
        }
        scanner.close();
        if(sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            average = (double) sum / count;
            System.out.println(average);
        }



    }
}
