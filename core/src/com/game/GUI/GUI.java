package com.game.GUI;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Mazek27 on 26.03.2016.
 */
public class GUI {

    private static HpBar healthBar;
    private static SpBar spBar;
    private static ExpBar expBar;
    private static SkillBar skillBar;

    public GUI(){
        healthBar = new HpBar ();
        spBar = new SpBar ();
        expBar = new ExpBar();
        skillBar = new SkillBar();
    }

    public static void render(SpriteBatch batch, int aHP, int mHP, int skill){
        batch.begin();
        healthBar.drawBar (batch,mHP,aHP);
        spBar.drawBar (batch);
        expBar.drawBar(batch);
        skillBar.render(batch, skill);
        batch.end();
    }

}
