package Algorithm;
import java.util.*;

public class Page223 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] mem = new int[num+1];

        mem[1] = 1;
        mem[2] = 3;
        for(int i=3;i<=num;i++){
            mem[i] = (mem[i-1]+(2*mem[i-2]))%796796;
        }
        System.out.println(mem[num]);
    }
}
