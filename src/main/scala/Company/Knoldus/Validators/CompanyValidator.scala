package Company.Knoldus.Validators

import Company.Knoldus.Database.CompanyData
import Company.Knoldus.Models.Company

class CompanyValidator {

  def companyIsValid(company: Company): Boolean = {
    val cmp= new CompanyData()
    for((key,value)<-cmp.companies){
      if( key == company.name )
        return true
    }
    false
  }
}