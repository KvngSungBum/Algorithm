package Algorithm;
import java.util.*;
public class Page115 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int x = (int)str.charAt(0);
        String pos_y = str.substring(1,2);
        int y = Integer.parseInt(pos_y);
        System.out.printf("%d %d \n", x,y);
        int cnt=0;

        if(move_x(x+2) && move_y(y+1)){
            cnt++;
        }
        if(move_x(x+2) && move_y(y-1)){
            cnt++;
        }
        if(move_x(x-2) && move_y(y+1)){
            cnt++;
        }
        if(move_x(x-2) && move_y(y-1)){
            cnt++;
        }
        if(move_x(x+1) && move_y(y+2)){
            cnt++;
        }
        if(move_x(x+1) && move_y(y-2)){
            cnt++;
        }
        if(move_x(x-1) && move_y(y+2)){
            cnt++;
        }
        if(move_x(x-1) && move_y(y-2)){
            cnt++;
        }
        System.out.println(cnt);
    }



    static boolean move_x(int a){
        return a>=97 && a<=104;
    }
    static boolean move_y(int b){
        return b>=1 && b<=8;
    }
}
