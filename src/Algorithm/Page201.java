package Algorithm;
import java.util.*;

public class Page201 {
    public static void main(String[] args){
        //입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();;
        //입력 끝
        //처리
        BubbleSort bs= new BubbleSort();
        bs.BubbleSort(arr);
        for(int i=0;i<n;i++){
            for(int j=1;j<=arr[n-1];j++){

            }
        }
    }
}
