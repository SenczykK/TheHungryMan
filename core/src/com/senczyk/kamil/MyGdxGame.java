package com.senczyk.kamil;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Player player;
	GameMap gameMap;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		player = new Player();
		gameMap = new GameMap();
		//gameMap.setMapLevel(1);
		gameMap.mapLines.setLine(0,0,0,100);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		player.movement();

		//System.out.println("X: "+Float.toString(player.x)+" Y: "+Float.toString(player.y))
		batch.begin();

		int i=0;
		while(i<2){
			gameMap.sprite.setPosition(gameMap.mapLines.xStart, gameMap.mapLines.yStart);
		 	gameMap.sprite.draw(batch);
		 	if(gameMap.mapLines.isEnd()){
		 		i++;
			}
		 	gameMap.mapLines.changeStart();
		}

		player.sprite.draw(batch);

		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		gameMap.texture.dispose();
		player.texture.dispose();
	}
}
