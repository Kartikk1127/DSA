# Hashing
1. While declaring the hash array, it's size should be one more than the maximum value of the given array.  
2. For integers, hash array size can go up to 10^6(declared outside of main)
3. For boolean, hash array size can go up to 10^7(declared outside of main)
4. Tree Map's time complexity is O(log N)-stores everything in a sorted order.
5. Hash Map's best time complexity is O(1)-does not store in sorted order. In the worst case it might end up taking O(N) where there are collisions starting to happen.  
6. In case your solution with hash map gives TLE, try using Tree Map since it's best, average and worst case complexities are all same. 