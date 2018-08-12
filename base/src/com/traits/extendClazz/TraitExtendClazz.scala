package com.traits.extendClazz

class TraitExtendClazz {

}

class Person{
  def name:String = "hyq";
  def log(name:String) = println(name)
}


/**
  * 类可以继承trait,trait也可以继承自类，这样的话，这个类会成为所有继承此trait的父类
  */
trait  childTrait extends Person{
  override def log(name: String): Unit = println("child name : " + name)
}


/**
  * 1）childTrait 继承自类Person
  * 2)youngChild 继承自这个trait,那么Person类成为了实现childTrait的父类
  */
class youngChild extends  childTrait{
}


object  test{
  def main(args: Array[String]): Unit = {
    var c = new youngChild
    c.log("hyq")
  }
}