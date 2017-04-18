package edu.osu.cs362;

import java.util.*;

/**
 * Obtained from http://www.sanfoundry.com/java-program-implement-queue/.
 */
public class arrayQueue {
    protected int Queue[] ;
    protected int front, rear, size, len;

    /* Constructor */
    public arrayQueue(int n)
    {
        size = n;
        len = 0;
        Queue = new int[size];
        front = -1;
        rear = -1;
    }
    /*  Function to check if queue is empty */
    public boolean isEmpty()
    {
        return front == -1;
    }
    /*  Function to check if queue is full */
    public boolean isFull()
    {
        return front==0 && rear == size ;       //Bug Inserted: Changed from size -1 to size
    }
    /*  Function to get the size of the queue */
    public int getSize()
    {
        return len ;
    }
    /*  Function to check the front element of the queue */
    public int peek()
    {
        if (isEmpty())
            throw new NoSuchElementException("Underflow Exception");
        return Queue[front];
    }
    /*  Function to insert an element to the queue */
    public void insert(int i)
    {
        if (rear == -1)
        {
            front = 0;
            rear = 0;
            Queue[rear] = i;
        }
        else if (rear + 1 > size)               //Bug Inserted: Changed from >= to >
            throw new IndexOutOfBoundsException("Overflow Exception");
        else if ( rear + 1 < size)
            Queue[++rear] = i;
        len++ ;
    }
    /*  Function to remove front element from the queue */
    public int remove()
    {
        if (isEmpty())
            throw new NoSuchElementException("Underflow Exception");
        else
        {
            len-- ;
            int ele = Queue[front];
            if ( front == rear)
            {
                front = -1;
                rear = -1;
            }
            else
                front++;
            return ele;
        }
    }
    /*  Function to display the status of the queue */
    public void display()
    {
        System.out.print("\nQueue = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = front; i < rear; i++)      //Bug Inserted: Changed from <= to <
            System.out.print(Queue[i]+" ");
        System.out.println();
    }
}
