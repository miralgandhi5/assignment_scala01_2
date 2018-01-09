
object MainClass extends App {

  print(" \nString Interpolation And List 2. Find max in List 3. Fibonacci value 4. Sum of factorial")
  val firstMember = 10
  val secondMember = 20
  val thirdMember = 30
  val fourthMember = 40


  val demoList = List(firstMember, secondMember, thirdMember, fourthMember)

  Functionalities.stringInterpolationAndList(demoList)

  val maxInList = Functionalities.findMax(demoList, demoList.length)

  print (s" \n Max element in List $demoList is $maxInList")
  val position = 0
  val factorialNum = 5
  val valueInPos = Functionalities.fibonaaci(position, 0, 1)
  print ( s"\n Value  in position $position is $valueInPos " )
  val sumOfFact = Functionalities.sumOfFactorial(factorialNum)
  print( s" \n Sum of factorial of number $factorialNum is $sumOfFact " )


}
