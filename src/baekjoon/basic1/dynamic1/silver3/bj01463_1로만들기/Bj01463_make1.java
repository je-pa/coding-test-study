package baekjoon.basic1.dynamic1.silver3.bj01463_1로만들기;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj01463_make1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(make1_4(N,0));
    }

    public static int make1(int n, int count){// 시간초과 - 반복
        System.out.println(n+", "+count);
        int a=106, b=106, c=106;
        if(n==1){
            System.out.println("리턴");
            return count;
        }

        if(n%3 == 0){
            System.out.println(3);
            a = make1(n/3, count+1);//1
        }

        if(n%2 == 0){
            System.out.println(2);
            b = make1(n/2, count+1);
        }

        c = make1(n-1, count+1);// 2 1 // 1 2
        System.out.println(a+" " + b+ " " + c);
        return Math.min(Math.min(a,b),c);
    }
    public static int make1_2(int n, int count){ // 통과
        int a, b;
        if(n==0 || n==1){
            return count;
        }
        a = make1_2(n/3, count+1 + n%3);

        b = make1_2(n/2, count+1+ n%2);

        return Math.min(a,b);
    }

    public static int make1_3(int n, int count){// 시간초과 - 반복
        int a=106, b=106, c=106;
        if(n==1){
            return count;
        }

        if(n%3 == 0){
            a = Math.min(make1_3(n/3, count+1), make1_3(n-1, count+1));//1
        }

        if(n%2 == 0){
            b = Math.min(make1_3(n/2, count+1),make1_3(n-1,count+1));
        }else if(n%3 != 0){
            c = make1_3(n-1, count+1);// 2 1 // 1 2
        }

        return Math.min(Math.min(a,b),c);
    }

    public static int make1_4(int n, int count){// 시간초과 - 반복
        int a=106, b=106, c=106, d=106;
        if(n==1){
            return count;
        }
        if(n%6 == 0){
            d = Math.min(make1_4(n-1,count+1),Math.min(make1_4(n/3, count+1),make1_4(n/2, count+1)));
        }else if(n%3 == 0){
            a = Math.min(make1_4(n/3, count+1), make1_4(n-1, count+1));//1
        }else if(n%2 == 0){
            b = Math.min(make1_4(n/2, count+1),make1_4(n-1,count+1));
        }else {
            c = make1_4(n-1, count+1);// 2 1 // 1 2
        }

        return Math.min(Math.min(a,b),Math.min(c,d));
    }
}
