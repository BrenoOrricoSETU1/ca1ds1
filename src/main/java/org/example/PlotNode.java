package org.example;

public class PlotNode {
    private Plot data;
    private PlotNode next;

    public PlotNode(Plot data) {
        this.data = data;
        this.next = null;
    }

    public Plot getData(){
        return data;
    }

    public void setData(Plot data){
        this.data = data;
    }

    public PlotNode getNext(){
        return next;
    }

    public void setNext(PlotNode next){
        this.next = next;
    }
}
