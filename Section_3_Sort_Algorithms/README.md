# Sort Algorithms

## Bubble Sort

* Not a widely used algorithm as the performance degrades with size. 
But it is widely taught as a first sort routine.

* Partition into sorted and unsorted parts

* Large values bubble to the left (assuming low to high)

* In-place algorithm - we are not creating another array
* O(n^2) time complexity - quadratic
It will take 100 steps to sort 10 items, 10000 steps to sort 100 items, etc
* Algoritm degrades quickly

## Stable vs Unstable sort
* if you have duplicate values, will the relative ordering of duplicate items remain the same (**stable**) or will they flip (**unstable**)
* Stable sort is preferable. 
* Bubble sort is **stable**

## Selection Sort
* divides the array into sorted and unsorted partitions just like bubble sort (in-place algorithm)
* selection sort SELECTS the largest element in the unsorted partition and swaps it with the last element in the unsorted partition
* initially the largest element is the first element
* we compare each element, changing the index if it finds a larger element
* after the traversal, it swaps the last unsorted element with the largest unsorted element, that places the largest element in the correct sorted position
* cont this algorithm until all elements are in the sorted partition
* in-place algorithm
* O(n^2)
* Doesn't require as much swapping as bubble sort 
* **Unstable** algorithm