// 파일 상단 주석 템플릿
/*
[문제명] :
[레벨] :
[링크] :

[Key] : (핵심 알고리즘/자료구조 2~4개) 예) BFS, Queue, Graph
[Complexity] : Time O(?) / Memory O(?)
[Pitfall] : (내가 조심할 포인트 1개) 예) 방문 처리 시점, 경계 체크
[Tags] : (2~4개) 예) bfs, graph, queue
*/

import java.io.*;
import java.util.*;

public class Main {
    // 빠른 입력: BufferedReader + StringTokenizer
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    private static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            String line = br.readLine();
            if (line == null) return null;
            st = new StringTokenizer(line);
        }
        return st.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    private static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static void main(String[] args) throws Exception {
        // 프로그래머스는 보통 main이 필요 없지만,
        // 로컬 테스트/BOJ 확장까지 고려해 템플릿은 main 기반으로 고정한다.
        //
        // TODO: 입력이 없는 프로그래머스 문제면, solve()만 작성하고 main은 간단 테스트용으로 사용.
        solve();
    }

    private static void solve() throws Exception {
        // TODO: 여기에 풀이 작성
        // 예) int n = nextInt();
        // 예) System.out.println(answer);

        // placeholder
        // System.out.println("TODO");
    }
}
