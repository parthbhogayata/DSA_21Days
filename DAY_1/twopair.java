// Given an array A[] of n numbers and another number x, the task is to check whether or not there exist two elements in A[] whose sum is exactly x

// Input: arr[] = {0, -1, 2, -3, 1}, x= -2
// Output: Yes

class Solution{

// Time Complexity = O(Nsquare)
// Space Complexity = O(1) Constant

    // static boolean twopair_1(int arr[] , int x){
    //     for(int i=0;i<arr.length-1;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if((arr[i] + arr[j]) == x){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    static boolean twopair_2(int arr[] , int x){
        for(int i = 0; i < arr.length - 1; i++){
            int count = i+1;
            if((arr[i] + arr[count]) == x){
                return true;
            }
            else{
                count++;
            }

        }
        return false;
    }

    public static void main(String args[]){
        int[] arr = {1, -2, 1, 0, 5};
        int x = 0;

        boolean ans = twopair_1(arr,x); //Approch - 1
        boolean ans = twopair_2(arr,x); //Approch - 2

        System.out.println(ans);
    }
}