# Experiment 1 – JavaScript CRUD Operations on an Array

## Aim
To demonstrate *CRUD (Create, Read, Update, Delete) operations* on an array using JavaScript.

## Theory
- *CRUD* stands for:
  - *Create* → Insert elements into an array.
  - *Read* → Display all elements of the array.
  - *Update* → Modify elements at a specific index.
  - *Delete* → Remove elements from a specific index.
- Arrays in JavaScript are dynamic and allow easy manipulation using built-in methods like:
  - .push() → Add element at the end.
  - .splice() → Add/Remove elements.
  - Direct indexing (arr[index]) → Update an element.

## Steps
1. Initialize an empty array.
2. Implement create() function to insert values.
3. Implement read() function to display array contents.
4. Implement update() function to modify a value at a given index.
5. Implement remove() function to delete a value from a given index.
6. Demonstrate the functions using sample data.

## Source Code
You can view the full source code [here](./crud.js).

## Expected output
1. Create
2. Read
3. Update
4. Delete
5. Exit
Enter your choice: 1
Enter item to add: 20
Item added successfully!
1. Create
2. Read
3. Update
4. Delete
5. Exit
Enter your choice: 1
Enter item to add: 30
Item added successfully!
1. Create
2. Read
3. Update
4. Delete
5. Exit
Enter your choice: 1
Enter item to add: 40
Item added successfully!
1. Create
2. Read
3. Update
4. Delete
5. Exit
Enter your choice: 2
Items: 20, 30, 40
1. Create
2. Read
3. Update
4. Delete
5. Exit
Enter your choice: 3
Enter index to update (starting from 0): 0
Enter new value: 10
Item updated successfully!
1. Create
2. Read
3. Update
4. Delete
5. Exit
Enter your choice: 3
Enter index to update (starting from 0): 1
Enter new value: 50
Item updated successfully!
1. Create
2. Read
3. Update
4. Delete
5. Exit
Enter your choice: 3
Enter index to update (starting from 0): 2
Enter new value: 70
Item updated successfully!
1. Create
2. Read
3. Update
4. Delete
5. Exit
Enter your choice: 2
Items: 10, 50, 70
1. Create
2. Read
3. Update
4. Delete
5. Exit
Enter your choice: 4
Enter index to delete (starting from 0): 2
Item deleted successfully!
1. Create
2. Read
3. Update
4. Delete
5. Exit
Enter your choice: 2
Items: 10, 50
5. Exit
Enter your choice: 4
Enter index to delete (starting from 0): 2
Item deleted successfully!
1. Create
2. Read
3. Update
5. Exit
Enter your choice: 4
Enter index to delete (starting from 0): 2
Item deleted successfully!
5. Exit
Enter your choice: 4
Enter index to delete (starting from 0): 2
5. Exit
Enter your choice: 4
Enter index to delete (starting from 0): 2
Item deleted successfully!
1. Create
5. Exit
Enter your choice: 4
Enter index to delete (starting from 0): 2
Item deleted successfully!
1. Create
5. Exit
Enter your choice: 4
Enter index to delete (starting from 0): 2
Item deleted successfully!
1. Create
2. Read
Enter your choice: 4
Enter index to delete (starting from 0): 2
Item deleted successfully!
1. Create
2. Read
Item deleted successfully!
1. Create
2. Read
1. Create
2. Read
2. Read
3. Update
4. Delete
5. Exit
Enter your choice: 2
Items: 10, 50
1. Create
2. Read
3. Update
4. Delete
5. Exit
Enter your choice: 5
Exiting program...
