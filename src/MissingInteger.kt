/*Write a function:
fun solution(A: IntArray): Int
that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.
Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].*/

fun main() {

    println("Input: 1, 2 -> Result: " + solution(intArrayOf(1, 2)))
    println("Input: 1, 3, 6, 4, 1, 2 -> Result: " + solution(intArrayOf(1, 3, 6, 4, 1, 2)))
    println("Input: −1, −3 -> Result: " + solution(intArrayOf(-1, -3)))
}

fun solution(A: IntArray): Int {
    var solution = 1
    var map: MutableMap<Int, Boolean> = mutableMapOf<Int, Boolean>()
    A.forEach { elem ->
        map.put(elem, true)
        if (elem == solution) {
            while (map.containsKey(solution)) {
                solution++
            }
        }
    }
    return solution
}