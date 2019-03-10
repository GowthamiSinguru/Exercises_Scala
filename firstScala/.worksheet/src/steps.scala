object steps {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(58); 
  println("Welcome to the Scala worksheet");$skip(8); val res$0 = 
  1 + 1;System.out.println("""res0: Int(2) = """ + $show(res$0));$skip(32); val res$1 = 
if(20 > 10) "left" else "right";System.out.println("""res1: String = """ + $show(res$1));$skip(40); 
println("The ultimate answer is " + 42);$skip(24); 
println("Hello world!");$skip(14); val res$2 = 
"hello world";System.out.println("""res2: String("hello world") = """ + $show(res$2));$skip(26); val res$3 = 
"hello world".toUpperCase;System.out.println("""res3: String = """ + $show(res$3));$skip(4); val res$4 = 
1+2;System.out.println("""res4: Int(3) = """ + $show(res$4));$skip(10); val res$5 = 
"3".toInt;System.out.println("""res5: Int = """ + $show(res$5));$skip(72); val res$6 = 
// "foo".toInt --> error type int doesn't evalue a value
"abcd".take(2);System.out.println("""res6: String = """ + $show(res$6));$skip(12); val res$7 = 
123.toShort;System.out.println("""res7: Short = """ + $show(res$7));$skip(32); val res$8 = 
"This is a Statement" split " ";System.out.println("""res8: Array[String] = """ + $show(res$8));$skip(14); val res$9 = 
"foo".take(1);System.out.println("""res9: String = """ + $show(res$9));$skip(23); val res$10 = 
// Method
"foo" take 1;System.out.println("""res10: String = """ + $show(res$10));$skip(27); val res$11 = 
// operational style
1+2+3;System.out.println("""res11: Int = """ + $show(res$11));$skip(14); val res$12 = 
(1).+(2).+(3);System.out.println("""res12: Int = """ + $show(res$12));$skip(25); val res$13 = 
//method style
1 + 2 + 3;System.out.println("""res13: Int = """ + $show(res$13));$skip(2); val res$14 = 
6;System.out.println("""res14: Int(6) = """ + $show(res$14));$skip(3); val res$15 = 
42;System.out.println("""res15: Int(42) = """ + $show(res$15));$skip(5); val res$16 = 
true;System.out.println("""res16: Boolean(true) = """ + $show(res$16));$skip(5); val res$17 = 
123L;System.out.println("""res17: Long(123L) = """ + $show(res$17));$skip(5); val res$18 = 
42.0;System.out.println("""res18: Double(42.0) = """ + $show(res$18));$skip(4); val res$19 = 
'a';System.out.println("""res19: Char('a') = """ + $show(res$19));$skip(4); val res$20 = 
"a";System.out.println("""res20: String("a") = """ + $show(res$20));$skip(43); 
val animals = Seq("cat", "dog", "penguin");System.out.println("""animals  : Seq[String] = """ + $show(animals ));$skip(28); 
val sequence = Seq(1, 2, 3);System.out.println("""sequence  : Seq[Int] = """ + $show(sequence ))}
}
