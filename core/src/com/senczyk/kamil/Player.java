package com.senczyk.kamil;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Player {

    int healthPoints;
    float x, y, playerSpeed=10;
    int level;

    Texture texture;
    Sprite sprite;

    Player(){
        texture = new Texture("player.png");
        sprite = new Sprite(texture);
        sprite.setPosition(Gdx.graphics.getWidth()/2 - texture.getWidth()/2, Gdx.graphics.getHeight()/2 - texture.getHeight()/2);

        level=1;
    }

    public void movement(){
        if(Gdx.input.isKeyPressed(Input.Keys.W)){
            y=y-playerSpeed;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.S)){
            y=y+playerSpeed;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.A)){
            x=x-playerSpeed;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.D)){
            x=x+playerSpeed;
        }
    }
    public void setStartingPosition(float xStart, float yStart){
        x=xStart; y=yStart;
    }
}
