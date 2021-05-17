package Algorithm;

import java.util.*;

class Information{
    String content;
    double preference;
    int coordinateX;
    int coordinateY;
    String watched;

    Information(){};
}

public class scofeContents {
    public static void main(String[] args){
        ArrayList<Information> arr = new ArrayList<>();//전체 information
        ArrayList<Information> arrY = new ArrayList<>();
        ArrayList<Information> arrO = new ArrayList<>();
        //입력 시작
        Scanner sc= new Scanner(System.in);
        //A~E까지의 선호도
        double[] pref = new double[5];

        for(int i=0;i<5;i++){
            pref[i]=sc.nextDouble();
        }
        sc.nextLine();
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        String[][] status = new String[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                status[i][j] = sc.next();
            }
        }
        String[][] contents = new String[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                contents[i][j] = sc.next();
            }
        }
        sc.close();
        //입력 끝

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                Information info = new Information();
                info.content = contents[i][j];
                info.watched = status[i][j];
                if(info.content.equals("A"))
                    info.preference = pref[0];
                else if(info.content.equals("B"))
                    info.preference = pref[1];
                else if(info.content.equals("C"))
                    info.preference = pref[2];
                else if(info.content.equals("D"))
                    info.preference = pref[3];
                else if(info.content.equals("E"))
                    info.preference = pref[4];
                info.coordinateX =i;
                info.coordinateY =j;
                arr.add(info);
            }
        }
        /*for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i).content + " "+arr.get(i).preference+" "+arr.get(i).coordinateX+" "+arr.get(i).coordinateY);
            System.out.println();
        }*/
        //arr내 객체 분류
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).watched.equals("Y"))
                arrY.add(arr.get(i));
            else if(arr.get(i).watched.equals("O"))
                arrO.add(arr.get(i));
        }

        for(int i=0;i<arrY.size();i++){
            for(int j=0;j<arrY.size()-i-1;j++){
                if(arrY.get(j).preference>arrY.get(j+1).preference){
                    Collections.swap(arrY,j,j+1);
                }
            }
        }
        for(int i=0;i<arrO.size();i++){
            for(int j=0;j<arrO.size()-i-1;j++){
                if(arrO.get(j).preference>arrO.get(j+1).preference){
                    Collections.swap(arrO,j,j+1);
                }
            }
        }
        for(int i=arrY.size()-1;i>=0;i--){
            System.out.print(arrY.get(i).content + " "+arrY.get(i).preference+" "+arrY.get(i).coordinateX+" "+arrY.get(i).coordinateY);
            System.out.println();
        }
        for(int i=arrO.size()-1;i>=0;i--){
            System.out.print(arrO.get(i).content + " "+arrO.get(i).preference+" "+arrO.get(i).coordinateX+" "+arrO.get(i).coordinateY);
            System.out.println();
        }
    }
}
