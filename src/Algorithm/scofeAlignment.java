package Algorithm;
import java.util.*;

public class scofeAlignment {
    static int[][] map;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        map = new int[num][num];

        for(int i=0; i<num;i++){
            for(int j=0;j<num;j++){
                map[i][j]=sc.nextInt();
            }

        }
        //size별로 count를 저장하는 배열
        int size[] = new int[num];
        int sum=0;
        for(int i=0;i<num;i++){
            size[i]=checkBox(i+1,num);
            sum+=checkBox(i+1,num);
        }
        System.out.println("total: "+sum);
        for(int i=0;i<num;i++){
            System.out.println("size["+(i+1)+"]: "+size[i]);
        }
    }
    //volume안에 들어갈 수있는지 확인
    public static int checkBox(int n,int size){
        int mask[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mask[i][j]=1;
            }
        }
        int cnt=0; int ret=0;
        for(int i=0;i<=size-n;i++){
            for(int j=0;j<=size-n;j++){
                for(int l=0;l<n;l++){
                    for(int m=0;m<n;m++){
                        if(mask[l][m]==map[i+l][j+m])
                            cnt+=1;
                    }
                }
                if(cnt==n*n){
                    ret+=1;
                }
                cnt=0;
            }
        }
        return ret;
    }
}
