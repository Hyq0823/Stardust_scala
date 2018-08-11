package com.func

object FuncTest {

  /**
    * 1、定义一个函数
    * println 不能转%s，prinft可以转
    * @param name
    * @param age
    */
  def sayHi(name:String,age:Int) = {
    if(age >= 18){
      printf("%s,成年人咯!",name); //hyq,成年人咯!
      //println("%s,成年人咯!",name)  //(%s,成年人咯!,hyq)
    }else{
      printf("%s,未成年",name)
    }
  }


  /**
    * 2.单行函数
    * @param name
    */
  def sayHi(name:String) = printf("hi , " + name);


  /**
    * 3.在代码块中定义函数体
    *   tips:
    *     1）如果代码块中包含多行代码,则最后一行的返回值就是整个函数的返回值
    *     2）和java不同，scala不需要使用return返回
    * @param num
    */
   def sum(num : Int)={
     var sum = 0;
     for (i <- 1 to num){
       sum +=i;
     }
     printf(sum+"")
     sum
   }


  /**
    * 4.递归
    * @param n
    * @return
    */
  def fab(n:Int): Int ={
    if(n <= 1) 1

    else fab(n-1) + fab(n - 2)
  }


  /**
    * 5.默认参数
    * @param name
    * @param work
    */
  def defaultParamValueFunc(name:String,work:String = "programer") = {
    printf("hi ,%s,your work is %s",name,work);
  }


  /**
    * 6.可以变长参数，for循环实现类加
    *   0）调用：
    *     错误：print(dynamicParamFunc(1 to 10))
    *     正确：print(dynamicParamFunc(1 to 10:_*))
    *   1)使用序列调用可变长函数:
    * @param nums
    */
  def dynamicParamFunc(nums : Int*) : Int = {
    var sum = 0
    for (num <- nums) sum+=num
    sum
  }


  /**
    *7. 使用递归实现类加
    * @param nums
    * @return
    */
  def dynamicParamFunc2(nums :Int*):Int ={
    if(nums.length == 0) 0
    else nums.head + dynamicParamFunc2(nums.tail:_*)
  }


  def main(args:Array[String]): Unit = {
    //var a = sayHi("hyq",24);
//    sayHi("hyq");

//    sum(5)
//    print(fab(4))

//    defaultParamValueFunc("hyq","enginer")


//    print(dynamicParamFunc(1 to 10))
    println(dynamicParamFunc(1 to 10:_*))
    println(dynamicParamFunc2(1 to 10:_*))

  }

}
