## Binary Search

Binary search is an efficient algorithm for finding a target value within a sorted array. The basic idea is to repeatedly divide the array in half. If the value of the target is less than the value in the middle of the interval, the search continues in the lower half; otherwise, it continues in the upper half. This process is repeated until the target value is found or the interval is empty.

- The array must be sorted before performing a binary search.
- divide the array into two halves
- compare the target value to the middle element
- if the target value is equal to the middle element, return the index
- if the target value is less than the middle element, repeat the search on the left half
- if the target value is greater than the middle element, repeat the search on the right half
- Time complexity: O(log n)