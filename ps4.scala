object ScalaSchool {

    def fib: Stream[Int] = {
        0  #:: fib.scanLeft(1){(m,n) => m + n}
    }

    def main(args: Array[String]): Unit = {
        println("-Q1-")
        var sum = fib.take(50).filter(e => (e  % 2 == 0 && e < 4000000)).foldLeft(0)(_ + _)
        println(sum)
    }
}
