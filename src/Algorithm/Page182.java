package Algorithm;

import java.util.*;

public class Page182 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k =sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        sc.nextLine();
        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }

        BubbleSort bs = new BubbleSort();
        for(int i=0;i<k;i++){
            bs.BubbleSort(arr1);
            bs.BubbleSort(arr2);
            arr1[0] = arr2[n-1];
        }
        int sum=0;
        for(int i=0;i< arr1.length;i++){
            sum+=arr1[i];
        }
        System.out.println(sum);
    }
}
