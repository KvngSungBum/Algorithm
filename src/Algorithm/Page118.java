package Algorithm;
import java.util.*;

public class Page118 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int map_r = sc.nextInt();//pox = num of row
        int map_c = sc.nextInt();//poy = num of column
        int[][] map = new int[map_r][map_c];

        sc.nextLine();
        int x =sc.nextInt();//x coordinate of start position
        int y = sc.nextInt();//y coordinate of start position
        int eye = sc.nextInt(); // start eye direction
        sc.nextLine();
        //setting map
        for(int i=0;i<map_r;i++){
            for(int j=0;j<map_c;j++){
                map[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        sc.close();
        System.out.println("Setting complete");
        boolean beenMap[][] = new boolean[map_r][map_c];
        //setting beenMap(1인 장소 false, 0인 장소 true)
        for(int i=0; i<map_r;i++){
            for(int j=0;j<map_c;j++){
                if(map[i][j]==1)
                    beenMap[i][j] = false;
                else if(map[i][j]==0)
                    beenMap[i][j] = true;
            }
        }
        int cnt=0;
        int foox=0; int fooy=0;
        int discnt=0;

        while(true){
            eye = eye_dir(eye);
            if(eye == 3){
                discnt++;
                if(x>=0 && y>=0 && beenMap[x][y-1]==true){
                    cnt++;
                    foox =x; fooy=y;
                    beenMap[x][y]=false;
                    y=y-1;
                    discnt=0;
                }
            }
            else if(eye ==2){
                discnt++;
                if(x>=0 && y>=0 && beenMap[x+1][y] ==true){
                    cnt++;
                    foox =x; fooy=y;
                    beenMap[x][y] = false;
                    x=x+1;
                    discnt=0;
                }
            }
            else if(eye==1){
                discnt++;
                if(x>=0 && y>=0 && beenMap[x][y+1]==true){
                    cnt++;
                    foox = x; fooy= y;
                    beenMap[x][y] = false;
                    y=y+1;
                    discnt=0;
                }
            }
            else if(eye==0){
                discnt++;
                if(x>=0 && y>=0 && beenMap[x-1][y]==true){
                    cnt++;
                    foox=x;fooy=y;
                    beenMap[x][y]=false;
                    x=x-1;
                    discnt=0;
                }
            }
            if(discnt==4) {
                x=foox; y=fooy;
                if(x==foox && y==fooy)
                    break;
            }
        }
        System.out.println(cnt+1);
    }

    //eye direction changing method
    static int eye_dir(int eye){
        if(eye==0)
            eye=3;
        else
            eye-=1;
        return eye;
    }
}
