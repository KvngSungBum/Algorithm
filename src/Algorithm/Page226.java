package Algorithm;
import java.util.*;

public class Page226 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();
        int[] money = new int[n];
        int[] mem = new int[n+1];
        for(int i=0; i<n;i++){
            money[i] = sc.nextInt();
        }
        sc.close();
        //입력 종료
        for(int i=0;i<mem.length;i++){
            mem[i]=10001;
        }
        //처리부
        //mem 안 값이 0이면 그 값으로 해결 불가
        mem[0] = 0;
        for(int i=0;i<n;i++){
            //for(int j=0;j<m+1;)
        }
    }
}
