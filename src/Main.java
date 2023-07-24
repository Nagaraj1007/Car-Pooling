import java.util.Arrays;

public class Main {

    public static boolean possibleOrNot(int[][] trips, int capacity){
        int trip_1_start = trips[0][1], trip_1_end = trips[0][2];
        int trip_2_start = trips[1][1], trip_2_end = trips[1][2];
        int array[] = new int[trip_2_end];
        for(int iterator = 1 ; iterator < trip_1_end ; iterator++){
            array[iterator] += trips[0][0];
        }
        for(int iterator = trip_2_start ; iterator < trip_2_end ; iterator++){
            array[iterator] += trips[1][0];
        }
        for (int values : array){
            if(values > capacity){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(possibleOrNot(new int[][]{{2,1,5},{3,3,7}}, 5));
    }
}