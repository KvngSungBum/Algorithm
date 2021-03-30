package Algorithm;
import java.util.*;
public class Page149 {
    static int x,y;
    static int[][] pack;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        x= sc.nextInt();
        y = sc.nextInt();
        pack = new int[x][y];

        int result=0;

        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                pack[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(dfs(i,j)==true)
                    result+=1;
            }
        }
        System.out.println(result);
    }
    static boolean dfs(int i, int j){
        if(i<=-1 || i>=x || j>=y || j<=-1)
            return false;
        if(pack[i][j]==0){
            pack[i][j]=1;
            dfs(i-1,j);
            dfs(i+1,j);
            dfs(i,j+1);
            dfs(i,j-1);
            return true;
        }
        return false;
    }
}
