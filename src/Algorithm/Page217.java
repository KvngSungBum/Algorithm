package Algorithm;
import java.util.*;

public class Page217 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int[] mem = new int[100];

        for(int i=2;i<num+1;i++){
            mem[i]=mem[i-1]+1;
            if(i%2 == 0){
                mem[i] = Math.min(mem[i],mem[i/2]+1);
            }
            else if(i%3==0){
                mem[i] = Math.min(mem[i],mem[i/3]+1);
            }
            else if(i%5==0){
                mem[i] = Math.min(mem[i],mem[i/5]+1);
            }
        }
        System.out.println(mem[num]);
    }
}
