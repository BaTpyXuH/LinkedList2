package com.company;

public class Main {

    public static double avg(List list) {

        int sum = 0;
        Node nodeTmp = list.getHead();
        while (nodeTmp != null) {
            sum += nodeTmp.getValue();
            nodeTmp = nodeTmp.getNextNode();


        }
        return ((double) sum / 6);
    }

    public static void main(String[] args) {

        Node node1 = new Node(5);
        List list = new List(node1);
        for (int i = 0; i < 6; i++) {
            list.push((int) (Math.random() * 25));
        }
        list.printList();
        System.out.println();
        System.out.println(avg(list));

    }

}




