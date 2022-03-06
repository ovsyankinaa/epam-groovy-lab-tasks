/**
Return n-th element of Fibonacci's sequence
(https://en.wikipedia.org/wiki/Fibonacci_number). Example:
Task04.fib(4) == 3
*/

package groovylab

class Task04 {
    public static int fib(int n) {
        def array = [0,1]
        int count = 2
        while(count <= n) {
            array.add(array[count-2]+array[count-1])
            count++
        }
        return array[n]
    }
}
