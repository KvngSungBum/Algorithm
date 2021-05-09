package Algorithm;
import java.util.*;

public class scofeDelivery {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numArr = new int[num];
        for(int i=0;i<num;i++){
            numArr[i]=sc.nextInt();
        }
        int cnt =1;int idx=0;
        while(true){
            if(idx+2<num){
                if(numArr[idx+2]==1){
                    idx=idx+2;
                    if(numArr[idx-1]==1)
                        cnt*=2;
                    else
                        cnt*=1;
                }else{
                    idx=idx+1;
                    cnt*=1;
                }
            }else{
                idx=idx+1;
                cnt*=1;
                break;
            }
        }
        System.out.println(cnt);
    }
}
