def max(x: Int, y: Int, z: Int) = {

  def max(x: Int, y: Int) = if(x > y) x else y
  max(x, max(y, z))
}

println(s"max ${max(5,4,3)}")