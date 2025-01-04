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
            return;
        }

        head.setNext(temp);
        temp.setPrev(head);
        first.setPrev(temp);
        temp.setNext(first);
        head = temp;
        size++;

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
            /*while (flag) {
                if ((counter == index && (counter % size) != 0) || index == 0 || index == size - 1) {
                    size--;
                    temp.setPrev(temp.getNext());
                    temp.setNext(temp.getPrev());
                    flag = false;
                    System.out.println("removed correctly");
                }
                counter++;
            }*/

            while(temp.getNext() != first) {

                if (counter == index) {
                    temp.getNext().setPrev(temp.getPrev());
                    temp.getPrev().setNext(temp.getNext());
                    size--;
                    System.out.println("removed");
                    break;
                }
                temp = temp.getNext();
                counter++;
            }
        }

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int get(int index) {
        Node temp = first;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                return temp.getValue();
            }
            temp = temp.getNext();
        }
        return -1;
    }
}
