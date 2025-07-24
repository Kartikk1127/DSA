# Java Collections

1. Custom Classes
2. Collection
   1. List
      1. ArrayList
      2. LinkedList
      3. Stack
      4. Vector -- similar to the array list, but it is thread safe.
   2. Set
      1. HashSet -- doesn't guarantee that the elements will be stored in sorted order.(O(1))
      2. TreeSet -- guarantees that the elements stored would be in sorted order. (O(logN))
   3. Queue
      1. ArrayDequeue -- first in first out.
      2. LinkedList
      3. PriorityQueue -- by default it is a minimum heap data structure(this is a tree data structure)
3. Map
   1. HashMap
   2. TreeMap
4. Iterator
   1. ListIterator
5. Custom comparator
6. Common algorithms:
   1. Collections.sort(list)
   2. Collections.max(list)
   3. Collections.min(list)
   4. Collections.reverse(list)
   5. Arrays.sort(array)
   6. Collections.frequency(list, element)
   7. Collections.binarySearch(list, key)
   8. Math.pow(base, exponent