package Algorithm;
import java.util.*;

public class Page197 {
    public static void main(String[] args){
        //사용할 변수 사용부
        int n, k;
        int stock[];
        int request[];

        //데이터 입력
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        stock = new int[n];
        for(int i=0;i<n;i++){
            stock[i] = sc.nextInt();
        }
        k = sc.nextInt();
        request = new int[k];
        for(int i=0;i<k;i++){
            request[i] = sc.nextInt();
        }
        sc.close();
        BubbleSort bs = new BubbleSort();
        bs.BubbleSort(stock);
        //처리
        for(int i=0;i<k;i++){
            if(binarySearch(stock, request[i],0,stock.length-1)==-1){
                System.out.print("no ");
            }else{
                System.out.print("yes ");
            }
        }
    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
