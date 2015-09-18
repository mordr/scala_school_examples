object ScalaSchool {

    def fib: Stream[Int] = {
        0  #:: fib.scanLeft(1){(m,n) => m + n}
    }

    def isPalindrome(text: String): Boolean = {
        val perms = text.permutations.toArray
        val palindromes = perms.filter(e => (e == e.reverse)).length
        palindromes > 0
    }

    def main(args: Array[String]): Unit = {
        println("-Q1-")
        var sum = fib.take(50).filter(e => (e  % 2 == 0 && e < 4000000)).foldLeft(0)(_ + _)
        println(sum)

        println("-Q2-")
        var text = "civic"
        println(text + " -> " + isPalindrome(text))
        text = "ivicc"
        println(text + " -> " + isPalindrome(text))
        text = "civil"
        println(text + " -> " + isPalindrome(text))
        text = "livci"
        println(text + " -> " + isPalindrome(text))
    }
}
