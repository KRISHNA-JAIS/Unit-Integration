import Company.Knoldus.Validators.Fibonacci
import org.scalatest.funsuite.AnyFunSuite

class FibonacciTest extends AnyFunSuite {
  val o = new Fibonacci
  test("Fibo")
  {
    val ExpectedResult = 13
    val ExpectedResults = 21
    val result = o.fib1(7)
    val results = o.fib1(8)
    assert(result == ExpectedResult)
    assert(results == ExpectedResults)
  }


}
