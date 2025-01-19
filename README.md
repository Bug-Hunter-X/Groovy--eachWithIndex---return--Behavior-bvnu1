# Groovy `eachWithIndex` and Unexpected `return` Behavior

This repository demonstrates a common, yet subtle, error in Groovy when using the `eachWithIndex` method.  The `return` statement within the closure does *not* stop the iteration of the entire list; it only exits the current closure execution.

The `bug.groovy` file showcases the problem.  The solution, `bugSolution.groovy`, provides a corrected approach.