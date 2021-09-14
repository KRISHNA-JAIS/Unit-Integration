package Company.Knoldus.Database

import Company.Knoldus.Models.Company

import scala.collection.immutable.HashMap

class CompanyData {

  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  val samsungCompany: Company = Company("Samsung", "samsung@gmail.com", "Noida")
  val companies: HashMap[String, Company] = HashMap("Knoldus" -> knoldusCompany, "Samsung" -> samsungCompany)

  def getCompanyByName(name: String): Option[Company] = companies.get(name)

}
