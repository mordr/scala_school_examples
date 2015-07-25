import scala.collection.mutable.Map

object ScalaSchool {

    // 1
    def printArray(array: Array[Int]): Unit = {
        println("original array: " + array.mkString(" "))

        val deDupArray = array.distinct
        println("de dup array: " + deDupArray.mkString(" "))
    }

    // 2
    def wordCount(fileName: String): Map[String, Int] = {
        // val map = Map.empty[String,Int]
        val map = 
        scala.io.Source.fromFile(fileName)
        .getLines
        .flatMap(_.split("\\W+"))
        .foldLeft(Map.empty[String, Int]) {
        	(accMap, word) => accMap += (word -> (accMap.getOrElse(word,0) + 1))
        }
        // .foreach {
        // 	word => {
        // 		var count = map.getOrElse(word,0) + 1
        // 		map += (word -> count)
        // 	}
        // }
       	println("word count:\n" + map.mkString("\n"))
        map
    }

    def main(args: Array[String]): Unit = {
        println("Running...")

        println("// 1")	
        val array = Array(1,2,3,3,4,4,5,6,7,7,7,8,8,9,9)
        printArray(array)

        println("// 2")
        val wc = wordCount("wc.txt")
        println("returned wc map size: " + wc.size)

        println("...Done")
    }

}
