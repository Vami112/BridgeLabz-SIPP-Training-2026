public class CircularQueue {

    int[] data;
    int front;
    int count;

    CircularQueue(int size) {
        data = new int[size];
        front = 0;
        count = 0;
    }

    boolean enqueue(int value) {

        if (count == data.length)
            return false;

        data[(front + count) % data.length] = value;
        count++;

        return true;
    }

    int dequeue() {

        if (count == 0)
            return -1;

        int value = data[front];
        front = (front + 1) % data.length;
        count--;

        return value;
    }
}