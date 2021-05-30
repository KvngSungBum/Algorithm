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
        sort st = new sort();
        st.quickSort(arr,0,n-1);
        int start =0;
        int end = arr[n-1];
        int result =0;
        int total =0;
        while(start<=end){
            total=0;
            int mid = (start+end)/2;
            for(int i=0;i<n;i++){
                if(arr[i]>mid)
                    total+=arr[i]-mid;
            }
            if(total<m)
                end=mid-1;
            else{
                result = mid;
                start = mid+1;
            }
        }
        System.out.println(result);
    }

}
