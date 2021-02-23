class Animal(val hasVertebrae: Boolean = true) {
  def scratchBack = s"scratches"
}

// we can extend a single class or trait
// additional traits could be added only with WITH
class Frog extends Animal with Philosophical with HasLegs{
  override def toString: String = "greenie" // rewriting functionality of toString
  }

trait HasLegs {
  var legCount = 4
  // naming howFar is not perfect because we do not know the units
  def jump(howFar: Double) = s"Print jumps on all $legCount legs $howFar meters far"

}