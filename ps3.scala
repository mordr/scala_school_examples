import scala.collection.immutable.Stream

object ScalaSchool {

    def fib: Stream[Int] = {
        0  #:: fib.scanLeft(1){(m,n) => m + n}
    }

    def pairs(lst: List[Int]): List[(Int, Int)] = {
        lst.flatMap(e => lst.map((e, _))) 
    }

    def main(args: Array[String]): Unit = {
        val numbers = List(1,2,3,4)
    
        println("-fib-")
        fib.take(10).foreach(e => println(e))    
    
        println("-pairs-")
        println("numbers " + numbers)
        val tuples = pairs(numbers)
        println(tuples)
    }

}
