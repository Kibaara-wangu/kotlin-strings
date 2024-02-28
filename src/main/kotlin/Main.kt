fun main(){

    var name = "peter"
    var age = "24"
    var profession = "policeman"

    var statement = "$name who is $age years old is a $profession"
    println(statement)

    var fruit = "mango"
    println(fruit[0])
    println(fruit[2])
    println(fruit.first())
    println(fruit.indexOf("a"))
    println(fruit. indexOf("g"))

    var weight = 40.7
    println("i weigh" + weight)
    println(weight. toString() + "kgs is i weigh")

    var city ="Nairobi"
    var city2 ="kiambu"
    println(city==city2)
    println(city.equals(city2))
    println(city.uppercase())
    println(city.lowercase())

    var emptyString = ""
    var blankString = " "
    println(emptyString.isEmpty())
    println(blankString.isEmpty())

    println(emptyString.isBlank())
    println(blankString.isBlank())
    println(blankString.isBlank())

    val town = "kitale"
    println(town)
    println(town.trimStart())
    println(town.trimEnd())
    println(town.trim())

     var statement1 ="The blue bus overtook the black car"
    println(statement1.endsWith("car"))
    println(statement1.startsWith("car"))

    var statement2 ="The blue bus overtook the black car"
    println(statement2.split("a"))

    var dateNow ="2024-02-28"
    println(dateNow.split("-"))




}
fun greeting(name:String){
    println("hello, $name")
}


