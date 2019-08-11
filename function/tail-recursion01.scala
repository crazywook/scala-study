var multi: Int = 1;

@annotation.tailrec
def pow(x: Int, n: Int, t: Int = 1): Long = {
  if (n < 1) t
  else pow(x, n-1, x * t)
}

println(s"pow(2, 3) ${pow(2, 3)}")