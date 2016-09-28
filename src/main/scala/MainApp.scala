
object MainApp extends App with ExampleTrait {
/*
  println("Hello World")
  printHelloWorld()

  val t8 = 1

  var tmp = "Hello world 3"

  val tmp2 = "Hello world 4"

  tmp = "HelloWorld5"

  println(tmp)

  val strList = Seq("1","2","3")

  val list2 = Seq("5","3","9")

  println(strList.mkString(","))

  val map = Map(1 ->"1", 2->"222", 3->"3", 2->"33")


  println(map(2))

  val (sum, min) = testTuple(100,50)

  println(s"$sum -  $min")

  val t9 = if(sum > 100) {
    1
  } else {
    2
  }

  println(t9)

  val tc = new TestClass(1,1)
  println(tc.tmp)

  def testTuple(a:Int, b:Int):(Int,Int) = {
    (a+b, a-b)
  }
  */

  for (a <- 1 to 5
    ) {
    println(a)
  }

/*
  while (){

  }
*/
/*
  lazy val t1 = testPrint()

  println("2")

  println(t1)

  def testPrint() = {
    println("1")
    5
  }
*/
}

trait ExampleTrait {

  def printHelloWorld() = println("Hello World 2")
}

class TestClass(a1:Int, a2:Int) {
  val tmp = TestClass.t8 + a1 + a2
}

object TestClass {
  val t8 = 7
}