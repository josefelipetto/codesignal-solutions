def firstDuplicate(a: Array[Int]): Int = {

    @scala.annotation.tailrec
    def analyse(seen: Array[Int], originalArray: Array[Int], k: Int) : Int = {

      if (k >= originalArray.length) return -1

      if (seen(originalArray(k)) == 1)
        originalArray(k)
      else  {
        seen(originalArray(k)) = 1
        analyse(seen, originalArray, k + 1)
      }
    }

    val seen: Array[Int] = Array.fill(a.length + 1)(0)

    analyse(seen, a, 0)
}
