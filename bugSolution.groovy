```groovy
def methodWithBugFix(List<String> list) {
  list.eachWithIndex { String item, int index ->
    if (item == null) {
      println "Item at index $index is null"
      // Continue processing the rest of the list
    } else {
      println "Item at index $index is $item"
    }
  }
}

List<String> myList = ["apple", null, "banana", "orange"]
methodWithBugFix(myList)
```