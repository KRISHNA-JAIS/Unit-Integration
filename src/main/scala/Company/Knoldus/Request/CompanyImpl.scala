package Company.Knoldus.Request

import Company.Knoldus.Validators.CompanyValidator
import Company.Knoldus.Models.Company


class CompanyImpl(companyValidator: CompanyValidator) {
  def createCompany(company: Company): Option[String] = {
    if (companyValidator.companyIsValid(company)) Option(company.name)
    else None
  }
}
