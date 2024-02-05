import java.util.Arrays;

public class ArrayDemo {
    /**
     * prints a double array
     * @param values
     */
    public static void printArray(double[] values){

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println(" ");
    }

    /**
     * computes the average of an array
     * @param values
     * @return
     */
    public static double average(double[] values){
        double sum = 0;
        /*
            for (int i = 0; i < values.length; i++) {
                sum += values[i];
            }
        */
        //enhanced for loop, "for each" for loop
        for(double v:values){
            sum += v;
        }
        double avg = 0;
        if(values.length > 0){
            avg = sum / values.length;
        }
        return avg;
    }

    /**
     * find the max in the array
     * @param values
     * @return max
     */
    public static double findMax(double[] values){
        double max = values[0];
        for (int i = 1; i < values.length; i++) {
            if(values[i] > max){
                max = values[i];
            }
        }
        return max;
    }

    /**
     * find the max in the array by sorting
     * @param values
     * @return max value
     */
    public static double findMaxBySorting(double[] values){
        Arrays.sort(values);
        return values[values.length - 1];
    }

    /**
     * modifies the received array
     * @param values
     */
    public static void modifyArray(double[] values){
        values[0] = 1000;
    }

    public static void modifyArray2(double[] values){
        //this does not work because b points to different spot in memory
        //values is another variable
        //a is array in calling method, so it is pointing to a
        //a is the array so remains unchanged
        //basically just a memory pointing issue
        double[] b = {2.0,4.5,5.6,9.8,8.5};
        values = b;
    }

    /**
     * returns true if artist in list of grammyWinners
     * @param grammyWinners - a list of grammy winners in 2024
     * @param artist - artist to search for
     * @return boolean value
     */
    public static boolean grammyFinder(String[] grammyWinners, String artist){
//        for(String a:grammyWinners){
//            if(a.equals(artist)){
//                return true;
//            }
//        }
        for (int i = 0; i < grammyWinners.length; i++) {
            if(grammyWinners[i].equalsIgnoreCase(artist)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        double[] a = {2.0,5.6,9.4,33.8,0.3};
        printArray(a);
        System.out.println("the average of an array a = " + average(a));
        System.out.println("the max of an array a = " + findMax(a));
        System.out.println("the max of an array by sorting a = " + findMaxBySorting(a));
        System.out.println("array a before modification");
        printArray(a);
//        modifyArray(a);
//        System.out.println("array a after modification");
//        printArray(a);
        modifyArray2(a);
        System.out.println("array a after modification");
        printArray(a);

        String[] grammyWinners = {"Killer Mike","Skrillex","Baby Keem","BoyGenius","Metallica","Paramore","Taylor Swift"};
        String artist = "killer mike";
        boolean found = grammyFinder(grammyWinners,artist);
        if(found){
            System.out.println(artist + " won a grammy in 2024");
        }else{
            System.out.println(artist + " didn't win a grammy in 2024");
        }
    }
}
