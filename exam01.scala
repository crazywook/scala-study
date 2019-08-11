val name = ""

val matches = name match {
  case "" => "n/a"
  case input => input
}

// println(s"result $matches")

val amount: Double = 0

val result = if (amount > 0) "greater"
  else if (amount == 0) "same"
  else if (amount < 0) "less"

val result2 = amount match {
  case t if(t > 0) => "greater"
  case t if(t == 0) => "same"
  case t if(t < 0) => "less"
}

// println(s"result $result2")

val color = "magenta" // "cyan" "magenta" "yellow"
// val characters = color.toList

val range = 0 to 6

val characters = for(
  x <- range if color.size >= 6;
  p = color.charAt(x).toHexString
) yield p

// val characters = color.map(c => c.toHexString)
// println(s"characters ${characters.mkString(",")}")
// println(s"characters ${characters}")

// for( x <- 0 to 19; y <- 1 to 5)
//   print(s"${y + x*5}, ${ if (y == 5) "\n" else ""}")

for( i <- 1 to 100 )
{
  i match {
    case p if p % 5 == 0 && p % 3 == 0 => println("typesafe")
    case p if p % 3 == 0 => println("type")
    case p if p % 5 == 0 => println("safe")
    case p => println(p)
  }
}

