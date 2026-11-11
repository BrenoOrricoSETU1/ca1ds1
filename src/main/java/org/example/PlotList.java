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

    public Plot findPlotById(String id){
        PlotNode current = head;

        while(current != null){
            if(current.getData().getPlotId().equals(id)){
                return current.getData();
            }
            current = current.getNext();
        }
        return null;
    }

    public Plot findSuitablePlot(String prefType, boolean powered, double minSize, double minBedrooms, double budget) {
        PlotNode current = head;
        while (current != null){
            Plot plot = current.getData();
            if(plot.getType().equals(prefType) && plot.isPowered() == powered && plot.getSize() >= minSize && plot.getBedrooms() >= minBedrooms && plot.getCostPerNight() <= budget){
                return plot;
            }
            current = current.getNext();
        }
        return null;
    }

    public String displayPlots(){
        String output = "";

        for(PlotNode current = head; current != null; current = current.getNext()){
            Plot plot = current.getData();
            output += plot + "\n";
        }
        return output;
    }
}
