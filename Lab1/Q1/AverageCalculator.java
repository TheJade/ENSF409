package Lab1.Q1;    //this just allows it to run in the folder it is contained

public class AverageCalculator {
    public static void main(String[] args)  {

        System.out.printf("The %d numbers are:", args.length);

        double sum = 0;
        for (int i = 0; i < args.length; i++)   { // allows any size to work
            sum = sum + Double.parseDouble(args[i]);
            System.out.printf(" %.3f", Double.parseDouble(args[i]));
        }
        double avg = sum / args.length;

        System.out.printf("\nAnd their average is: %.3f", avg);
    }
}
