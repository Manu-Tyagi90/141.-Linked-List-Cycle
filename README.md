# 141.-Linked-List-Cycle
Given head, the head of a linked list, determine if the linked list has a cycle in it.  There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is....

## Example 1:

![image](https://github.com/user-attachments/assets/b6af93d4-6e2f-4167-853b-bd2a694c4a77)

```
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
````
## Example 2:

![image](https://github.com/user-attachments/assets/4187743c-39fc-4256-906e-67afeaa398db)
```
Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
```
## Example 3:

![image](https://github.com/user-attachments/assets/7f482195-69dc-4295-b4b6-c4f36e411882)
```
Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
```
