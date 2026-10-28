package org.example;

public class CampsiteList {
    private CampsiteNode head;

    public void addCampsite(Campsite campsite) {
        CampsiteNode newNode = new CampsiteNode(campsite);
        if (head == null) {
            head = newNode;
        } else{
            CampsiteNode current;
            for(current = head; current.getNext() != null; current=current.getNext()){
            }
            current.setNext(newNode);
        }
    }

    public String displayCampsites(){
        String output = "";
        for(CampsiteNode current = head; current != null; current = current.getNext()){
            output += current.getData() + "\n";
        }
        return output;
    }
}
