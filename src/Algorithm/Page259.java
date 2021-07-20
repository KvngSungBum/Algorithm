package Algorithm;

import java.util.*;
import java.math.*;

public class Page259 {
    static int INF = 100000;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] graph = new int[n][n];
        //graph 초기화
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                    graph[i][j]=0;
                else
                    graph[i][j] = INF;
            }
        }
        //graph 채우기
        for(int i=0;i<m;i++){
            int a = sc.nextInt();
            int b= sc.nextInt();
            graph[a-1][b-1] = 1;
            graph[b-1][a-1] = 1;
        }
        int k = sc.nextInt();
        int x = sc.nextInt();
        sc.close();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int s=0;s<n;s++){
                    graph[j][s] = Math.min(graph[j][s],graph[j][i]+graph[i][s]);
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

        int distance = graph[0][k-1] + graph[k-1][x-1];
        if(distance>=INF)
            System.out.println("-1");
        else
            System.out.println(distance);
    }
}
