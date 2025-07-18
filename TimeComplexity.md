# Understanding Time and Space Complexity

## Time Complexity
1. Time Complexity is not equal to the time take by your code to run on the machine.
2. This is because it is also dependent on the server on which the code is running and if you are running the code online on some ide it depends on the configurations of that server.
3. The bigger the input size, the longer the code takes to execute.
4. This increase in the time duration is dependent on the increase in the size of the input.
5. To find the rate of change: (input2-input1)/(time2-time1).
6. Now this rate of change would mostly be constant throughout. This rate of change is known as **Time Complexity**.

### Measuring Time Complexity

#### Big-O Notation
`for(i=1,i<=5,i++){
print(i)
}`

The number of operations happening above are around 15 in count. 
1. Every step is a unit operation(for instance: initializing i=1, doing a comparison, incrementing i).
2. On each step it does 3 operations, the steps are executed 5 times and hence 15 operations.
3. Hence, we can say the time complexity of the code is **O(15)**
4. Thereby, the general time complexity is **O(N)**
5. Rules while writing the complexities:
   1. Ignore the constants.
   2. Consider the worst cases.