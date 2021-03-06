package Algorithm;
import java.util.*;

public class Combination {
    private String[] arr;
    private Stack<String> st;
    public Combination(String[] arr){
        this.arr = arr;
        st = new Stack<String>();
    }
    public void showStack(){
        for(int i=0; i<st.size();i++){
            System.out.print(st.get(i)+" ");
        }
        System.out.println("");
    }
    public void doCombination(int n, int r, int index){
        if(r==0){
            showStack();
            return;
        }
        else if(n==r){
            for(int i=0;i<n;i++)
                st.add(arr[index+i]);
            showStack();
            for(int i=0;i<n;i++)
                st.pop();
        }
        else{
            st.add(arr[index]);
            doCombination(n-1,r-1,index+1);

            st.pop();
            doCombination(n-1,r,index+1);
        }
    }
    public static void main(String[] args){
        String[] a = {"A","B","C","D"};
        Combination c = new Combination(a);
        c.doCombination(4,2,0);
    }
}
