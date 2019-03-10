object UniqueSeq {
def main(args: Array[String]) {
def insert(seq: Seq[Int], elt: Int): Seq[Int] = {
if(seq.contains(elt))
seq
else
elt +: seq
}
def unique(seq: Seq[Int]): Seq[Int] = {
seq.foldLeft(Seq.empty[Int]){ insert _ }
}
def reverse[A](seq: Seq[A]): Seq[A] = {
seq.foldLeft(Seq.empty[A]){ (seq, elt) => elt +: seq }
}
println("Unique" + unique(Seq(1,1,2,3,4,4)))
println("Reverse" + reverse(Seq(1,2,3,4,5,6)))
}
}