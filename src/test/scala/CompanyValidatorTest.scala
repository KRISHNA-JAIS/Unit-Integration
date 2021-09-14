
import Company.Knoldus.Validators.CompanyValidator
import Company.Knoldus.Models.Company
import org.scalatest.flatspec.AnyFlatSpec

class CompanyValidatorTest extends AnyFlatSpec {
  "Company Name" should "exits" in{
    // Company should not already exist in the Database
    val companyObject = new CompanyValidator()
    val company =new Company("Nokia","abc@gmail.com","noida");
    val companys =new Company("Oppo","abc@gmail.com","UP");
    // Compare that company already exists in Database
    // Test case1
    assert(companyObject.companyIsValid(company)==false)
    // Test case2
    assert(companyObject.companyIsValid(companys)==false)
  }
}