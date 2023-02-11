package this_codingtest.chap05_dfs_bfs.q01_음료수얼려먹기;

import java.io.*;
import java.util.*;

public class Five_1 {
    static int[] dx = {0, 1, 0, -1};//오, 아래, 왼, 위
    static int[] dy = {1, 0, -1, 0};
    static int w = 0;
    static int h = 0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        h = Integer.parseInt(arr[0]);
        w = Integer.parseInt(arr[1]);

        int[][] map = new int[h][w];

        for(int i=0 ; i<h ; i++){
            map[i]=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
//        for(int i=0; i<h ;i++){
//            for(int j=0 ; j<w ; j++){
//                System.out.print(map[i][j]);
//            }
//            System.out.println();
//        }
        System.out.println(solution(map));

    }
    static int solution(int[][] map){
        int result=0;
        for(int i=0 ; i<h ;i++){
            for(int j =0; j<w ;j++){
                if(dfs(map,i,j)){
                    result+=1;
                }
            }
        }
        return result;
    }

    static boolean dfs(int[][] map, int x, int y){ // 방문한 곳을 다시 방문할 일이 없기 때문에 지도는 한개로 충분
        if(x<0 || x>=h || y<0 || y>=w){
            return false;
        }
        if(map[x][y]==0){
            map[x][y]=1;
            for(int i=0 ;i<4 ; i++){
                dfs(map, x+dx[i], y+dy[i]);
            }
            return true;
        }
        return false;
    }
}
