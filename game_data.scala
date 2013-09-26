object game_data {
  def fib(n:Int) : Int = {
    if (n<2) {
      n
    }else
    {
      fib(n-1) + fib(n-2)
    }
  }

  def time[A](a: => A) = {
		val now = System.nanoTime
		val result = a
		val micros = (System.nanoTime - now) / 1e6
		println("%f microseconds".format(micros))
		result
	}
}

class game_data {


}
