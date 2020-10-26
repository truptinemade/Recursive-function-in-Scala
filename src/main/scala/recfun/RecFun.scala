package recfun

object RecFun extends RecFunInterface {

  def main(args: Array[String]): Unit = {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(s"${pascal(col, row)} ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =  if(c==0|| c==r) 1 else pascal(c-1,r-1)+pascal(c,r-1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def balanceI(chars: List[Char],count: Int): Boolean={

      if (chars.isEmpty&& count!=0) false else if (chars.isEmpty&& count==0) true else
        if (chars.head =='(' && count>=0) balanceI(chars.tail,count+1)
        else if (chars.head ==')' ) balanceI(chars.tail,count-1) else balanceI(chars.tail,count) } : Boolean

    balanceI(chars,0)
  } : Boolean

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {


    if( coins.isEmpty || money<0)  0 else(
    if(money==0) 1 else countChange(money-coins.head,coins) + countChange(money,coins.tail))


  }: Int
}
