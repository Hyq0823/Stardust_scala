package com.func.collectionOpreate

/**
  * 集合操作
  */
class CollectionOpreate {

}


object Test{


  /**
    * 在List中，如果只有一个元素，那么list.head就为这个元素，list.tail为Nil
    * 1) head代表list中的第一个元素
    * 2）tail代表list中的第一个元素之后的元素
    *
    * 3） :: 操作符可以将List合并
    */
  var list = List(1,2,3)



  def decorator(e:List[Int],prefix:String):Unit={
    if(e != Nil){
      println(prefix + e.head)
      decorator(e.tail,prefix)
    }
  }


  def main(args: Array[String]): Unit = {

    println(list.head)
    println(list.tail)
    println(list.tails)


    println("::操作符合并list")
    var newList = 0::list
    println(newList.foreach(println _))

    println("-------------------------两个list合并-------------------------")
    /**
      * List(1, 2, 3)
      * 0
      * 1
      * 2
      * 3
      * ()
      */
    var list3 = list::newList
    println(list3.foreach(println _))


    println("递归方式：给List中的每个元素加上前缀")
    decorator(List(1,2,3,4),"sb_")





  }






}

