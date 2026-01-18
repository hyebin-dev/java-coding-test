# 자주 쓰는 패턴 템플릿 모음

설명은 최소화하고, "복붙 가능한 템플릿" 중심으로만 기록한다.  
패턴은 내가 실제로 사용한 것만 남긴다.

---

## BFS (최단거리/레벨 탐색)
언제: 무가중치 그래프/격자에서 최단거리

템플릿:
```java
Queue<int[]> q = new ArrayDeque<>();
boolean[][] visited = new boolean[n][m];
q.add(new int[]{sx, sy});
visited[sx][sy] = true;

int dist = 0;
while (!q.isEmpty()) {
    int size = q.size();
    while (size-- > 0) {
        int[] cur = q.poll();
        int x = cur[0], y = cur[1];

        // TODO: 목표 체크

        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d], ny = y + dy[d];
            if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
            if (visited[nx][ny]) continue;
            if (!canGo(nx, ny)) continue;

            visited[nx][ny] = true; // enqueue 시점 처리
            q.add(new int[]{nx, ny});
        }
    }
    dist++;
}
```

주의:
- visited는 enqueue 시점에 처리(중복 enqueue 방지)
- 레벨(dist) 필요 없으면 dist 블록 제거

---

## DFS (백트래킹)

언제: 조합/순열/부분집합, 경로 탐색

템플릿:

```java
void dfs(int idx) {
    if (idx == n) {
        // TODO: 결과 처리
        return;
    }

    // 선택
    picked[idx] = true;
    dfs(idx + 1);

    // 미선택
    picked[idx] = false;
    dfs(idx + 1);
}
```

주의:
- 재귀 깊이 큰 문제면 iterative 고려
- 전역 상태는 되돌리기(backtrack) 누락 주의

---

## Two Pointers (투 포인터)

언제: 정렬된 배열에서 구간/합/조건 만족 최적화

템플릿:

```java
Arrays.sort(arr);
int l = 0, r = 0;
long sum = 0;

while (r < n) {
    sum += arr[r++];

    while (l < r && sum > target) {
        sum -= arr[l++];
    }

    // TODO: 조건 만족 시 답 갱신
}
```

주의:
- 단조성(정렬/조건)이 있어야 성립
- while 내부 조건(> / >=) 경계값 주의

---

## Prefix Sum (누적합)

언제: 구간합을 여러 번 빠르게 구할 때

템플릿:

```java
long[] ps = new long[n + 1];
for (int i = 1; i <= n; i++) {
    ps[i] = ps[i - 1] + arr[i - 1];
}
// [l, r] (0-index) 구간합:
long rangeSum = ps[r + 1] - ps[l];
```

주의:
- 인덱스 정책(0/1-index) 고정
- long 사용 추천

---

## Binary Search (이분탐색, 답 탐색)

언제: "가능/불가능"이 단조성일 때(최솟값/최댓값 찾기)

템플릿:

```java
long lo = 0, hi = 1_000_000_000L;
long ans = hi;

while (lo <= hi) {
    long mid = (lo + hi) / 2;
    if (check(mid)) {
        ans = mid;
        hi = mid - 1;
    } else {
        lo = mid + 1;
    }
}
```

주의:
- check(mid)의 단조성 검증이 핵심
- lo/hi 초기값은 문제 정의로부터

---

## Dijkstra (가중치 최단거리, 음수 X)

언제: 양의 가중치 최단거리

템플릿:

```java
long INF = Long.MAX_VALUE / 4;
long[] dist = new long[n + 1];
Arrays.fill(dist, INF);
dist[start] = 0;

PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[1]));
pq.add(new long[]{start, 0});

while (!pq.isEmpty()) {
    long[] cur = pq.poll();
    int v = (int) cur[0];
    long d = cur[1];
    if (d != dist[v]) continue;

    for (Edge e : graph[v]) {
        if (dist[e.to] > d + e.w) {
            dist[e.to] = d + e.w;
            pq.add(new long[]{e.to, dist[e.to]});
        }
    }
}
```

주의:
- 음수 가중치 있으면 사용 금지
- (d != dist[v]) 스킵 필수

---

## Union-Find (DSU)

언제: 연결성/사이클/그룹 관리

템플릿:

```java
int find(int x) {
    if (parent[x] == x) return x;
    return parent[x] = find(parent[x]);
}

boolean union(int a, int b) {
    a = find(a); b = find(b);
    if (a == b) return false;
    parent[b] = a; // rank/size 최적화는 필요 시 추가
    return true;
}
```

주의:

- parent 초기화 필수(parent[i]=i)
- 크면 rank/size로 union 최적화