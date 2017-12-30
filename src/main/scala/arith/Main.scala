package arith

object Main {
  def main(args: Array[String]): Unit = {
  	val expr = ArithParser.parse("24 * 45 + 31")
  	println(expr)
  	println(Interpreter.interpret(expr)(Map()))
  	val expr2 = ArithParser.parse("let x = 24 * 45 in x + 31")
  	println(expr2)
  	println(Interpreter.interpret(expr2)(Map()))
  }
}
