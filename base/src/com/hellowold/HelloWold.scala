package com.hellowold

object HelloWold {

  def testApply(): Unit = {
    var result = "hello wolrd!";
    var a = result(6);
    println(a);


    var b =  result.apply(6)
    println(b);

//    var append = "sb12".intersect("sb");
//    println(append)

    println(1 to 10)
  }

  def main(args: Array[String]): Unit = {
    println("hello wolrd")

    testApply()
  }
}
