package com.func.closure

class closureDemo {

}


/**
  * 闭包： 函数变量不处于作用域时，仍能对其访问
  */
object closureObj{

  var speed = 3

  /**
    * 定义的run函数能够捕获 函数外的变量，而构成一个闭包
    * 捕获的是同一个变量，而不是拷贝
    * 在函数中对变量引起的改变，将直接影响到变量
    * @param name
    */
  def run(name:String):Unit={
    speed = speed + 3
    println("man " + name +" run with speed : " + speed)
  }


  def main(args: Array[String]): Unit = {
      run("hyq")
      println(speed)
  }
}
