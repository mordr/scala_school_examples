object ScalaSchool {

    def fib: Stream[Int] = {
        0  #:: fib.scanLeft(1){(m,n) => m + n}
    }

    def pairs(lst: List[Int]): List[(Int, Int)] = {
        lst.flatMap(e => lst.map((e, _))) 
    }

    def tuplePair(lst: List[(Int, Int)]): List[((Int, Int),(Int, Int))] = {
        lst.flatMap(e => lst.map((e, _)))
    }

    def main(args: Array[String]): Unit = {
        val numbers = List(1,2,3,4)
        val tupleList = List((1,0),(0,1),(1,1),(0,0))

        println("-fib-")
        fib.take(10).foreach(e => println(e))    
    
        println("-pairs-")
        println("numbers " + numbers)
        val tuples = pairs(numbers)
        println(tuples)
    
        println("-tuple pairs-")
        println("tuple list " + tupleList)
        val tuplesPair = tuplePair(tupleList)
        println(tuplesPair)
    }

}
