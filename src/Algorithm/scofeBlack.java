package Algorithm;
import java.util.Arrays;
import java.util.Scanner;

public class scofeBlack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k = sc.nextInt();
        int[] num = new int[n];

        //num배열 설정
        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }
        sc.nextLine();
        int[] temp = new int[k];
        for(int i =0; i<num.length;i+=(k-1)){
            for(int j=0;j<=k;j++){
                temp[j]=num[j];
            }
            Arrays.sort(temp);
            int min = temp[0];
            for(int l=0;l<=k;l++){
                temp[l]= min;
            }
        }
    }
}
