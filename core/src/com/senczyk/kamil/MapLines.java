package com.senczyk.kamil;

public class MapLines {
    float xStart, yStart;
    float xEnd, yEnd;
    float xDrawDirection, yDrawDirection;

    MapLines(){

    }
    public void setLine(float x1, float y1, float x2, float y2){
        xStart=x1; yStart=y1; xEnd=x2; yEnd=y2;
        calculateDirection();
    }

    private void calculateDirection(){
        xDrawDirection=(xEnd-xStart)/20;
        yDrawDirection=(yEnd-yStart)/20;
    }

    public boolean isEnd(){
        if(xStart==xEnd && yStart==yEnd){
            return true;
            }
        else{
            return false;
        }
    }

    public void changeStart(){
        xStart=xStart+xDrawDirection;
        yStart=yStart+yDrawDirection;
    }
}
