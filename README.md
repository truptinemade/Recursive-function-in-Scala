## Recursive-function-in-Scala

Recursion is a method which breaks the problem into smaller sub problems and calls itself for each of the problems

This is demonstarted by implementing Pascal's Triangle, Parenthesis Balancing etc problems using recursive process in scala 

Please refer RecFun.scala at src\main\scala\recfun path 

## Exercise 1: Pascal’s Triangle

The numbers at the edge of the Pascal’s triangle are all 1, and each number inside the triangle is the sum of the two numbers above it. 
In RecFun.scala, code after Exercise 1 comment computes the elements of Pascal’s triangle by means of a recursive process.

## Exercise 2: Parentheses Balancing

Code after exercise 2 comment in ReFun.scala implements a recursive function which verifies the balancing of parentheses in a string
For example, the function should return true for the following strings:
1. (if (zero? x) max (/ 1 x))
2. I told him (that it’s not (yet) done). (But he wasn’t listening)
The function should return false for the following strings:
1. :-)
2. ())(

## Exercise 2: Counting Change

Code after exercise 3 comment in ReFun.scala implements recursive function that counts how many different ways you can make change for an amount, given a list of coin denominations. For example, there are 3 ways to give change for 4 if you have coins with denomination 1 and 2: 1+1+1+1, 1+1+2, 2+2.
