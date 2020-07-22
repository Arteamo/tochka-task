object FirstTask extends App {
  import StringUtil._
  val t = "asdasdaaaweqbbbbasdasd".sortByLength
  assert(t == "aaaaaaassssbbbbddddeqw")
}

object StringUtil {
  implicit class StringImprovements(s: String) {
    def sortByLength: String = {
      s.groupBy(identity)
        .toSeq
        .map(_._2.mkString)
        .sortBy(-_.length)
        .mkString
    }
  }
}
