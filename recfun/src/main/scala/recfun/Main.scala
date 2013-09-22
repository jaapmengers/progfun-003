package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c < 1 || r < 1 || c == r) {
      return 1
    }
    pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balancePortion(chars: List[Char], stackCount: Int): Boolean = {
      if (chars.isEmpty) {
        return stackCount == 0
      }

      var delta = 0
      if (chars.head == '(' && stackCount >= 0) {
        delta = 1
      }
      if (chars.head == ')')  {
        delta = -1
      }

      return balancePortion(chars.tail, stackCount + delta)
    }

    balancePortion(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
