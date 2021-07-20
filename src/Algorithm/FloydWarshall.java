package Algorithm;

import java.util.*;
import java.math.*;

public class FloydWarshall {
    static int INF = 100000;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//node
        int m = sc.nextInt();//edge

        //2차원 배열 무한값으로 초기화
        int[][] graph = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                    graph[i][j]=0;
                else
                    graph[i][j] = INF;
            }
        }
        //weight값 읽고 저장
        for(int i=0;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph[a-1][b-1] =c;
        }
        sc.close();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    graph[j][k] = Math.min(graph[j][k],graph[j][i]+graph[i][k]);
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(graph[i][j] ==INF)
                    System.out.println("INFINITY");
                else
                    System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
}
