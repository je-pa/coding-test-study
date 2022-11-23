package programmers.kit.깊이_너비_우선_탐색_DFS_BFS.Lv2_게임_맵_최단거리;

import java.util.*;
import java.io.*;

public class Lv2_게임_맵_최단거리 {
    public static void main(String[] args) {
        Lv2_게임_맵_최단거리 game = new Lv2_게임_맵_최단거리();
        int n = game.solution(new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}});
        System.out.println(n);
    }

    public int solution(int[][] maps) {
        int answer = 0;
        int[][] visited = new int[maps.length][maps[0].length];

        bfs(maps, visited);

        answer = visited[maps.length-1][maps[0].length-1];
        return answer == 0 ? -1 : answer;
    }
    public void bfs(int[][] maps, int[][] visited){
//        int x = 0 , y = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        visited[0][0] =1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});

        while (!queue.isEmpty()){
            int[] current = queue.remove();
            int cx = current[0];
            int cy = current[1];

            for(int i=0 ; i<4 ; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx<0 || nx > maps.length-1 || ny<0 || ny>maps[0].length-1){
                    continue;
                }
                if(visited[nx][ny] == 0 && maps[nx][ny]== 1){
                    visited[nx][ny] = visited[cx][cy] + 1;
                    queue.add(new int[]{nx,ny});
                }
            }
        }

    }
}
