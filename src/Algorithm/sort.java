package Algorithm;
import java.util.*;
public class sort {
    public static void BubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static int partition(int arr[], int left, int right){
        int pivot = arr[(left+right)/2];
        while(left<right){
            while((arr[left]<pivot)&&(left<right))
                left++;
            while((arr[right]>pivot)&&(left<right))
                right--;
            if(left<right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        return left;
    }

    public static void quickSort(int arr[], int left, int right){
        if(left<right){
            int pivotNewIndex = partition(arr,left,right);
            quickSort(arr,left,pivotNewIndex-1);
            quickSort(arr,pivotNewIndex+1,right);
        }
    }
}
