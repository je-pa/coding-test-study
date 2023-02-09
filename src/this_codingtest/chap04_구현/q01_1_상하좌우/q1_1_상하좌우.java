package this_codingtest.chap04_구현.q01_1_상하좌우;

import java.util.Arrays;

public class q1_1_상하좌우 {
    public static void main(String[] args) {
        String str = "5\n" + //N,M
                "R R R U D D";
        System.out.println(solution(str));//3 4
        System.out.println(bookAnswer(str));//3 4
    }

    public static String solution(String str){
        StringBuffer sb = new StringBuffer();

        String[] arr = str.split("\n");
        int N = Integer.parseInt(arr[0]);

        String[] plans = arr[1].split(" ");

        int x = 1, y = 1, toX=1, toY=1;
        for (String plan : plans){
            switch (plan){
                case "R":
                    toY=y+1;
                    break;
                case  "L":
                    toY=y-1;
                    break;
                case "U":
                    toX=x-1;
                    break;
                case "D":
                    toX=x+1;
                    break;
            }
            if(toY<1 || toX<1 || toY>N || toX>N){
                continue;
            }
            y=toY;
            x=toX;
        }

        return sb.append(x).append(" ").append(y).toString();
    }

    public static String bookAnswer(String str){
        StringBuffer sb = new StringBuffer();

        String[] arr = str.split("\n");
        int N = Integer.parseInt(arr[0]);

        String[] plans = arr[1].split(" ");

        int x = 1, y = 1;
        String[] moveType = "L R U D".split(" ");
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        for (String plan : plans){
            // 이동 후 좌표
            int toX=1, toY=1;
            for(int i = 0 ; i < moveType.length ; i++){
                if(plan.equals(moveType[i])){
                    toX = x+dx[i];
                    toY = y+dy[i];
                }
            }
            // 무시
            if(toY<1 || toX<1 || toY>N || toX>N){
                continue;
            }
            // 이동
            y=toY;
            x=toX;
        }

        return sb.append(x).append(" ").append(y).toString();
    }
}
