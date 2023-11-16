# What is an Algorithm?
An algorithm is a defined set of sequential instructions executed to perform a specific task. Key characteristics include:
- **Ordered Steps**: The sequence of operations is crucial.
- **Clarity**: Each step must be clear and unambiguous.
- **Finite Outcome**: It should produce a result within a finite time frame.
- **Non-Infinite**: It must terminate and not run indefinitely.

**Note**: Utilize established methods for common problems to avoid unnecessary effort in problem-solving.

# Comparing Algorithms
- Assess the number of operations or iterations in both the best and worst-case scenarios.
- Consider not just time complexity, but also space complexity.

## Order of Growth
Refers to the rate at which the runtime of an algorithm increases as the size of the input increases, commonly expressed using Big O notation.

### Big O Notation
Represents the upper bound of the complexity in the worst-case scenario, providing a high-level understanding of the algorithm in terms of time or space complexity.

### Common Complexities
- **O(1)**: Constant Time - The execution time remains constant, irrespective of input size.
- **O(log n)**: Logarithmic Time - As the input size grows, the runtime increases logarithmically, leading to a flattened curve.
- **O(n)**: Linear Time - Execution time grows linearly with input size.
- **O(n log n)**: Linearithmic Time - Combines linear and logarithmic growth.
- **O(n^2)**: Quadratic Time - Time complexity increases quadratically with input size.
- **O(n^3)**: Cubic Time - Complexity grows cubically with input size.
- **O(2^n)**: Exponential Time - Complexity doubles with each additional input element.
- **O(n!)**: Factorial Time - Complexity grows factorially based on input size.

### Additional Considerations
- **Best, Average, and Worst Case**: Evaluate algorithms in different scenarios.
- **Space Complexity**: How much memory an algorithm uses.

# Search Algorithms
1. **Linear Search**:
   - Iteratively checks each element.
   - Suitable for unsorted data.

2. **Binary Search**:
   - Requires sorted data.
   - Repeatedly divides the search interval in half.
   - Discards the half that surely does not contain the item.

3. **Depth-First Search (DFS)**:
   - Explores as far as possible along each branch before backtracking.
   - Common in tree or graph data structures.

4. **Breadth-First Search (BFS)**:
   - Explores all neighbors at the current depth before moving to nodes at the next depth level.
   - Useful in finding the shortest path on unweighted graphs.
