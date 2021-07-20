package Algorithm;

import java.util.Scanner;

public class iceice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sight = sc.nextInt(); //초기 바라보는 방향

        int[][] map = new int [n][m];
        int count = 1; //이동한 칸 수
        int rotate = 0; // 회전한 횟수

        //map 생성
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt(); //
            }
        }
        sc.close();
        //입력종료

        /*for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }*/

        while(true) {
            sight += 1;
            sight = sight % 4;

            //case1
            if(sight == 0) {
                rotate += 1;
                if(x >= 0 && y >=0 && map[x][y-1] == 0) {
                    map[x][y] = 2;
                    rotate = 0;
                    y -= 1;
                    count += 1;
                    continue;
                }

            }
            //case2
            else if (sight == 1) {
                if(x >= 0 && y >=0 && map[x+1][y] == 0) {
                    map[x][y] = 2;
                    rotate = 0;
                    x += 1;
                    count += 1;
                    continue;
                }
            }
            //case
            else if (sight == 2) {
                if(x >= 0 && y >=0 && map[x][y+1] == 0) {
                    map[x][y] = 2;
                    rotate = 0;
                    y += 1;
                    count += 1;
                    continue;
                }
            }
            //case4
            else if(sight == 3) {
                if(x >= 0 && y >=0 && map[x-1][y] == 0) {
                    map[x][y] = 2;
                    rotate = 0;
                    x -= 1;
                    count += 1;
                    continue;
                }
            }


            //2. 네 방향을 봤을 때  1로 둘러싸여 있거나 2(0이지만 이미 가본 곳)인 곳인 경우
            if(rotate == 4 && map[x][y] != 0) {
                //case1
                if(sight == 0) {
                    //뒤로 이동했을 때 바다라면
                    if(map[x][y-1] == 1) {
                        break;
                    }
                    else {
                        y -= 1; //뒤로 한칸 이동
                        rotate = 0;
                    }
                }
                //case2
                if(sight == 1) {
                    //뒤로 이동했을 때 바다라면
                    if(map[x+1][y] == 1) {
                        break;
                    }
                    else {
                        x += 1; //뒤로 한칸 이동
                        rotate = 0;
                    }
                }
                //case3
                if(sight == 2) {
                    //뒤로 이동했을 때 바다라면
                    if(map[x][y+1] == 1) {
                        break;
                    }
                    else {
                        y += 1; //뒤로 한칸 이동
                        rotate = 0;
                    }
                }
                //case4
                if(sight == 3) {
                    //뒤로 이동했을 때 바다라면
                    if(map[x-1][y] == 1) {
                        break;
                    }
                    else {
                        x -= 1; //뒤로 한칸 이동
                        rotate = 0;
                    }
                }
            }


        }

        System.out.println(count);
    }
}
