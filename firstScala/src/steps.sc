object steps {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  1 + 1                                           //> res0: Int(2) = 2
if(20 > 10) "left" else "right"                   //> res1: String = left
println("The ultimate answer is " + 42)           //> The ultimate answer is 42
println("Hello world!")                           //> Hello world!
"hello world"                                     //> res2: String("hello world") = hello world
"hello world".toUpperCase                         //> res3: String = HELLO WORLD
1+2                                               //> res4: Int(3) = 3
"3".toInt                                         //> res5: Int = 3
// "foo".toInt --> error type int doesn't evalue a value
"abcd".take(2)                                    //> res6: String = ab
123.toShort                                       //> res7: Short = 123
"This is a Statement" split " "                   //> res8: Array[String] = Array(This, is, a, Statement)
"foo".take(1)                                     //> res9: String = f
// Method
"foo" take 1                                      //> res10: String = f
// operational style
1+2+3                                             //> res11: Int = 6
(1).+(2).+(3)                                     //> res12: Int = 6
//method style
1 + 2 + 3                                         //> res13: Int = 6
6                                                 //> res14: Int(6) = 6
42                                                //> res15: Int(42) = 42
true                                              //> res16: Boolean(true) = true
123L                                              //> res17: Long(123L) = 123
42.0                                              //> res18: Double(42.0) = 42.0
'a'                                               //> res19: Char('a') = a
"a"                                               //> res20: String("a") = a
val animals = Seq("cat", "dog", "penguin")        //> animals  : Seq[String] = List(cat, dog, penguin)
val sequence = Seq(1, 2, 3)                       //> sequence  : Seq[Int] = List(1, 2, 3)
}