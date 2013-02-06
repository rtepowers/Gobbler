package com.raypowers.gobbler;

import com.raypowers.framework.Screen;
import com.raypowers.framework.impl.AndroidGame;

public class Gobbler extends AndroidGame {
    public Screen getStartScreen() {
        return new LoadingScreen(this); 
    }
} 
