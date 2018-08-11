package com.traits.chain

/**
  * 使用tarit实现类似调用链模式
  */
class TraitChain {


}

trait handler{
  def  hand(msg : String){}
}


trait AuthHandler extends  handler{
  override def hand(msg :String): Unit ={
    println("execute auth check ..." + msg)
    super.hand(msg)
  }
}

trait PermissionHandler extends handler{
  override def hand(msg: String): Unit = {
    println("permission check "+ msg)
    super.hand(msg)
  }
}

trait ParamHandler extends handler{
  override def hand(msg: String): Unit = {
    println("param check handler ...."+ msg)
    super.hand(msg)
  }
}


/**
  * 类继承同一个trait的实现，且实现中在结束末尾采用super调用父类方法时，会形成一个调用链条
  * 执行时，会从最右边开始执行
  * 倒序执行
  * param check handler ....hyq
  * permission check hyq
  * execute auth check ...hyq
  * uer say hi to :  hyq
  */
class User extends AuthHandler with  PermissionHandler with ParamHandler{
  def sayHi(name:String) = {
    hand(name)
    println("uer say hi to :  " + name)
  }
}

object testChain{
  def main(args: Array[String]): Unit = {
    var user = new User

    user.sayHi("hyq")
  }
}
