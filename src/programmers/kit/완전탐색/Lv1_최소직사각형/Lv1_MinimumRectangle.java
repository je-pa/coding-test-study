package programmers.kit.완전탐색.Lv1_최소직사각형;

public class Lv1_MinimumRectangle {
    public static void main(String[] args) {
        Lv1_MinimumRectangle minimumRectangle = new Lv1_MinimumRectangle();
        System.out.println(minimumRectangle.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
    }

    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;

        for(int[] rectangle : sizes){
            if(rectangle[0] > rectangle[1]){
                width = Math.max(rectangle[0], width);
                height = Math.max(rectangle[1], height);
            }else{
                width = Math.max(rectangle[1], width);
                height = Math.max(rectangle[0], height);
            }

        }
        return width * height;
    }
}
