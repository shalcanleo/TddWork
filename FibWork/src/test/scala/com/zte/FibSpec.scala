package com.zte

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}

@RunWith(classOf[JUnitRunner])
class FibSpec extends FunSpec with Matchers {
  describe("Launcher Test") {
    it("F(0) should be 0 and F(1) should be 1"){
      val f0 = Launcher.start(0)
      val f1 = Launcher.start(1)
      f0 should be("0")
      f1 should be("1")
    }

    it("Should throw exception while index < 0"){
      try {
        val f = Launcher.start(-1)
        f should be("f")
      } catch {
        case e: Exception => {
          e.getMessage should be("Index of fibonacci must not less than 0!")
        }
      }
    }

    it("F(2) should be 1"){
      val f2 = Launcher.start(2)
      f2 should be("1")
    }

    it("F(n) should be F(n-1) + f(n-2) when n > 2"){
      val f10 = Launcher.start(10)
      val f11 = Launcher.start(11)
      val f12 = Launcher.start(12)
      f12 should be ((f10.toInt + f11.toInt).toString)
    }

    it("F(800) should be the given value") {
      val f800 = Launcher.start(800)
      f800 should be("69283081864224717136290077681328518273399124385204820718966040597691435587278383112277161967532530675374170857404743017623467220361778016172106855838975759985190398725")
    }
  }

}
