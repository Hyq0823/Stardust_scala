package com.func.functionalProgram

/**
  * 函数式编程
  */
class FunctionalProgramDemo {

}


/**
  *
  */
object FunctionalProgramDemoObj{
  def sayHi(name:String):Unit = {
    println("say hi to : " + name)
  }

  /*
  将函数赋值给一个 变量，则函数后，必须加 空格_
   */
  var obj = sayHi _

  /*
      将匿名函数赋值给变量
   */
  var anonymousFunctionObj = () => println("s");




  def main(args: Array[String]): Unit = {
    obj("hyq")

    anonymousFunctionObj()
  }

}