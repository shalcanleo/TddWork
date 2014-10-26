package Fibonacci

import com.sun.jmx.snmp.SnmpUnsignedInt

class FibnacciBuilder(val index: Int) {
  def getResult: String = getFibonacciInt

  private def getFibonacciInt: String = {
    index match {
      case i: Int if List(0,1).contains(i) => index.toString
      case i: Int if i < 0 => throw new RuntimeException("Index of fibonacci must not less than 0!")
      case _ => calculateFib.toString
    }
  }

  private def calculateFib: BigInt = {
    var f1:BigInt = 0
    var f2:BigInt = 1
    var f3:BigInt = 0
    for (i <- 2 to index) {
      f3 = f1 + f2
      f1 = f2
      f2 = f3
    }
    f3
  }


}
