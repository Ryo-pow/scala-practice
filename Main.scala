val Pi = 3.14

object PatternMatchingExercise {
  case class Circle(radius: Double)
  case class Square(side: Double)

  def calculateArea(shape :Any): Double ={
    shape match {
      case Circle(r) => Pi * r * r
      case Square(s) => s * s
      case _ => 0.0
    }
  }

  def main(args: Array[String]): Unit ={

    val myCircle = Circle(5.0)

    val mySquare = Square(4.0)
    println(s"円の面積: ${calculateArea(myCircle)}")
    println(s"四角の面積: ${calculateArea(mySquare)}")
  }
}