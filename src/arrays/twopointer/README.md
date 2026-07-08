# 1. Move Zeroes

**Pattern:** Two Pointers (**Same Direction**)

## Logic
- Use **two pointers** moving in the **same direction**.
- `l` is the **read (traverse) pointer**.
- `r` is the **write pointer** that always points to the position where the next non-zero element should be placed.
- Traverse the array using `l`.
- Whenever `arr[l]` is non-zero, swap it with `arr[r]` and increment `r`.
- By the end of the traversal, all non-zero elements remain in their original order, and all zeros automatically move to the end.

## Key Points
- `l` → Read/Traverse Pointer
- `r` → Write Pointer
- If `l == r`, the swap happens with the same element, which is completely fine.
- The solution works **in-place**, so no extra array is required.

## Complexity
- **Time:** `O(n)`
- **Space:** `O(1)`

## Pattern Recognition
Use **Two Pointers (Same Direction)** when:
- You need to move specific elements to one side.
- The relative order of the remaining elements must stay the same.
- The problem asks for an **in-place** solution without using extra space.


# 2. Pair with Given Sum in a Sorted Array

**Pattern:** Two Pointers (**Opposite Direction**)

## Logic
- Use **two pointers** moving towards each other.
- `left` starts from the **beginning** of the array.
- `right` starts from the **end** of the array.
- Since the array is **sorted**, compare the sum of `arr[left] + arr[right]` with the target.
- If the sum is **less than** the target, move `left` forward to increase the sum.
- If the sum is **greater than** the target, move `right` backward to decrease the sum.
- If the sum equals the target:
    - If both pointer values are **different**, count all duplicate occurrences on both sides and add `leftCount × rightCount` to the answer.
    - If both pointers point to the **same value**, all remaining elements between them are identical. Count all possible pairs using the combination formula:
        - `n × (n - 1) / 2`
    - Move the pointers past all processed duplicate elements.

## Key Points
- `left` → Starts from the beginning.
- `right` → Starts from the end.
- The array **must be sorted**.
- Duplicates require special handling.
- If `arr[left] == arr[right]`, use the combination formula instead of counting one pair at a time.
- Count all duplicate pairs before moving the pointers.
- The solution works **in-place** without any extra data structure.

## Complexity
- **Time:** `O(n)`
- **Space:** `O(1)`

## Pattern Recognition
Use **Two Pointers (Opposite Direction)** when:
- The array is **sorted**.
- The problem asks to find a **pair** based on a target value (sum, difference, etc.).
- You need a better solution than `O(n²)`.
- You can decide which pointer to move based on the comparison between the current value and the target.

## Common Mistakes
- Counting only one pair when duplicate values exist.
- Forgetting the special case where `arr[left] == arr[right]`.
- Moving the pointers before counting all duplicate combinations.
- Using the normal Two Pointer approach, which works only for unique elements.

## Memory Trick
- **Sorted + Pair + Target** ⇒ Think **Two Pointers (Opposite Direction)**.
- Remember the three rules:
    - `sum < target` → `left++`
    - `sum > target` → `right--`
    - `sum == target` → Count all duplicate pairs, then move both pointers.