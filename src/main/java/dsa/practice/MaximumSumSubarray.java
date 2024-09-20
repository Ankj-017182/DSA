package dsa.practice;

//Maximum Sum Subarray (Sliding Window)

//public class MaximumSumSubarray {
//    public static void main(String[] args) {
//        int[] arr = {2, 1, 5, 1, 3, 2, 1};
//        int k = 3;
//        int sum =0;
//        int i = 0,j=0;
//        int max = Integer.MIN_VALUE;
//        while(j<arr.length){   // loop is to maintain the window size
//            sum += arr[j];
//            if(j-i+1<k)
//                j++;
//
//            else if (j-i+1==k) {
//                max = Math.max(sum,max);
//                sum = sum - arr[i]; //we don't want to do repetitive addition when sliding the window,
//                                      so removing the first element in the window and keeping the sum of other elements
//                                      starting from arr[1]+arr[2] till end.....
//                i++;
//                j++;
//            }
//        }
//       System.out.print("Maximum value is "+ max);
//    }
//}


//If arraylist is used instead of array and we have to take user input

//class Solution{  //solved on gfg and copy pasted here
//    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
//        // code here
//        long max = Integer.MIN_VALUE;
//        int i=0;
//        int j=0;
//        long sum =0;
//
//        while(j<N){
//            sum+=Arr.get(j);
//            if(j-i+1<K)
//                j++;
//
//            else if(j-i+1==K){
//                max = Math.max(max,sum);
//                sum -= Arr.get(i);
//                i++;
//                j++;
//            }
//        }
//        return max;
//
//    }
//}


//Minimum sum subarray//

public class MaximumSumSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2, 1};
        int k = 3;
        int diff =0;
        int i = 0,j=0;
        int min = Integer.MAX_VALUE;
        while(j<arr.length){
            diff += arr[j];
            if(j-i+1<k)
                j++;

            else if (j-i+1==k) {
                min = Math.min(diff,min);
                diff = diff - arr[i];
                i++;
                j++;
            }
        }
        System.out.print("Minimum value is "+ min);
    }
}



//public class MaximumSumSubarray {
//    public static void main(String[] args) {
//        int[] arr = {2, 1, 5, 1, 3, 2};
//        int k = 3;
//
//        int maxSum = findMaxSumSubarray(arr, k);
//        System.out.println("The maximum sum of a subarray of size " + k + " is: " + maxSum);
//    }
//
//    public static int findMaxSumSubarray(int[] arr, int k) {
//        if (arr == null || arr.length < k) {
//            throw new IllegalArgumentException("Array length must be greater than or equal to k");
//        }
//
//        // Calculate the sum of the first 'k' elements
//        int maxSum = 0;
//        for (int i = 0; i < k; i++) {
//            maxSum += arr[i];
//        }
//
//        // This will store the current window's sum
//        int windowSum = maxSum;
//
//        // Slide the window from the start to the end of the array
//        for (int i = k; i < arr.length; i++) {
//            // Slide the window: subtract the element going out of the window and add the element coming into the window
//            windowSum = windowSum - arr[i - k] + arr[i];
//            // Update the maxSum if the new windowSum is greater
//            maxSum = Math.max(maxSum, windowSum);
//        }
//
//        return maxSum;
//    }
//}
