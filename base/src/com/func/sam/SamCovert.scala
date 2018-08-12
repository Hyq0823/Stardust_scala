package com.func.sam

import java.awt.event
import java.awt.event.{ActionEvent, ActionListener}

import javax.swing.JButton


class SamCovert {

}

object Test{


  var button = new JButton()


  /**
    * type mismatch except actionListener actual ActionEvent:unit
    * 1）不能直接实现，会出现类型不匹配的情况
    */
  //  button.addActionListener((event:ActionEvent) =>event.toString)


  /**
    *1）原始做法
    */
  implicit def getActionListener(ActionProcessFunc:(ActionEvent) =>Unit) = new ActionListener {
    override def actionPerformed(e: event.ActionEvent): Unit = {
      ActionProcessFunc(e)
    }
  }
  button.addActionListener((e:ActionEvent) =>{
    println("click me ")
  })





  // 2)采用sam替换
//    button.addActionListener(new ActionListener {
//      override def actionPerformed(e: event.ActionEvent): Unit = {
//        println("click me")
//      }
//    })
  button.addActionListener((e: event.ActionEvent) => {
    println("click me" + e.getWhen)
  })



  def main(args: Array[String]): Unit = {

  }
}
