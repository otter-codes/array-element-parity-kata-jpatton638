object Parity extends App {

  def calculate(list: List[Int]) : Int = {

    list match {
      case Nil => 0
      case x :: Nil => x
      case _ => list.filterNot(_.abs != list.count(_.abs != 1)).head
    }
  }
}