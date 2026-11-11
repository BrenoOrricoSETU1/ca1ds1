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

    public Guest findGuestByName(String guestName){
        GuestNode current = head;
        while(current != null){
            if(current.getData().getGuestName().equalsIgnoreCase(guestName)){
                return current.getData();
            }
            current = current.getNext();
        }
        return null;
    }

    public Guest findGuestById(String guestId){
        GuestNode current = head;

        while(current != null){
            if(current.getData().getGuestId().equals(guestId)){
                return current.getData();
            }
            current = current.getNext();
        }
        return null;
    }

    public boolean removeGuestById(String guestId){
        if (head == null){
            return false;
        }
        if(head.getData().getGuestId().equalsIgnoreCase(guestId)){
            head = head.getNext();
            return true;
        }

        GuestNode current = head;
        while(current.getNext() != null){
            if(current.getData().getGuestId().equalsIgnoreCase(guestId)){
                current.setNext(current.getNext().getNext());
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
}
