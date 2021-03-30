package Algorithm;
import java.util.*;

public class Page092 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("n,m,k입력: ");
        int n = sc.nextInt(); int m = sc.nextInt(); int k = sc.nextInt();
        int[] num = new int[n];
        //숫자 n개 입력받기;
        System.out.println("Enter the numbers: ");
        for(int i=0;i<num.length;i++){
            num[i] = sc.nextInt();
        }
        //배열 num 중에서 max값 찾기
        int max=0;
        for(int i=0;i<num.length-1;i++){
            max = num[i];
            if(max<num[i+1])
                max = num[i+1];
        }
        //배열 num중에서 2번째 max값 찾기
        int max2=0;
        for(int i=0;i<num.length-1;i++){
            if(num[i]<num[i+1] && num[i+1]<max)
                max2=num[i+1];
        }
        System.out.println(max);
        System.out.println(max2);
        //m번의 덧셈 중 최대 k번의 합까지만 더하는 logic
        int count = k;int sum=0;
        while(m>0){
            while(count>0){
                sum+=max;
                count--;m--;
            }
            sum+=max2;m--;
            count=k;
        }
        System.out.println(sum);
    }
}
