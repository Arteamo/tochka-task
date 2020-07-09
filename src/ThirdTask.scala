import scala.io.StdIn

object ThirdTask extends App {
  val commonPart = "[a-zA-Z0-9_-]+"
  val emailRegex = s"$commonPart@$commonPart\\.$commonPart"
  println(StdIn.readLine().matches(emailRegex))
}
