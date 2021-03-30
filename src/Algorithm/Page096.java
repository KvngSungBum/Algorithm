package Algorithm;
import java.util.*;

public class Page096 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row and column: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int[] mini = new int[n];
        int max=0;int min=0;
        //행렬 값들 입력받기
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //각 행에서의 최솟값 저장
        for(int i=0;i<n;i++){
            for(int j=0;j<m-1;j++){
                min = arr[i][j];
                if(arr[i][j+1]<min)
                    min = arr[i][j+1];
            }
            mini[i] = min;
        }
        //mini의 값중에서 최댓값 출력
        for(int k=0;k<mini.length-1;k++){
            max = mini[k];
            if(mini[k+1]>max)
                max = mini[k+1];
        }
        System.out.println(max);
    }
}
