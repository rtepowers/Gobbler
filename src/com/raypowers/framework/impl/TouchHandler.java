package com.raypowers.framework.impl;

import java.util.List;

import android.view.View.OnTouchListener;

import com.raypowers.framework.Input.TouchEvent;

public interface TouchHandler extends OnTouchListener {
	
	public int getTouchX(int pointer);
	
	public int getTouchY(int pointer);
	
	public List<TouchEvent> getTouchEvents();

	public boolean isTouchDown(int pointer);

}
