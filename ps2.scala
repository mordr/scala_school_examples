import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Map

object ScalaSchool {

    def readCsv(fileName: String): List[(String, String)] = {
        val list = new ListBuffer[(String, String)]()
        scala.io.Source.fromFile(fileName).getLines
        .foreach((line: String) => {
            val tmp = line.split(",");
            val pair = (tmp(0), tmp(1));
            list += pair 
        })
        println("readCsv")
        println(list.toList)
        list.toList 
    }

    def sim(data: List[(String, String)]): List[(String, String)] = {
        println("sim")
        val list = new ListBuffer[(String, String)]()
        var i = 0
        var size = data.length
        for (i <- 0 until size) {
            for (j <- (i + 1) until size) {
                var tuple1 = data(i)
                var tuple2 = data(j)
                var w = 0
                var x = 0
                if (tuple1._1 == tuple2._1) {
                    w = 1
                }
                if (tuple1._2 == tuple2._2) {
                    x = 1   
                }
                val pair = (w.toString, x.toString)
                println(pair + "// " + tuple1 + " -> " +  tuple2)
                list += pair
            }
        }
        list.toList
    }

    def main(args: Array[String]): Unit = {
        val fileName = "ps2.csv"
        
        val data: List[(String, String)] = readCsv(fileName) 
        val simData = sim(data)
    }

}
