package com.clazz

object objTest{
class ProtectedClassTest {

}

  class Person {


    //Error:(17, 51) value name is not a member of com.clazz.objTest.Student
    //      print(name  + " make friends with " + other.name )

    //申明为protected和protected[this]完全不同
    //protected[this] 只能在当前子类对象中访问name属性，而不能在其他子类对象里面访问
    //protected[this] var name: String = "hyq"

    //而procted则都子类都能访问
    protected var name: String = "hyq"


    protected var age: Int = 24
  }

  class Student extends Person {
    def sayHi = printf(" hi " + name)

    def makeFriends(other:Student): Unit ={
      print(name  + " make friends with " + other.name )
    }
  }






  def main(args: Array[String]): Unit = {
    var s = new Student(){
      name = "hyq1"
      override def sayHi: Unit = print("hi you name is " + name)
    }
    var s2 = new Student(){
      name = "hyq2"
    }
    s.makeFriends(s2)
  }
}