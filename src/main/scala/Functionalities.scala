

object Functionalities {


  def stringInterpolationAndList(inputList: List[Int]): Unit= {

    val result = for (index <- 0 until inputList.length) yield s"${index} = ${inputList(index)}"


    print(result.mkString("\n"))


  }

  def max(valueOne: Int, valueTwo: Int): Int = {
    if (valueOne > valueTwo) {
      valueOne
    }
    else {
      valueTwo
    }
  }

  def findMax(inputList: List[Int], length: Int): Int = {
    if (length == 1) {
      inputList(0)
    }
    else {
      max(inputList(length - 1), findMax(inputList, length - 1))
    }

  }


  def sum(value: Int): Int = {
    if (value != 0) {
      value % 10 + sum(value / 10)

    }
    else {
      0
    }
  }

  def sumOfFactorial(value: Int): Int = {
    val factorial_val: Int = factorial(value)
    sum(factorial_val)


  }

  def fibonaaci(pos: Int, first: Int, prev: Int): Int = {

    if (pos == 0) {
      first
    }

    else if (pos == 1) {
      prev
    }

    else {
      fibonaaci(pos - 1, prev, prev + first)
    }
  }

  def factorial(value: Int): Int = {
    if (value == 1) {
      1
    }
    else {
      value * factorial(value - 1)
    }
  }

}
