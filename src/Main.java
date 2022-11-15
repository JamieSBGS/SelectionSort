public class Main {

    public static void main(String[] args) {
        int[] numbers = {22, 13, 10, 80, 19, 54, 51, 81, 30, 99, 91, 73, 65, 36, 35, 74, 82, 12, 43, 6};
        System.out.println("Unsorted =");
        System.out.println();
        for(int i =0; i < numbers.length;i++ ){
            System.out.println(numbers[i]);
        }
        System.out.println();
        int n = numbers.length;
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int minPos = i;  //sets min_idx to i variable in for
            for (int j = i+1; j < n; j++) // j = unsortedPos
                if (numbers[j] < numbers[minPos]) // comparison
                    minPos = j; //statement= true, minPos = j

            // swap minimum element with compared element
            int temp = numbers[minPos]; //temp holds minPos
            numbers[minPos] = numbers[i];
            //minPos swapped with the greater value
            numbers[i] = temp;
            //value formerly at numbers[i] set to minPos
        }

        System.out.println("Sorted =");
        System.out.println();
        for(int i =0; i < numbers.length;i++ ){
            System.out.println(numbers[i]);
            //print loop to display sorted array.
        }
    }
}
