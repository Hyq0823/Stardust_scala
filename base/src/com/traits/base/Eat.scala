package com.traits.base

trait Eat {

  def toEat(food :String) : Unit
}


trait  Moveable{
  def  run(tool :String) : Unit
}


/**
  * 2) trait中可以不只是抽象方法，也可以有所有组件都公用的方法，
  */
trait Logger{
  def log(msg : String = " no msg"): Unit ={
    println("begin log ....." + msg)
  }
}

/**
  * 3) trait中可以定义fileld,和类中定义的field不同的是：
  *    类中，子类是获取定义在父类中的field
  *    而trait实现类中，是拷贝的一份,并且是在多个方法中共享的
  */
trait world{
  var num = 1
}


/**
  * 1) trait可以作为接口使用，子类第一个接口是通过extends，从第二个开始，是使用with
  */
class Man extends Eat with Moveable with  Cloneable  with Serializable with Logger with world {

  override def toEat(food : String) : Unit = {
    log()
    println("man eat " + food)
    println("toeat world num is : " + num)
    println()
  }

  override def run(tool : String) : Unit = {
    log()
    println("man use tool : " + tool)
    num = 2
    println("world num is " + num)
    println()
  }
}

object testTrait{
  def main(args: Array[String]): Unit = {
  var man = new Man
  man.run("foot")
  man.toEat("apple")

  }
}



