package week4

object NthList {
  def main(args: Array[String]) {
    nth(2, list)
    nth(-1, list)
    nth(4, list)
  }

  def nth[T](n: Int, xs: ScalaList[T]): T = {
    if (xs.isEmpty) {
      throw new IndexOutOfBoundsException
    }

    if (n == 0) xs.head
    else nth(n - 1, xs.tail)
  }

  val list = new Cons(1, new Cons(2, new Cons(3, Nil)))
}
