/*
[문제명] : 숫자 비교하기
[레벨] : lv0
[링크] : https://school.programmers.co.kr/learn/courses/30/lessons/120807

[Key] : Compare
[Complexity] : Time O(1) / Memory O(1)
[Pitfall] : 없음(같으면 1, 다르면 -1)
[Tags] : compare, implementation
*/
class Solution {
    public int solution(int num1, int num2) {
        return (num1 == num2) ? 1 : -1;
    }
}
