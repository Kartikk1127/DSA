# Recursion

A function when it calls itself is known as recursion.

## Base condition 
```func() { Base condition -> func() }```
If the base condition is met, the function call will not go further.

## Tail recursion 
Where first you do the job and then call the function  
Example: [TailRecursion.java](TailRecursion.java)

## Head recursion
Where first you call the function and then do the job.
Example: [HeadRecursion.java](HeadRecursion.java)

## Stack Overflow
Infinite function can lead to stack overflow error.  
If the base condition is never met, it leads to infinite recursion and hence stack overflow error.  

## Recursion Tree
Visualizing recursion in the form of a tree