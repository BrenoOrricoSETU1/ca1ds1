package org.example;

public class PlotList {
    private PlotNode head;

    public void addPlot(Plot plot){
        PlotNode newNode = new PlotNode(plot);
        if(head == null){
            head = newNode;
        } else {
            PlotNode current = head;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public PlotNode getHead(){
        return head;
    }

}
