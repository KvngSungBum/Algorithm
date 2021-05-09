package Algorithm;
import java.util.*;

public class Page152 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        int map[][] = new int[n][m];
        int start_pox=0;
        int start_poy=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                map[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
    }

    public void bfs(int x, int y){

    }
}
