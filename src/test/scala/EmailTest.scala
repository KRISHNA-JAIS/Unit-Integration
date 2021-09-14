
import Company.Knoldus.Validators.Email
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.mockito.MockitoSugar

class EmailTest extends  AnyFunSuite with MockitoSugar{
  val x = new Email
  test("Email Testing")
  {
    val expectedResult = true;
    // Test case1
    val result = x.containsNoSpecialChars("AaBaCcD@.org");
    // Test case2
    val results = x.containsNoSpecialChars("xyz8@.com");
    assert(result == expectedResult)
    assert(results == expectedResult)
    println("Email Verified");
  }


}
