package org.example;

public class CampsiteNode {
    private Campsite data;
    private CampsiteNode next;

    public CampsiteNode(Campsite data) {
        this.data = data;
        this.next = null;
    }

    public Campsite getData() {
        return data;
    }

    public void setData(Campsite data) {
        this.data = data;
    }

    public CampsiteNode getNext() {
        return next;
    }
    public void setNext(CampsiteNode next) {
        this.next = next;
    }
}
