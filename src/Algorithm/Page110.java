package Algorithm;
import java.util.*;

public class Page110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int pox = 1;
        int poy = 1;
        sc.nextLine();
        String str = sc.nextLine();
        String[] dir = str.split(" ");
        for(String s:dir){
            switch(s){
                case "R":
                    if(poy<num)
                        poy+=1;
                    break;
                case "L":
                    if(poy>1)
                        poy-=1;
                    break;
                case "U":
                    if(pox>1)
                        pox-=1;
                    break;
                case "D":
                    if(poy<num)
                        pox+=1;
                    break;
            }
        }
        System.out.printf("%d %d \n",pox,poy);

    }

}
