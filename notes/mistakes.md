# 자주 틀리는 포인트(오답노트)

오답 노트는 "감정"이 아니라 "재발 방지 규칙"만 적는다.  
한 문제당 5줄 이내로 유지한다.

---

## 기록 템플릿(고정)
- 날짜:
- 문제ID:
- 링크:
- 원인(한 줄):
- 방지 규칙(한 줄):
- Tags: (2~4개)  

---

## 자주 터지는 실수 예시(참고용)
- 원인: visited를 큐에서 뺄 때 처리해서 중복 enqueue가 폭발
  방지: BFS는 enqueue 시점에 visited=true로 고정
  Tags: bfs, visited, queue

- 원인: 누적합이 int 범위를 넘어 오버플로우 발생
  방지: 합/곱/거리 누적은 long 기본, 곱셈은 (long)a*b로 캐스팅 먼저
  Tags: overflow, long

- 원인: 1-index 입력인데 배열을 0-index로 써서 마지막 원소 누락
  방지: 인덱스 정책을 파일 상단에 고정(입력 1-index면 배열도 1-index)
  Tags: index, boundary

