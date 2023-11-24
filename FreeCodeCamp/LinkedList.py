class Node:
    data = None
    next_node = None

    def __init__(self, data):
        self.data = data

    def __repr__(self):
        return f"<Node Value: {self.data}>"





class LinkedList:
    def __init__(self):
        self.head = None
    
    def isEmpty(self):
        return self.head == None
    
    def size(self):
        count = 0
        current_node = self.head
        while current_node.next_node != None:
            count += 1
            current_node = current_node.next_node
        return count






# Calling functions down here
n1 = Node(10)
n2 = Node(20)
n1.next_node = n2
print(n1)