
println(Console.YELLOW + s"Scala version = ${util.Properties.versionString}")

dotty.tools.dotc.config.Properties.versionString

runExample("Trait Params")(TraitParams.test())

trait Speaker {
  def speak: String
}
class Dog(name:String) extends Speaker {
  def speak: String = "Haf!"
}
// if I invoke the following, I get a compile error
val b = Dog("Bertik")
println(b.speak)
//println(b.speak()) // NOTE: I'm deliberately not using println(d.speak)
//for (i <- 0 to 4) println(b.speak(i))


