class basescala {
  case class Flight(DEST_COUNTRY_NAME: String,
                    ORIGIN_COUNTRY_NAME: String,
                    count: BigInt)

  val flightDF : Flight = new Flight ("Cameroun", "Dubai", 10)
  println(flightDF)
  println(flightDF.ORIGIN_COUNTRY_NAME)
  val liste:List[Int] = List(1, 2, 3, 10, 15)
  println(liste)
  val noms = List("Maman","Lawaly","BOUKARI")
  val nums = List.range(0, 10)
  for (i <- nums) {print(i)}
  for (nom <-noms){
    println(nom)
  }

}
