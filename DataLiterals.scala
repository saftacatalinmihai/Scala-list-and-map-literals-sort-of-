trait ListLiteral {
  def @@[T](v: T*): List[T] = v.toList
}

trait MapLiteral {
  def %%[K,V]( t: (K, V)* ): Map[K,V] =
    t.foldLeft(Map[K,V]()) {case (acc, (k,v)) => acc + (k -> v)}
}

object DataLiterals extends ListLiteral with MapLiteral
