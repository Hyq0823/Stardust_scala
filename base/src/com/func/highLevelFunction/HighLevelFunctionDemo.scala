package com.func.highLevelFunction

/**
  * 高阶函数
  * 简单来说：  高阶函数，就是能够把函数当做参数 传递给其他函数，或者能够接收函数作为参数。
  */
class HighLevelFunctionDemo {

}
object HighLevelFunctionDemoObj{


  def sayHi(name:String):Unit = {
    println("hi " + name)
  }


  /**
    *1）函数作为参数   参数：函数名:(参数类型) ==> 返回值，参数名
    * @param func func:(String)=> Unit
    * @param name
    */
  def myFnction(func:(String)=> Unit,name:String)={
    func(name)
  }


  /**
    * 3)如果函数只有一个参数，并且在右侧的函数体中只使用一次，则可以将接收参数省略，并且将参数用 _代替
    */
  def triple(func:(Int) => Int)={func(3)}



  def main(args: Array[String]): Unit = {

    //错误用法
//    myFnction(sayHi("sb"),"ss")

    //正确
      myFnction(sayHi,"hyq")


    //2）高阶函数的类型推断
    myFnction((name:String) => {println("1 name : " + name)},"1")
    myFnction((name) => println("2 name: " + name),"2")
    myFnction(name => println("ss" + name),"hyq")



    //3)省略接收参数 ,如果函数参数只有一个，并且在右侧只使用一次，则可以使用下划线代替
        //初次学习差点和可变长参数序列搞混： 可变长参数 是 _* ,如果下划线代表变量，那么这个意思是变量有多个，即可变长序列
    //3 + 3
    println(triple(3 +_))

    //3 - 3
    println(triple(3 -_))

    //3 * 3
    println(triple(3 *_))

  }
}
