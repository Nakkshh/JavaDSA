# Move Zeroes

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