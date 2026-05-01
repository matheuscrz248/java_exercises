package bodyMassIndex;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight, height, height2, bmi;

        System.out.println("Enter your weight:");
        weight = scanner.nextDouble();

        System.out.println("Enter your height:");
        height = scanner.nextDouble();

        height2 = Math.pow(height, 2);
        bmi = weight / height2;
        bmi = Math.round(bmi * 10.0) / 10.0;

        System.out.printf("%nWeight: %.2f ", weight);
        System.out.printf("%nHeight: %.2f %n", height);

        if (bmi < 18.5) {
            System.out.printf("BMI: %.1f (Underweight)", bmi);
        }
        else if (bmi < 25.0) {
            System.out.printf("BMI: %.1f (Normal weight (congratulations))%n", bmi);
        }
        else if (bmi < 30.0) {
            System.out.printf("BMI: %.1f (Slightly overweight)%n", bmi);
        }
        else if (bmi < 35.0) {
            System.out.printf("BMI: %.1f (Obesity Class I)%n", bmi);
        }
        else if (bmi < 40.0) {
            System.out.printf("BMI: %.1f (Obesity Class II (severe))%n", bmi);
        }
        else {
            System.out.printf("BMI: %.1f Obesity Class III (morbid)%n", bmi);
        }

        scanner.close();
    }
}
