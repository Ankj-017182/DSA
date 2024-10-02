public class SecondLargestElement {
    public static int secondlargest(int[] arr){
        if (arr.length<2){
            System.out.println("minimum 2 elements are required");
        }
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > firstLargest){
                secondLargest = firstLargest;
                firstLargest = num;
            }
            else if(num>secondLargest && num!=firstLargest){
                secondLargest = num;
            }
        }
        if (secondLargest == Integer.MIN_VALUE){
            System.out.print("No new largest element found");
        }
        return secondLargest;
    }

    public static void main(String[] args){
        int [] arr = {14, 46, 47, 86, 92, 52, 48, 36, 66, 85};
        System.out.println("Second largest element is : " + secondlargest(arr));
    }
}
