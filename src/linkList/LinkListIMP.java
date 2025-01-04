package linkList;

import interfacee.LinkListInterface;

import java.util.Scanner;

public class LinkListIMP implements LinkListInterface {

    private Node head = null;
    private Node first = null;
    private int size = 0;


    @Override
    public void add(int val) {
        Node temp = new Node();
        temp.setValue(val);
        if (head == null) {
            head = temp;
            first = temp;
            size++;
            System.out.println("just one item exsist & added." + temp.getPrev() + "  " + temp.getNext() + "  " + temp.getValue(size));
            return;
        }

        head.setNext(temp);
        temp.setPrev(head);
        first.setPrev(temp);
        temp.setNext(first);
        head = temp;
        size++;

        System.out.println(temp.getPrev() + "  " + temp.getNext() + "  " + temp.getValue(size));
    }

    @Override
    public void remove(int index) {
        Node temp = first;
        int counter = 0;
        boolean flag = true;
        if (head == null) {
            System.out.println("there is nothing to remove.");
            return;
        } else if (head == first) {
            System.out.println("just one item exsist & removed.");
            head = first = null;
            size--;
            return;
        } else {
            while (flag) {
                if ((counter == index && (counter % size) != 0) || index == 0 || index == size - 1) {
                    size--;
                    temp.setPrev(temp.getNext());
                    temp.setNext(temp.getPrev());
                    flag = false;
                    System.out.println("removed correctly");
                }
                counter++;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(temp.getPrev() + " " + temp.getValue(i) + " " + temp.getNext() + "\n");
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int get(int index) {
        Node temp = new Node();
        for (int i = 0; i < size; i++) {
            if (i == index) {
                return temp.getValue(index);
            }
        }
        return -1;
    }
}
