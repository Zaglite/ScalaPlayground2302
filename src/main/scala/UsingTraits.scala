object UsingTraits extends App {
  val kermit = new Frog
  kermit.philosophize
  println(kermit.jump(1.2))
  println(kermit)
  val axel = new Frog
  axel.philosophize
  println(axel.jump(30))
  axel.legCount = 2 // it could be changed since it is variable
  println(kermit.legCount, axel.legCount)

}
