package com.zte

import Fibonacci.FibnacciBuilder

object Launcher extends App{
  println("Please input a number: ")
  val index = readInt()
  println("Fibonacci(" + index.toString +") = " + start(index))

  def start(index: Int): String = {
    val start = System.nanoTime()
    val a = new FibnacciBuilder(index).getResult
    println("Compute times is: " + (System.nanoTime() - start).toString)
    a
  }
}
