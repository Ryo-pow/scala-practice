object ClassExercise{

  class Book(val title: String, val author: String){
    def printInfo(): Unit = {
      println(s"${title}by${author}")
    }
  }

  def main(args: Array[String]): Unit = {
    val book1 = new Book("吾輩は猫である","夏目漱石")
    val book2 = new Book("羅生門","芥川龍之介")

    book1.printInfo()
    book2.printInfo()
  }
}