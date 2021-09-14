import Company.Knoldus.Validators.EmailValidator
import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorTest extends AnyFlatSpec {
  "Company Name" should "exits" in{
    val obj =new EmailValidator()
    // Checks that Email is valid or not valid
    // Test case1
    assert(obj.isValid("abc@gmail.com")==true)
    // Test case2
    assert(obj.isValid("philips123@gmail.com")==true)
    // Test case3
    assert(obj.isValid("knoldus@gmail.com")==true)
    // Test case4
    assert(obj.existInDb("xyz@gmail.com")==false)
    //Test case5
    assert(obj.existInDb("philips123@gmail.com")==false)
    // Test case6
    assert(obj.existInDb("knoldus@gmail.com")==true)
    // Test case7
    assert(obj.existInDb("knol@gmail.com")==false)
    // Test case8
    assert(obj.existInDb("wxyz@gmail.com")==false)

  }
}

