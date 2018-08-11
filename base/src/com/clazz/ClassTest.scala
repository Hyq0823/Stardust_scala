package com.clazz

class ClassTest {


  class Person

  class Student extends Person
  var p:Student = new Student

  /**
    * 模式匹配，类似于java的instanceOf ,不是精确判断，只要是目标类或者其子类
    */
  p match {
    case per:Person => println("person type")
    case _ => println("unknown type")
  }






}
