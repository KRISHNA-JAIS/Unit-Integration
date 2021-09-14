import Company.Knoldus.Validators.Fibonacci
import org.scalatest.funsuite.AnyFunSuite

class FibonacciTest extends AnyFunSuite {
  val o = new Fibonacci
  test("Fibonacci Testing")
  {
    val ExpectedResult = 13
    val ExpectedResults = 21
    val result = o.fib1(7)
    val results = o.fib1(8)
    // Test case1
    assert(result == ExpectedResult)
    // Test case2
    assert(results == ExpectedResults)
    println("Both Equal");
  }


}
