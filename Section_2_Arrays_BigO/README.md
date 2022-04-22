# Arrays and Big O Notation
Big O time complexity graph
https://en.wikipedia.org/wiki/Big_O_notation#/media/File:Comparison_computational_complexity.svg

time complexity - the number of steps to run an algorithm

We measure using worst case scenario

The main Big O time complexities covered in this course: (in order from fast to slow)
	1) O(1) which is constanct time
	2) O(logn) Logarithmic base 2
	3) O(n) Linear
	4) O(nlogn) n log-star n
	5) O(n^2) Quadratic


pronounced "o of 1" or "o of n"

Arrays are stored in one contiguous block in memory

ARRAYS AS A DATA STRUCTURE:
* contiguous block of memory
* specifing the length gives the size of the block of memory
* every element has the same size of memory; int's = 4 bytes
* Strings are objects and you are storing the object reference
* we can calculate the memory address of each element given the index
* if we know the index, finding the value in the element is O(1) - constant time complexity:
	address of array[i] = starting memory address + (index value * size of memory block)

ADVANTAGE: constant time complexity if you know index value
DISADVANTAGE: finding a specific value without knowing index - linear time complexity

OPERATION						TIME COMPLEXITY
Retrieve with index					O(1) constant time
Retrieve without index					O(n) linear time
Add an element to a full array				O(n)
Add an element to the end of an array (has space) 	O(1)
Insert or update an element at a specific index		O(1)
Delete an element by setting it to null			O(1)
Delete an element by shifting elements			O(n)