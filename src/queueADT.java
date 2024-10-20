import java.util.*;

public class queueADT {
    public Queue<String> createQueue() {
        Queue<String> color = new LinkedList<>();
        Queue<String> animal = new ArrayDeque<>();
        Queue<String> country = new PriorityQueue<>();
        color.add("red");
        color.add("blue");
        color.add("green");
        color.add("brown");
        color.add("black");
        return color;
    }
    public void showQueue(Queue<String> color){

        System.out.println("queue :" +color);
    }
    public void insertDataQueue(Queue<String> queue){
        queue.offer("while");
        queue.offer("pink");
        queue.offer("yellow");
        System.out.println("queue :" + queue);

    }
    public void checkSize(Queue<String> queue){
        int size = queue.size();  //kt kich thuoc
        System.out.println("size of queue is: "+ size);
    }

    public void checkEmpty(Queue<String> queue){
        boolean check = queue.isEmpty();
        if(check)
            System.out.println("queue is empty");
        else
            System.out.println("queue is not empty");
    }

    public void getElementQueue(Queue<String> queue){
        String element = queue.element();
        System.out.println("data element is "+ element);
    }
    public void getElementQueue2(Queue<String> queue){
        String data = queue.peek();
        System.out.println("data element is "+ data);
    }

    public void removeElement(Queue<String> queue){
        if ( queue.isEmpty()){
            System.out.println("queue is empty");
        }
        else {
            String data = queue.remove();
            System.out.println("data remove is " + data);
        }
    }
    public void removeElement2(Queue<String> queue){
        String data2 = queue.poll();
        System.out.println("data remove is "+ data2);
    }
    public void loopElement(Queue<String> queue){
        for (String item: queue){
            System.out.println("data item is : "+ item);
        }
    }
    public boolean isQueueFull(Queue<String> queue) {
        // Check if the queue has reached its maximum capacity
        if (queue.size() == 10) {
            return true;
        } else {
            return false;
        }
    }

    public void addToQueue(Queue<String> queue, String element) {
        // Check if the queue is full before adding an element
        if (isQueueFull(queue)) {
            System.out.println("Queue is full, cannot add more elements.");
        } else {
            queue.offer(element);
            System.out.println("Added '" + element + "' to the queue.");
        }
    }





}
