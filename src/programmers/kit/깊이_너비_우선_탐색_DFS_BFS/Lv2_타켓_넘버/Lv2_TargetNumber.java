package programmers.kit.깊이_너비_우선_탐색_DFS_BFS.Lv2_타켓_넘버;

public class Lv2_TargetNumber {
    int count = 0;
    int target = 0;
    int numbers[];

    public static void main(String[] args) {
        Lv2_TargetNumber targetNumber = new Lv2_TargetNumber();
        int n = targetNumber.solution(new int[]{4,1,2,1}, 4);
        System.out.println(n);
    }
    //하는중
    public int solution(int[] numbers, int target) {
        this.target = target;
        this.numbers = numbers;
        // 방법1.
//        dfs(0, 0);
//        return count;
        // 방법2.
        return dfsReturnInt(0,0);
    }

    public void dfs(int index, int sum){
        if(numbers.length == index){
            if(target == sum){
                count++;
            }
            return;
        }
        dfs(index+1, sum+numbers[index]);
        dfs(index+1, sum-numbers[index]);
    }

    public int dfsReturnInt(int index, int sum){
        if(numbers.length == index){
            if(target == sum){
                return 1;
            }
            return 0;
        }
        return dfsReturnInt(index+1, sum+numbers[index]) + dfsReturnInt(index+1, sum-numbers[index]);
    }
}
