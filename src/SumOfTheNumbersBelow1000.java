import java.util.Scanner;

public class SumOfTheNumbersBelow1000 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number range : ");
        int num = sc.nextInt();
        int sum = getSum(num);
        System.out.println("The sum of all the multiples of 3 or 5 below 1000 is : " +sum);
    }

    public static int getSum(int num) {
        int sum = 0;
        if ( num <0 || num >1000)
            System.out.println("Invalid Number range,Enter number between 0 & 1000 !!! ");
        else {
            for(int i =0; i<num; i++) {
                if ((i % 3 == 0) || (i % 5 == 0))
                    sum += i;
            }
        }
        return sum;
    }
}
