import Company.Knoldus.Validators.CompanyValidator
import Company.Knoldus.Models.Company
import org.scalatest.flatspec.AnyFlatSpec

class UserValidatorTest extends AnyFlatSpec {
  "Company Name" should "exits" in{
    // Checks if Company exist in Database
    val companyObject = new CompanyValidator()
    val company =new Company("Knoldus","abc@gmail.com","noida");
    assert(companyObject.companyIsValid(company)==true)
  }
}