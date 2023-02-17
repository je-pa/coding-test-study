package this_codingtest.chap05_dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class DfsAndBfs {
    //오 아래 왼 위
    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) {
        
    }
    
    void dfs(boolean[][] map, int[] current, boolean[][] visited){//넣고 인접이 없으면 뺀다
        //방문처리
        visited[current[0]][current[1]] = true;
        System.out.println(current[0]+" "+ current[1]);
        for(int i=0 ; i<4 ; i++){//인접이 있다면
            if(current[0]+dx[i] >= 0
            && current[1] + dy[i] >= 0
            && current[0] + dx[i] < map.length
            && current[1] + dy[i] > map[0].length
            && map[current[0] + dx[i]][current[1] + dx[i]]
            && visited[current[0] + dx[i]][current[1] + dx[i]]){
                int[] xy = new int[2];
                xy[0] = current[0] + dx[i];
                xy[1] = current[1] + dx[i];
                dfs(map, current, visited);
            }
        }
    }

    void bfs(boolean[][] map, int[] start, boolean[][] visited){//빼고 인접이 없으면 뺀다
        Queue<int[]> queue = new LinkedList();
        int[] current;
                queue.add(start);
        visited[start[0]][start[1]] = true;
        while(!queue.isEmpty()){
            current = queue.remove();
            System.out.println(current[0]+" "+current[1]);
            for(int i =0 ; i<4 ; i++){
                if(current[0] + dx[i] >= 0
                && current[1] + dy[i] >= 0
                && current[0] + dx[i] < map.length
                && current[1] + dy[i] > map[0].length
                && map[current[0] + dx[i]][current[1] + dx[i]]
                && !visited[current[0] + dx[i]][current[1] + dx[i]]){
                    int[] xy = new int[2];
                    xy[0] = current[0]+dx[i];
                    xy[1] = current[1]+dy[i];
                    queue.add(xy);
                }
            }
        }
    }
}
