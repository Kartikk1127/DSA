# Recursion

A function when it calls itself is known as recursion.

## Base condition 
```func() { Base condition -> func() }```
If the base condition is met, the function call will not go further.

## Tail recursion 
Where first you do the job and then call the function  
Example: [TailRecursion.java](TailRecursion.java)

## Head recursion -- also known as backtracking
Where first you call the function and then do the job. Involves backtracking.
Example: [HeadRecursion.java](HeadRecursion.java)

## Stack Overflow
Infinite function can lead to stack overflow error.  
If the base condition is never met, it leads to infinite recursion and hence stack overflow error.  

## Recursion Tree
Visualizing recursion in the form of a tree

## Time and Space Complexity
Time:: O(n)  
Space:: O(n)

## Recursion with Parameters
This is another way where you are not using any global values but are manipulating the parameters.

Let's say you are given a number n, you have to print all the numbers 1 to n. How will we do that?  
**Tail recursion**
```
func(i,n) {
    if(i>n) return
    print(i)
    func(i+1,n)
}
```

**Head Recursion**
```
func(i,n) {
    if(i>n) return
    func(i+1,n)
    print(i)
}
```

Can we do it without variable i?  

```
func(n) {
    if(n==0) return
    func(n-1)
    print(n)
}
```