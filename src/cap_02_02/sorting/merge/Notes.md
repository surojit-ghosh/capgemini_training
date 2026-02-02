### Merge Sort
- A divide-and-conquer algorithm that divides the array into halves, sorts each half, and then merges the sorted halves back together.
- Recursively splits the array until each sub-array contains a single element, then merges the sub-arrays in sorted order.
- Utilizes a helper function to merge two sorted arrays into one sorted array.

### Characteristics
- Time Complexity: O(n log n) in the average, worst, and best cases.
- Space Complexity: O(n) (requires additional space for the temporary arrays during merging).
- Stable: Yes (maintains the relative order of equal elements).