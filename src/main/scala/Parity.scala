object Parity extends App {

  def calculate(list: List[Int]) : Int = {

    list match {
      case x :: Nil => x
      case _ => list.filterNot(_.abs != list.count(_.abs != 1)).head
    }
  }

}
