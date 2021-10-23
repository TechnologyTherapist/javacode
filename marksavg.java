import java.util.Scanner;

public class marksavg {
    public static void main(String args[]) {
        int mark[] = new int[5];
        int i;
        float sum = 0, avg;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Marks Obtained in 5 Subjects : ");
        for (i = 0; i < 5; i++) {
            mark[i] = scan.nextInt();
            sum = sum + mark[i];
        }

        avg = sum / 5;

        System.out.print("Your Grade is ");
        if (avg > 75) {
            System.out.print("  distinction");
        } else if (avg > 60 && avg <= 75) {
            System.out.print("First Class");
        } else if (avg > 40 && avg <= 60) {
            System.out.print("Second Class");
        } else if (avg < 40) {
            System.out.print("fail");
        }
    }
}