package arith

object Interpreter {
  def interpret(t: Expr): Double = t match {
    case Add(t1, t2) => interpret(t1) + interpret(t2)
    case Sub(t1, t2) => interpret(t1) - interpret(t2)
    case Num(t) => t
  }
}
