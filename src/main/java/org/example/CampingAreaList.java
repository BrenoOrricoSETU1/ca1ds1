package org.example;

public class CampingAreaList {

    private CampingAreaNode head;

    public void addCampingArea(CampingArea campingArea){
        CampingAreaNode newNode = new CampingAreaNode(campingArea);
        if(head == null){
            head = newNode;
        } else {
            CampingAreaNode current;
            for (current = head; current.getNext() != null; current = current.getNext()) {
            }
            current.setNext(newNode);
        }
    }

    public String displayCampingArea(){
        String output = "";
        for(CampingAreaNode current = head; current != null; current = current.getNext()){
            output += current.getData() + "\n";
        }
        return output;
    }


}
