package Algorithm;
import java.util.*;

public class Page099 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count=0;
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the k: ");
        int k=sc.nextInt();
        
        System.out.println(num);
        System.out.println(k);
        while(true){
            if(num%k==0){
                num=num/k;
                count+=1;
            }
            else{
                num--;
                count+=1;
            }
            if(num==1)
                break;
        }
        System.out.println(count);
    }
}
