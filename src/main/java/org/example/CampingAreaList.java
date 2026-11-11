package org.example;

public class CampingAreaList {

    private CampingAreaNode head;

    public void addCampingArea(CampingArea campingArea){
        CampingAreaNode newNode = new CampingAreaNode(campingArea);
        if(head == null){
            head = newNode;
        } else {
            CampingAreaNode current = head;
            while (current.getNext() != null){
                current = current.getNext();
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

    public CampingAreaNode getHead(){
        return head;
    }


    public CampingArea findCampingAreaById(String id) {
        CampingAreaNode current = head;

        while (current != null) {
            if(current.getData().getAreaID().equalsIgnoreCase(id)){
                return current.getData();
            }
            current = current.getNext();
        }
        return null;
    }


}
