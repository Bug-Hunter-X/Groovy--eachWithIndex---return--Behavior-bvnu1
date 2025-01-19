```groovy
def methodWithBug(List<String> list) {
  list.eachWithIndex { String item, int index ->
    if (item == null) {
      println "Item at index $index is null"
      return // This will exit the EACH loop prematurely
    }
    println "Item at index $index is $item"
  }
}

List<String> myList = ["apple", null, "banana", "orange"]
methodWithBug(myList)
```