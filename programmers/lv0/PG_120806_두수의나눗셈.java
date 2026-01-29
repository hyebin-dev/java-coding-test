/*
[문제명] : 두 수의 나눗셈
[레벨] : lv0
[링크] : https://school.programmers.co.kr/learn/courses/30/lessons/120806

[Key] : Arithmetic
[Complexity] : Time O(1) / Memory O(1)
[Pitfall] : 정수 나눗셈(소수점 버림) → (num1*1000)/num2로 처리
[Tags] : math, implementation
*/
class Solution {
    public int solution(int num1, int num2) {
        return (num1 * 1000) / num2;
    }
}
