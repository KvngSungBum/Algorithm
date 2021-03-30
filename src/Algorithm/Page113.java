package Algorithm;
import java.util.*;

public class Page113 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String default_time="5959";

        //concat
        String input_hour = sc.nextLine();
        String time =input_hour.concat(default_time);
        String[] check_time = time.split(" ");
        System.out.println(time);
        int hour = Integer.parseInt(time.substring(0,1));
        int min = Integer.parseInt(time.substring(1,3));
        int sec = Integer.parseInt(time.substring(3,5));
        int cnt=0;
        for(int i=0;i<hour;i++){
            if(i==3)//i.toString해서 안에 있으면
                cnt+=3600;
            else{
                for(int j=0;j<min+1;j++){

                }
            }
            for(int j=0;j<min+1;j++){
                for(int k=0;k<sec+1;k++){
                    if(k==3)
                        cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
