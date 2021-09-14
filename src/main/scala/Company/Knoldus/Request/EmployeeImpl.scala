package Company.Knoldus.Request

import Company.Knoldus.Models.Employees
import Company.Knoldus.Validators.EmployeeValidator

class EmployeeImpl(employeeValidator: EmployeeValidator) {

  def createEmployee(employee: Employees): Option[String] = {
    if (employeeValidator.employeeIsValid(employee)) Option(employee.emailId)
    else None
  }
}
