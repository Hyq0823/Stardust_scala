package com.func.collectionOpreate

class LinkedListOpreate {

}

/**
  * 1)LinkedList可以使用elem引用其头部
  */
object LinkedListOpreate{


  /**
    * List中每个元素 *2
    */
  def func1()={
    val linkedList = scala.collection.mutable.LinkedList(1,2,3)
    var list = linkedList
    while(list != Nil){
      list.elem = list.elem * 2
      list = list.next
    }
    linkedList.foreach(println _)
  }


  /**
    * List中没隔一个元素 * 2
    */
  def func2() = {
    val sourceList = scala.collection.mutable.LinkedList(1,2,3,4,5,6,7)
    var list = sourceList

    var flag = true
    while (list != Nil){
      if(flag){
        list.elem = list.elem * 2
      }
      flag = !flag
      list = list.next
    }
    sourceList.foreach(println _)
  }



  def main(args: Array[String]): Unit = {
//    func1()
    func2()
  }
}
