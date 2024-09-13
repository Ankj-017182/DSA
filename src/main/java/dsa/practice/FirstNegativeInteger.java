package dsa.practice;

import java.util.ArrayList;

//First negative integer in an array of window size K and print zero if a
// negative number is not found in any specific window of size K.
public class FirstNegativeInteger {
    public static void main(String[] args){
        int[] arr = {1,-2,5,-12,7,6,-1};
        int k=3;
        int i=0,j=0;
        ArrayList<Integer> arr1= new ArrayList<>();

        while(j<arr.length){
            if (arr[j]<0)
                arr1.add(arr[j]);
            
            if (j-i+1<k)
                j++;

            else if (j-i+1==k) {
                if (arr1.isEmpty()) //edge case
                    System.out.print(0 + "");
                else{
                    System.out.print(arr1.get(0) + " ");
                    if (arr[i]==arr1.get(0)){
                        arr1.remove(0);
                    }
                    i++;
                    j++;
                }
            }
        }
    }
}
