package com.clazz

class abstractClazzDemo {

}


abstract class Person{
  def sayHi : Unit
  //抽象field
  val name : String
}



class Student extends Person {
  override def sayHi: Unit = println("s")

  //覆盖函数，同样必须使用def 定义
  //override sayHi:Unit= println("hi i'm student")
  override val name: String = "hyq"
}