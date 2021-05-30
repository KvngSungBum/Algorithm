package Algorithm;

import java.util.*;

public class scofeSight {
    static int n,m;
    public static void main(String[] args){
        //입력부
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();//가로 j
        n = sc.nextInt();//세로 i
        String[][] map = new String[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                map[n][m] = sc.next();
            }
        }
        sc.close();
        //입력부 종료
        /*for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }*/
        //int[][] newMap = convertingMap(map);

        /*for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(newMap[i][j]+" ");
            }
            System.out.println();
        }*/
    }

    static int[][] convertingMap(String[][] arr){
        int[][] numMap = new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                if (arr[i][j].equals("c")){
                    arr[i][j].replace("c", "1");
                    numMap[i][j] = Integer.parseInt(arr[i][j]);
                }
                else if(arr[i][j].equals("x")){
                    arr[i][j].replace("x","0");
                    numMap[i][j] = Integer.parseInt(arr[i][j]);
                }else {
                    arr[i][j].replace(".", "2");
                    numMap[i][j] = Integer.parseInt(arr[i][j]);
                }
            }
        }
        return numMap;
    }
}
