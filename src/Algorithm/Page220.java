package Algorithm;

import java.util.*;

public class Page220 {
    public static void main(String[] args){
        //선언부 및 입력
        int[] mem = new int[100];
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] garage = new int[num];

        for(int i=0; i<num;i++){
            garage[i] = sc.nextInt();
        }
        sc.close();
        //선언 및 입력 종료
        int result=0;
        for(int i=1;i<num-2;i++){
            mem[i] = garage[i]+garage[i+2];
            result = Math.max(mem[i-1],mem[i]);
        }
        System.out.println(result);
    }
}
