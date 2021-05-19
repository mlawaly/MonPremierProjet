import Personne._
import java.text._
import java.util.Calendar
import java.util.Date
import scala.collection.immutable

object HelloWorld {

  def main(args: Array[String]): Unit = {
    val text :String = "Hello, mon premier programme en scala"
    val test = println(text)
    println("Chaine")

    val maman = Personne("BOUKARI", "Maman Lawaly", 35, "Niger", 2.50)
    val issa = Personne("ISSA", "DAN Gaourou", 40, "Nigeria", 2.5)
      println("l'age est de "+issa.salaire)
    val som = println("La somme est: "+calculSomme(13, 20))
    som
    maCollection()
  }
  def calculSomme(a : Int, b : Int) : Int = {
    val resultat = a + b
    return resultat
  }

 /* def fonctionPersonne(nom : String, prenom : String, date : String, nationalite : String) : Personne = {
    var formater = new SimpleDateFormat("dd-MM-yyyy")
    var dateNais = formater.parse(date)
    val c = Calendar.getInstance()

    year1 = c.getWeekYear
    c.setTime(dateNais)
    year2 = c.getWeekYear
    val age = year1 - year2
    print(age)
    return Personne
  }*/
  def maCollection() : Unit = {
    val maliste = List("Lawaly", "Maman", "Pays")
    val maliste2 : List[String] = List("Lundi", "Mardi")
    maliste.foreach(f =>println(f.toUpperCase))

    val masequence : Seq[String] = Seq("Boukari", "Kone", "Issa", "Yao", "Saa", "Ilboudo", "Mariam")
    val nbreSeq = masequence.map(f => f.length)
    nbreSeq.foreach(f => println(f))
    val maseq = masequence.filter(_.length > 3)
    maseq.foreach(f => println(f))
  // Les map
    val monMap : Map[String, String] = Map(
      "cc" -> "Cocody",
      "yy" -> "Yop",
      "baby" -> "Abidjan"
    )
    val maCom = monMap.toList
    maCom.foreach(l => print(l))

    val montableau : Array[String] = Array("Syllah", "Mamane")
  }
}
