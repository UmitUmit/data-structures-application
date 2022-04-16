public class ArrayProduct {
/*
Write a function that takes in a non-empty array of integers and returns an array of the same
length, where each element in the output array is equal to the product of every other number
in the input array. In other words, the value at output[i] is equal to the product of every
number in the input array other than input[i] . Note that you're expected to solve this problem
without using division.
Sample Input array = [5, 1, 4, 2]
Sample Output [8, 40, 10, 20]
// 8 is equal to 1 x 4 x 2
// 40 is equal to 5 x 4 x 2
// 10 is equal to 5 x 1 x 2
// 20 is equal to 5 x 1 x 4
Directions :
 Solve the problem on your own.
 No group effort.
 If possible, provide more than one solution/strategy.
 Different approaches will be great for discussion.
 If you are stuck no problem. Student will experience the same.
 Do not google it. Try to build your own solution. It might be ugly no worries.
Good luck!
 */



    public static void main(String[] args) {


    }

//    public static int multiplier(int[] arr, int current){
//
//
//        return ;
//    }


    public static int[] productArray(int arr[]) {
        int n = arr.length;
        // Base case
        if (n == 1) {
            System.out.print(0);
            return new int[]{};
        }
        // Initialize memory to all arrays
        int left[] = new int[n];
        int right[] = new int[n];
        int prod[] = new int[n];

        int i, j;

        /* Left most element of left array
is always 1 /
        left[0] = 1;

        / Right most element of right
array is always 1 /
        right[n - 1] = 1;

        / Construct the left array */
        for (i = 1; i < n; i++) {
            left[i] = arr[i - 1] * left[i - 1];
            System.out.println(left[i]);
        }

        /* Construct the right array */
        for (j = n - 2; j >= 0; j--) {
            right[j] = arr[j + 1] * right[j + 1];
            System.out.println(right[i]);
        }

        /* Construct the product array using
        left[] and right[] */
        for (i = 0; i < n; i++) {
            prod[i] = left[i] * right[i];
            System.out.println(prod[i]);
        }

        /* print the constructed prod array */
        for (i = 0; i < n; i++)
            System.out.print(prod[i] + " ");

        return prod;
    }


}
