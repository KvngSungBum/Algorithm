package Algorithm;

import java.util.*;

class Information{
    String content;
    double preference;
    int coordinateX;
    int coordinateY;
    String watched;
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
            sc.nextLine();
        }
        String[][] contents = new String[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                contents[i][j] = sc.next();
            }
            sc.nextLine();
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
        //arr내 객체 분류
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).watched.equals("Y"))
                arrY.add(arr.get(i));
            else if(arr.get(i).watched.equals("O"))
                arrO.add(arr.get(i));
        }
        orderByPreference(arrY);
        orderByPreference(arrO);

        printOutInfo(arrY);
        printOutInfo(arrO);

    }
    public static void orderByPreference(ArrayList<Information> info){
        for(int i=0;i<info.size();i++){
            for(int j=0;j<info.size()-i-1;j++){
                if(info.get(j).preference>info.get(j+1).preference){
                    Collections.swap(info,j,j+1);
                }
            }
        }
    }
    public static void printOutInfo(ArrayList<Information> info){
        for(int i=info.size()-1;i>=0;i--){
            System.out.print(info.get(i).content + " "+info.get(i).preference+" "+info.get(i).coordinateX+" "+info.get(i).coordinateY);
            System.out.println();
        }
    }
}
