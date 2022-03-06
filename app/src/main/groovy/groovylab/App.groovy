package groovylab

class App {
    static void main(String[] args) {
        println Task01.sum(1,4)
        println Task02.mulEvenOdd([4,5,6])
        println Task03.isSublist([1,2,3], [2,3])
        println Task04.fib(4)
        println Task05.isIp("10.0.152.164").toString()       
        println Task06.adults([Kate: 24, Alan:16, Osvald: 18]).toMapString()
        println Task07.encryptThis("Hello")
        println Task07.encryptThis("hello world")
        println Task08.parseAndFilterJson("{\"Kate\":18,\"Alan\":16,\"Osvald\":27}")
        println Task09.exec("date")
        println Task10.urlText("http://httpstat.us/200")
        println Task11.gstring("test", 2)
        println TaskCalculator.exec("6(3+1)")
        println TaskCalculator.exec("1+9/3")
    }
}
