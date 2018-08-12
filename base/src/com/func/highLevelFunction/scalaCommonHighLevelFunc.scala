package com.func.highLevelFunction

/**
  * scala常用变长参数
  */
class scalaCommonHighLevelFunc {



}
object  test{

  def main(args: Array[String]): Unit = {


    println("======map映射================")
    //map映射
    var array = Array(1,2,3).map(_+1)
    for (elem <- array) {
      print(elem)
    }
    println()
    println("======当函数只有一个参数，并且再函数体中，只使用一次时，可以用下划线代替================")
    //当函数只有一个参数，并且再函数体中，只使用一次时，可以用下划线代替
    (1 to 10).map(_*10).foreach(name => print(name + " "))
    (1 to 10).map(_*10).foreach(print _)
    println()

    println("filter过滤元素,2的倍数....")

    (1 to 20).filter(_%2 ==0).foreach( println _)

    println()
    println("reduce 操作.....")
    println((1 to 10).reduce(_+_))
    println((1 to 10).reduceRight(_+_))
    println((1 to 10).reduceRight(_+_))

    println()
    println("sort 操作.....")
    (1 to 10).sortWith(_>_).foreach(println _)


  }

}