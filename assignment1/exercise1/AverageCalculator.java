public class AverageCalculator {
    public static void main(String[] args){
        System.out.printf("The 4 numbers are: ");
        for(int i=0;i<args.length;i++){
            System.out.format("%.3f ", Double.valueOf(args[i]));
        }
        System.out.println();
        System.out.printf("And their average is: ");
        double sum = 0;
        for(int i = 0; i<args.length; i++){
            sum += Double.parseDouble(args[i]);
        }
        System.out.format("%.3f", (sum/args.length));
    }
}
