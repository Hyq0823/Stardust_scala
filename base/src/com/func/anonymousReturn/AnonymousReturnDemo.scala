package com.func.anonymousReturn

class AnonymousReturnDemo {

}

object Test{


  /**
    * 外层函数
    *
    * why 改为 :  def sayHi(name:String):Unit 则无法获取到返回值？
    *
    * @param name
    */
  def sayHi(name:String):String = {

    /**
      * 内部匿名函数
      * 使用result的匿名函数，是必须指定返回值的
      * @param name
      * @return
      */
    def sayHello(name:String):String = {
//        println("i'm hi anonymous function," + name)
      //Error:(14, 7) method sayHello has return statement; needs result type
       return "i'm hi anonymous function," + name
//       "i'm hi anonymous function," + name
    }
    var a = sayHello(name)
    println(a)
    return a
  }

  def main(args: Array[String]): Unit = {
    println(sayHi("hyq"))
  }
}
