# LinkedList
Implementation of Linked List
Includes various operations of linked list in java:
##cost of reaching the node is always O(n) but the operation itself takes O(1)
- Insert O((n))
- Insert at beginning
- Insert at perticular index(O(n))
- Delete at particular index(O(n))
- Delete particular value(O(n))
- Print the linked list


Adding to either end of a linked list does not require a traversal, as long as you keep a reference to both ends of the list. This is what Java does for its add and addFirst/addLast methods.

Same goes for parameterless remove and removeFirst/removeLast methods - they operate on list ends.

remove(int) and remove(Object) operations, on the other hand, are not O(1). They requires traversal, so you correctly identified their costs as O(n).
