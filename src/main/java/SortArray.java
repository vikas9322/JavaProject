import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
//        int[] samllArray = {1,2,3,4,5};
//        Arrays.sort(samllArray);
//        System.out.println(Arrays.toString(samllArray));
        sortFoods();
    }

    public static void sortFoods() {
        // Let's create an array to store food names
        String[] foods = {"Spaghetti", "Marshmallow", "Pickle", "Banana", "Pancake"};
        // Sort the array elements
        Arrays.sort(foods);


        // Print the Array elements on to the console by converting the Array object into a String
//        System.out.println(sortedFood.toString());
        System.out.println(Arrays.toString(foods));

        int[] scores = {15,11,12};
        Arrays.sort(scores);
        Arrays.fill(scores,0,1,90);
        int num = Arrays.binarySearch(scores,12);
        System.out.println(num);

    }
}
