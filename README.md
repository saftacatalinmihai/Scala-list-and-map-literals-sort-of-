# Scala list and map literals ... sort of

Usage:
```
import DataLiterals._

@@(1, 2, 3, %%(1 -> 2, 3 -> 4))      // res0: List[Any] = List(1, 2, 3, Map(1 -> 2, 3 -> 4))

val names = @@("Foo", "Bar", "Baz")  // names: List[String] = List(Foo, Bar, Baz)
val color_of = %%(                   // color_of: Map[String,String] = Map(apple -> red, orange -> orange, grape -> purple)
   "apple"  -> "red",
   "orange" -> "orange",
   "grape"  -> "purple"
)                                                           

val mapOfLists = %%(                 // mapOfLists: Map[String,List[Int]] = Map(4 -> List(4, 8), 5 -> List(5), 1 -> List(1, 2, 3, 4, 5, 6, 7, 8, 9), 2 -> List(2, 4, 6, 8), 3 -> List(3, 6, 9))
  "1" -> @@(1,2,3,4,5,6,7,8,9),
  "2" -> @@(2,4,6,8),
  "3" -> @@(3,6,9),
  "4" -> @@(4,8),
  "5" -> @@(5)
)

```
