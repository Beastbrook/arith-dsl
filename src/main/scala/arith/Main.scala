package arith

object Main {
  def main(args: Array[String]): Unit = {
  	val expr = ArithParser.parse("24 - 45 + 31")
  	println(expr)
  	println(Interpreter.interpret(expr))
  }
}
