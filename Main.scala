object HigherOrderFunctionExercise{

  def main(args: Array[String]): Unit = {

    val originalRates = List(1000, 1200, 1500, 2000)
    val newRates = originalRates.map { rate => rate * 130/100}
    
    println(s"30%増しの時給リスト: ${newRates}")

    val ages = List(15, 22, 17, 35, 18, 12)

    val adultAgesPlusFive = ages
    .filter{age => age >= 18}

    .map { age => age + 5}

    println(s"18歳以上に５歳加算したリスト： ${adultAgesPlusFive}")
  }
}