class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def add_data(self, data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
        else:
            current = self.head
            while current.next:
                current = current.next
            current.next = new_node
        print(f"Data '{data}' has been added.")

    def insert_data(self, data, position):
        new_node = Node(data)
        if position == 0:
            new_node.next = self.head
            self.head = new_node
        else:
            current = self.head
            index = 0
            while current and index < position - 1:
                current = current.next
                index += 1
            if current is None:
                print("Invalid position.")
                return
            new_node.next = current.next
            current.next = new_node
        print(f"Data '{data}' has been inserted at position {position}.")

    def view_data(self):
        current = self.head
        data_list = []
        while current:
            data_list.append(current.data)
            current = current.next
        if data_list:
            print("LinkedList Data: " + " -> ".join(data_list))
        else:
            print("The LinkedList is empty.")

    def delete_data(self, data):
        current = self.head
        prev = None
        while current and current.data != data:
            prev = current
            current = current.next
        if current is None:
            print(f"Data '{data}' not found.")
            return
        if prev is None:
            self.head = current.next
        else:
            prev.next = current.next
        print(f"Data '{data}' has been deleted.")

# Interactive menu
ll = LinkedList()
while True:
    print("\nSimple Single LinkedList Program")
    print("1. Add Data")
    print("2. Insert Data")
    print("3. View Data")
    print("4. Delete Data")
    print("5. Exit")
    print("----------------------------")
    choice = input("Choose operation (1-5): ")

    if choice == "1":
        val = input("Enter data to add: ")
        ll.add_data(val)
    elif choice == "2":
        val = input("Enter data to insert: ")
        pos = int(input("Enter insert position (index starts from 0): "))
        ll.insert_data(val, pos)
    elif choice == "3":
        ll.view_data()
        cont = input("Do you want to continue? (y/n): ").lower()
        if cont != "y":
            print("Program stopped.")
            break
    elif choice == "4":
        val = input("Enter data to delete: ")
        ll.delete_data(val)
    elif choice == "5":
        print("Program stopped.")
        break
    else:
        print("Invalid choice. Please try again.")
