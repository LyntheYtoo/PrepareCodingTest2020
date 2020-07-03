package baekjoon

/*
 최소, 최대 https://www.acmicpc.net/problem/10818

문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 */

fun main() {
    // 정수의 개수 입력
    val numOfInteger = readLine()?.toInt() ?: 0
    // 비교할 정수들 입력 (공백으로 구분)
    val tempStrList = readLine()?.split(' ') ?: mutableListOf()

    // 비교 정수 배열 문자열 -> 정수 변환
    val compIntegers = tempStrList.map { it.toInt() }

    // 출력
    print("${compIntegers.min()} ${compIntegers.max()}")
}