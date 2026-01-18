# java-coding-test

프로그래머스 Java 코딩테스트 풀이 기록 레포지토리입니다.
정답 코드(programmers)와 학습 엔진(notes)을 분리해서 운영합니다.

## 폴더 역할(고정)

- programmers/ : 정답 코드(.java)만 저장
- templates/   : 문제 풀이 시작 템플릿(복붙해서 사용)
- notes/       : 패턴/오답/제출 체크리스트/템플릿 변경 로그

## 파일명 규칙(고정)

- PG_<문제번호>_<문제이름>.java
- (1)(2) 같은 괄호 표기는 금지하고 _1, _2로 통일

## 문제 1개 저장 절차(고정)

1) programmers/lvX/에 새 파일 생성
2) templates/MainTemplate.java 복붙
3) 파일 상단 헤더 5줄만 작성
4) 풀이 작성 → 통과 확인
5) 틀렸거나 오래 걸리면 notes에 반영
6) 문제 단위로 커밋/푸시

## 커밋 메시지 규칙(고정)

- solve(pg): lv2 PG_42586 stack-queue
- notes: add bfs checklist
- templates: improve java io template
