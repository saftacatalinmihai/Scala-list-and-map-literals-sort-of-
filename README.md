# Scala-list-and-map-literals-sort-of-

Usage:
```
import DataLiterals._

@@(1, 2, 3, %%(1 -> 2, 3 -> 4))

val names = @@("Foo", "Bar", "Baz")
val color_of = %%(
   "apple"  -> "red",
   "orange" -> "orange",
   "grape"  -> "purple"
)

val mapOfLists = %%(
  "1" -> @@(1,2,3,4,5,6,7,8,9),
  "2" -> @@(2,4,6,8),
  "3" -> @@(3,6,9),
  "4" -> @@(4,8),
  "5" -> @@(5)
)

```
