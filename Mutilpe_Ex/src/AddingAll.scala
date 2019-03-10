object AddingAll {
def main(args: Array[String]) {
def addOptions(opt1: Option[Int], opt2: Option[Int], opt3: Option[Int
]) =
for {
a <- opt1
b <- opt2
c <- opt3
} yield a + b + c
}
}