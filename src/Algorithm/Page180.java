package Algorithm;

import java.util.*;

public class Page180 {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String[] name_list = new String[n];
        int[] grade_list = new int[n];
        String str= "";
        int grade = 0;
        for(int i=0;i<n;i++){
            str = sc.next();
            grade = sc.nextInt();
            name_list[i]= str;
            grade_list[i] = grade;
            sc.nextLine();
        }

        for(int i=0;i<grade_list.length;i++){
            for(int j=0;j<grade_list.length-i-1;j++){
                if(grade_list[j]>grade_list[j+1]){
                    int temp = grade_list[j+1];
                    grade_list[j+1] = grade_list[j];
                    grade_list[j]=temp;

                    String temp2 = name_list[j+1];
                    name_list[j+1] = name_list[j];
                    name_list[j]=temp2;
                }
            }
        }

        for(int i=0;i<name_list.length;i++){
            System.out.print(name_list[i]+" ");
        }
    }
}
