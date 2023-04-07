package this_codingtest.chap13_dfs_bfs.q17_경쟁적전염;

import java.util.*;
import java.io.*;
class Virus2 implements Comparable<Virus2>{
    int index;
    int s;
    int x;
    int y;
    public Virus2(int index, int s, int x, int y){
        this.index = index;
        this.x=x;
        this.y=y;
        this.s=s;
    }

    int getIndex(){
        return this.index;
    }
    int getS(){
        return this.s;
    }
    int getX(){
        return this.x;
    }
    int getY(){
        return this.y;
    }

    public int compareTo(Virus2 o) {
        if(this.index <= o.index) return -1;
        return 1;
    }
}

public class q17 {
    static int n, k;
    static int[][] map = new int[200][200];


    static int s, x, y;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        n = Integer.parseInt(nk[0]);
        k = Integer.parseInt(nk[1]);

        ArrayList<Virus2> virus2ArraysList = new ArrayList<>();

        for(int i=0; i<n; i++){
            map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int j =0 ; j<n ; j++){
                if(map[i][j] != 0){
                    virus2ArraysList.add(new Virus2(map[i][j],0,i,j));
                }
            }
        }
        Collections.sort(virus2ArraysList);

        String[] sxy = br.readLine().split(" ");
        s = Integer.parseInt(nk[0]);
        x = Integer.parseInt(nk[1]);
        y = Integer.parseInt(nk[1]);

        Queue<Virus2> q = new LinkedList<>();

        for(int i=0;i<virus2ArraysList.size();i++){
            q.add(virus2ArraysList.get(i));
        }

    }



}
