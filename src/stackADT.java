import java.util.List;
import java.util.Stack;

public class stackADT {
    public Stack<Integer> createStack(){//tao phan tu
        Stack<Integer> number = new  Stack();
        List<String> cars = new Stack();
        number.push(2);
        number.push(3);
        number.push(4);
        number.push(5);
        number.push(6);
        return number;
    }
    public void displayStack(Stack<Integer> number){
        System.out.println("stack : "+ number);
    }
    public void removeElement (Stack<Integer> number){  //xoa phan tu
        number.pop();
        //xoa pphan tu tren dau
        System.out.println("stack after remove"+number);

    }
    public void loopElement(Stack<Integer> number){
        int size = number.size();
        for (int i = 0; i<size; i++){
            System.out.println("vaule of element is " + number.pop());
        }
    }
    public void peekElement(Stack<Integer> number){
        int num = number.peek();
        System.out.println("element remove" + num);
        System.out.println("stack after peek"+ number);
    }
    public void countElement(Stack<Integer> number){  //dem xem con bao nhien phan tu
        int count = number.size();
        System.out.println("so luong phan tu con la "+ count);
    }
    public void fineElement(Stack<Integer> stack, int number){  //tim xem phan tu co trong stack k
       int position = stack.search(number);
       if(position ==-1)
           System.out.println(number + "not found");
       else
           System.out.println(number + "found at position :" + position);
    }
    public void isEmptyStack(Stack<Integer> number){//kiem tra stack co rong k
        if(number.isEmpty())
            System.out.println("stack is empty");
        else
            System.out.println("stack is not empty");
    }
    public boolean isStackFull(Stack<Integer> number) {
        int maxSize = 5; // Assuming the maximum size of the Stack is 5
        return number.size() == maxSize;
    }

    public void testStackFull(Stack<Integer> number) {
        boolean isFull = isStackFull(number);
        if (isFull) {
            System.out.println("The stack is full.");
        } else {
            System.out.println("The stack is not full.");
        }
    }

}
