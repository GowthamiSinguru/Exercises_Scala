object Calculator {
  def main(args: Array[String]) {
  def calculator(operand1: String, operator: String, operand2: String):
Unit = {
def calcInternal(a: Int, b: Int) =
operator match {
case "+" => Some(a + b)
case "-" => Some(a - b)
case "*" => Some(a * b)
case "/" => divide(a, b)
case _ => None
}
val result =
readInt(operand1) flatMap { a =>
readInt(operand2) flatMap { b =>
calcInternal(a, b) map { result =>
result
}
}
}
result match {
case Some(number) => println(s"the result is numberic")
case None => println(s"Error evaluating $operand1 $operator $operand2")
}
}
}
}