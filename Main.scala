object AdvancedExercise {
    def calculateSalary(hourlywage: Int,workinghours: Int) = if (workinghours > 40){
        hourlywage * 40 + hourlywage * (workinghours -40) * 125 / 100
    } else{
        hourlywage * workinghours
    }


    def main(args: Array[String]): Unit = {
    
        val hourlywage = 1000
        val workinghours = 45
        val salary = calculateSalary(hourlywage, workinghours)
        println(s"時給 ${hourlywage}円で ${workinghours}時間働いた総支給額 ${salary}円")

        val oddSquares = for {
            i <- 1 to 10
            if (i % 2 != 0) 
        }yield i * i

        println(s"奇数の二乗リスト： ${oddSquares}")
    }
}