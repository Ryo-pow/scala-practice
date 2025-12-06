object OOPAdvancedExercise {

  class Shape {
    def getInfo(): Unit = {
      println("これは図形です")
    }
  }

  trait Loggable{
    def log(message: String): Unit = {
      println(s"[LOG] ${message}")
    }
  }

  class Rectangle(val width: Int, val height: Int) extends Shape with Loggable {
      def area(): Int = {
        width * height
      }
  }
  
  def main(args: Array[String]): Unit = {

    val rect = new Rectangle(width = 10, height = 5)

    rect.getInfo()

    println(s"面積: ${rect.area()}")
  }
}