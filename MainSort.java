//kelly briceno
//stacks and queues assignemnt
public class MainSort {

 public static void main(String[] args) {
  //created linked list 
  System.out.println("Linked List");
  LinkedList list = new LinkedList();
  //adding items to linked list
  list.add(1);
  list.add(2);
  list.add(3);
  list.add(4);
  
 //calling print method
  list.print();
  //calling remove method
  list.remove(3);
  //calling print method
  list.print();
  //creating new stack
  System.out.println("\nStack");
  Stack stack = new Stack();
  //creating items in stack
  stack.push(1);
  stack.push(2);
  stack.push(3);
  stack.push(4);
  //call for print method
  stack.print();
  //call for pop method
  stack.pop();
  
  stack.print();
  stack.peek();
//creating new queue
  System.out.println("\nQueue");
  Queue queue = new Queue();
  //inseting items in queue
  queue.enqueue(1);
  queue.enqueue(2);
  queue.enqueue(3);
  queue.enqueue(4);
  
  queue.print();
  
  queue.dequeue();
  //calling print method 
  queue.print();
  queue.peek();
  
//stack 2 stack
  //creating new stack 
  Stack stackA = new Stack(); //creating new stack
    stackA = stack2stack(stack);
    stack.print();
    stack.print();
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stackA = stack2stack(stack);
    stackA.print();
    
     Stack emptystack = new Stack();
    stackA = stack2stack(emptystack);
    stackA.print();
  }
 //
  //method to transfer items from one stack to another
  public static Stack stack2stack(Stack startStack) {
    Stack endstack = new Stack();
    while (!startStack.isEmpty()) {
    
    }
    return(endstack);
  } 
  
  
  
  
 }
