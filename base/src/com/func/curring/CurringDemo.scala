package com.func.curring

class CurringDemo {

}

/**
  * 柯里化
  * 将原来接收两个参数的函数，转换为两个函数
  * 第一个函数：接收原来的第一个参数
  * 然后 返回 接收原先第二个参数的第二个函数
  *
  * 在函数调用的过程中，就变成了连续调用的方式
  */
object Test{

  def  sum(a:Int,b:Int) = a + b
  println(sum(1,1))


  def sum(a:Int) = (b:Int) => a + b
  println(sum(1)(1))


  def main(args: Array[String]): Unit = {

  }
}
