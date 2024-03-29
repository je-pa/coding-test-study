# 1이 될 때까지
N이 1이 될 때 까지 두 방법 중 하나를 반복하여 할 수 있다.

1. N에서 1을 뺀다
2. N을 K로 나눈다.(N이 K로 나누어 떨어질 때만 가능)

N과 K가 주어졌을 때, N을 1로 만드는 최소 수행 횟수를 구하라.

## 조건
- 입력 조건
    - 첫째 줄: `N K`
        - N: 자연수 (2 <= N <= 100,000)
        - K: 자연수(2 <= K <= 100,000)
        - N >= K
- 출력조건
    : 첫째줄 N이 1이 될 때까지 1번 혹은 2번의 과정을 수행해야 하는 횟수의 최솟값

## 예시
### 예시1
`17 4`
1. 17-1 = 16
2. 16/4 = 4
3. 4/4 = 1

답은 3

### 예시2
`25 5`

답은 2

## 설명
1. N이 K로 나누어 떨어지는 수가 될 때까지만 1씩 빼기
    ```java
    int kMultiple = (n / k) * k;
    result += (n - kMultiple);
    n = kMultiple;
    ```
    `(n / k) * k` 를 함으로써 n보다 작거나 같으면서 k배수인 수 중 제일 큰 값을 구하게 되고
    
    `result += (n - kMultiple)`는 해당 값까지 -1 씩 하면서 실행횟수를 증가시켜 주는 만큼 값을 더해준다.


2. N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
    ```java
    if (n < k) break;
    ```
    if문이 while문 처음이 아닌 -1하는 작업 후 다음에 오는 이유는 
    
    입력조건에서 `N >= K` 가 있기 때문인 것 같다.


3. K로 나누기
    ```java
    result += 1;
    n /= k;
    ```
   위에서 K배수로 만드는 작업을 했기 때문에 바로 나누기 작업을 하면된다.


4. 마지막으로 남은 수에 대하여 1씩 빼기
   
   `return result + (n - 1);`
   
    1이 될때까지 -1