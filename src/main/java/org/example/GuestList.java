package org.example;

public class GuestList {
    private GuestNode head;

    public void addGuest(Guest guest){
        GuestNode newGuest = new GuestNode(guest);

        if(head == null){
            head = newGuest;
        } else{
            GuestNode current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newGuest);
        }
    }

    public String displayGuest(){
        String output = "";

        for(GuestNode current = head; current != null; current = current.getNext()){
            Guest guest = current.getData();
            output += guest + "\n";
        }
        return output;
    }
}
