package Company.Knoldus.Validators

trait Calc {
  def Fib1(i : Int): Int
}
class Fibonacci extends Calc {
  def fib1( n : Int) : Int = n match {
    case 0 | 1 => n
    case _ => fib1( n-1 ) + fib1( n-2 )
  }

  override def Fib1(i: Int): Int = ???
}
