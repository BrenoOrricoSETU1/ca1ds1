package org.example;

public class CampingAreaNode {

    private CampingArea data;
    private CampingAreaNode next;

    public CampingAreaNode(CampingArea data) {
        this.data = data;
        this.next = null;
    }

    public CampingArea getData(){
        return data;
    }

    public void setData(CampingArea data){
        this.data = data;
    }

    public CampingAreaNode getNext(){
        return next;
    }

    public void setNext(CampingAreaNode next){
        this.next = next;
    }
}
