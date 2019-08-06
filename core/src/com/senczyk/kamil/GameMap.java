package com.senczyk.kamil;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class GameMap {

    Texture texture;
    MapLines mapLines;

    Sprite sprite;

    GameMap(){
        texture = new Texture("wall.png");
        sprite = new Sprite(texture);
        mapLines = new MapLines();
    }

    public void setMapLevel(int i){
        /*if(i==1) {
            mapLines[0].setLine(0, 0, 0, 1000);
            mapLines[1].setLine(0, 0, 1000, 0);
        }
        else{
            mapLines[0].setLine(0, 0, 0, 1000);
            mapLines[1].setLine(0, 0, 1000, 0);
        }*/
        //mapLines.setLine(0, 0, 0, 1000);
       // mapLines[1].setLine(0, 0, 1000, 0);
    }
}
