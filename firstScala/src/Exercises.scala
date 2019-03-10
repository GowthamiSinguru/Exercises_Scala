/*** cat_o_matique***/
object Oswald {
  val colour: String = "Black"
  val food : String = "Milk"
}

object Henderson {
  val colour: String = "Ginger"
  val food : String = "Chips"
}

object Quentin {
  val colour: String = "Tabby and White"
  val food : String = "curry"
}

/*** Square Dance **/
object calc 
{
def square(x: Double) = (x) * (x)
def cube(x: Double) = (x) * square(x)
}

/**** Precise Square Dance ***/
object calc2
{
def square(x: Double) = (x) * (x)
def cube(x: Double) = (x) * square(x)
def square(x: Int) = (x) * (x)
def cube(x: Int) = (x) * square(x)
calc2.square(2.0)
calc2.cube(1)
}
//res : Double = 2.0
//res : Int = 1
/****** Greeting Human ***/
object person {
val firstName = "Gowthami"
val lastName = "Singuru"
}
object alien {
def greet(p: person.type) =
"Greetings Message, " + p.firstName + " " + p.lastName
alien.greet(person)
}
// res: String = Greetings Message, Gowthami Singuru


