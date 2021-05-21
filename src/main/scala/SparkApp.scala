
import org.apache.spark.sql._
import org.apache.spark._

object SparkApp {
  def main(args: Array[String]): Unit = {
    sessionSpark()
  }
  def sessionSpark() : Unit = {
    System.setProperty("winutils", "C:\\Hadoop")
    val ss = SparkSession.builder()
      .master(master = "local[*]")
      .appName(name = "Ma premiere application") // nom de l'appli
      //.enableHiveSupport()// supporter des ecritures hive
      .getOrCreate()

    val rdd1 = ss.sparkContext.parallelize(Seq("Ma premiere application spark. Je suis un etudiant heureux"))
    rdd1.foreach(l => println(l))

    val df_1 = ss.read
      .format(source = "csv")
      .option("inferSchema", "true")
      .option("header", "true")
      .option("delimiter", ";")
      .csv(path = "C:\\Hadoop\\orders_csv.csv")
    df_1.show(numRows = 10)
    df_1.printSchema()
    df_1.createOrReplaceTempView(viewName = "orders")
    ss.sql(sqlText = "SELECT * FROM orders WHERE city = 'NEWTON'").show()


  }

}
