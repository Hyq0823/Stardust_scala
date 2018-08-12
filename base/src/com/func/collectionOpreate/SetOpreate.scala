package com.func.collectionOpreate

class SetOpreate {

}


object SetOpreate{


  def main(args: Array[String]): Unit = {
    var set = Set(1,90,5,2,3)
    set.+(2)
    set += 1
    set +=4

    set.foreach(println _)


    println("-----------------------------有序LinkedHashSet-----------------------------")
    var linkedHashSet = scala.collection.mutable.LinkedHashSet("ios","app","android","ios")
    linkedHashSet.foreach(println _)


    println("-----------------------------sortedSet排序-----------------------------")
    var sortSet = scala.collection.mutable.SortedSet("b","x","y","z","h")
    sortSet.foreach(println _)

  }
}