package Lab1.Q2;

class Marathon {
    //Implement your method
    static int min(int[] times) {
        int lowest_index[] = {0, times[0]};
            //lowest_index is an array that holds the required data
            //lowest_index[0] holds index position of lowest time
            //lowest_index[0] holds value of the lowest time
        for (int i = 1; i < times.length; i++)  {
            if (lowest_index[1] > times[i])  {
                lowest_index[0] = i;
                lowest_index[1] = times[i];
            }
        }
        return lowest_index[0]; //return index of lowest time
    }

    public static void main (String[] args) {
        String[] names = {"Elena","Thomas","Hamilton","Suzie","Phil","Matt","Alex","Emma","John","James","Jane","Emily","Daniel","Neda","Aaron","Kate"};
        int[] times = { 341,273,278,329,445,402,388,275,243,334,412,393,299,343,317,265};

        //Call your method here and, then print the name and time of the fastest runner
        int fastest_time_index = min(times);
        System.out.printf("%s had the fastest time with: %d", names[fastest_time_index], times[fastest_time_index]);
    }
}
