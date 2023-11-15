# What is an Algorithm?
An algorithm is a defined set of sequential instructions executed to perform a specific task. Key characteristics include:
- **Ordered Steps**: The sequence of operations is crucial.
- **Clarity**: Each step must be clear and unambiguous.
- **Finite Outcome**: It should produce a result within a finite time frame.
- **Non-Infinite**: It must terminate and not run indefinitely.

**Note**: Utilize established methods for common problems to avoid unnecessary effort in problem-solving.

# Comparing Algorithms
- Assess the number of operations or iterations in both the best and worst-case scenarios.

## Order of Growth
Refers to the rate at which the runtime of an algorithm increases as the size of the input increases, commonly expressed using Big O notation.

### Big O Notation
Represents the upper bound of the complexity in the worst-case scenario, providing a high-level understanding of the algorithm in terms of time or space complexity.

### Common Complexities
- **O(1)**: Constant Time - The execution time remains constant, irrespective of input size.
- **O(log n)**: Logarithmic Time - As the input size grows, the runtime increases logarithmically, leading to a flattened curve.

# Search Algorithms
1. **Linear Search**:
   - Iteratively checks each element.
   - Suitable for unsorted data.

2. **Binary Search**:
   - Requires sorted data.
   - Repeatedly divides the search interval in half.
   - Discards the half that surely does not contain the item.
