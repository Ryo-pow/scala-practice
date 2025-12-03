object CollectionExercise {
  
  def main(args: Array[String]): Unit = {
    
    // 類題1: タプルの作成とアクセス
    val itemInfo = ("Laptop", 120000, true)

    val (name, price, available) = itemInfo // タプルの要素を分解して val に格納してください
    
    println(s"商品名: ${name}, 価格: ${price}, 在庫: ${available}")
    // 類題2: リストの操作とループ
    val cities = List("Tokyo", "Osaka", "Kyoto") // List("Tokyo", ...) の形式でリストを定義してください
    
    // for式を使ってリストの要素を全て出力してください
    for (city <- cities){
      println(s"${city}を訪問")
    }
  }
}