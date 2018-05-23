import org.scalatest._

class ParitySpec extends WordSpec with MustMatchers {

  "Parity" must {

    "Handle an empty list" in {
      Parity.calculate(Nil) mustEqual 0
    }

    "Accept a list of ints and return an int" in {
      Parity.calculate(List(1)) mustEqual 1
    }

    "Return an int that is unique" in {
      Parity.calculate(List(1,1,2,2,3)) mustEqual 3
    }

    "Handle negative numbers" in {
      Parity.calculate(List(-2, -1, 1, 2))
    }

  }

}
