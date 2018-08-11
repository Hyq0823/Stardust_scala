package com.traits.withObj

/**
  * 指定某一个对象 混入trait(产生和其他对象不一样的行为)，而其他对象则没有
  */
class TraitWithObj {
}


trait logger{
  def log(msg :String){}
}

trait  MyLogger extends  logger{
  override def log(msg: String): Unit = {
    println(" my logger msg : " + msg)
  }
}


//注意，这里实现的是 logger而不是MyLogger
  //1) logger中提供了空的实现,所以p1并不会答应输出任何日志
//  2)而p2对象在创建实例的时候，混入了MyLogger，在mylogger中，对logger接口的方法实现了，故会打印日志

//class Person(name:String) extends logger

class Person(name:String) extends logger {
  def sayHi:Unit = {
    println("say hi to " + name)
    log("say hi is invoke")
  }
}

/**
  *
  * say hi to abc
  *
  * say hi to xyz
  * my logger msg : say hi is invoke
  */
object  testTraitWithObj{
  def main(args: Array[String]): Unit = {
    var p1 = new Person("abc")

    var p2 = new Person("xyz") with MyLogger

    p1.sayHi

    println()

    p2.sayHi
  }
}
